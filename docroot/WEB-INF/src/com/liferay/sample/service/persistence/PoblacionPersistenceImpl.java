/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sample.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.sample.NoSuchPoblacionException;
import com.liferay.sample.model.Poblacion;
import com.liferay.sample.model.impl.PoblacionImpl;
import com.liferay.sample.model.impl.PoblacionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the poblacion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Moises Belda
 * @see PoblacionPersistence
 * @see PoblacionUtil
 * @generated
 */
public class PoblacionPersistenceImpl extends BasePersistenceImpl<Poblacion>
	implements PoblacionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PoblacionUtil} to access the poblacion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PoblacionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
			PoblacionModelImpl.FINDER_CACHE_ENABLED, PoblacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
			PoblacionModelImpl.FINDER_CACHE_ENABLED, PoblacionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
			PoblacionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PoblacionPersistenceImpl() {
		setModelClass(Poblacion.class);
	}

	/**
	 * Caches the poblacion in the entity cache if it is enabled.
	 *
	 * @param poblacion the poblacion
	 */
	@Override
	public void cacheResult(Poblacion poblacion) {
		EntityCacheUtil.putResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
			PoblacionImpl.class, poblacion.getPrimaryKey(), poblacion);

		poblacion.resetOriginalValues();
	}

	/**
	 * Caches the poblacions in the entity cache if it is enabled.
	 *
	 * @param poblacions the poblacions
	 */
	@Override
	public void cacheResult(List<Poblacion> poblacions) {
		for (Poblacion poblacion : poblacions) {
			if (EntityCacheUtil.getResult(
						PoblacionModelImpl.ENTITY_CACHE_ENABLED,
						PoblacionImpl.class, poblacion.getPrimaryKey()) == null) {
				cacheResult(poblacion);
			}
			else {
				poblacion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all poblacions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PoblacionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PoblacionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the poblacion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Poblacion poblacion) {
		EntityCacheUtil.removeResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
			PoblacionImpl.class, poblacion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Poblacion> poblacions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Poblacion poblacion : poblacions) {
			EntityCacheUtil.removeResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
				PoblacionImpl.class, poblacion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new poblacion with the primary key. Does not add the poblacion to the database.
	 *
	 * @param poblacionId the primary key for the new poblacion
	 * @return the new poblacion
	 */
	@Override
	public Poblacion create(long poblacionId) {
		Poblacion poblacion = new PoblacionImpl();

		poblacion.setNew(true);
		poblacion.setPrimaryKey(poblacionId);

		return poblacion;
	}

	/**
	 * Removes the poblacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param poblacionId the primary key of the poblacion
	 * @return the poblacion that was removed
	 * @throws com.liferay.sample.NoSuchPoblacionException if a poblacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poblacion remove(long poblacionId)
		throws NoSuchPoblacionException, SystemException {
		return remove((Serializable)poblacionId);
	}

	/**
	 * Removes the poblacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the poblacion
	 * @return the poblacion that was removed
	 * @throws com.liferay.sample.NoSuchPoblacionException if a poblacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poblacion remove(Serializable primaryKey)
		throws NoSuchPoblacionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Poblacion poblacion = (Poblacion)session.get(PoblacionImpl.class,
					primaryKey);

			if (poblacion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPoblacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(poblacion);
		}
		catch (NoSuchPoblacionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Poblacion removeImpl(Poblacion poblacion)
		throws SystemException {
		poblacion = toUnwrappedModel(poblacion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(poblacion)) {
				poblacion = (Poblacion)session.get(PoblacionImpl.class,
						poblacion.getPrimaryKeyObj());
			}

			if (poblacion != null) {
				session.delete(poblacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (poblacion != null) {
			clearCache(poblacion);
		}

		return poblacion;
	}

	@Override
	public Poblacion updateImpl(com.liferay.sample.model.Poblacion poblacion)
		throws SystemException {
		poblacion = toUnwrappedModel(poblacion);

		boolean isNew = poblacion.isNew();

		Session session = null;

		try {
			session = openSession();

			if (poblacion.isNew()) {
				session.save(poblacion);

				poblacion.setNew(false);
			}
			else {
				session.merge(poblacion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
			PoblacionImpl.class, poblacion.getPrimaryKey(), poblacion);

		return poblacion;
	}

	protected Poblacion toUnwrappedModel(Poblacion poblacion) {
		if (poblacion instanceof PoblacionImpl) {
			return poblacion;
		}

		PoblacionImpl poblacionImpl = new PoblacionImpl();

		poblacionImpl.setNew(poblacion.isNew());
		poblacionImpl.setPrimaryKey(poblacion.getPrimaryKey());

		poblacionImpl.setPoblacionId(poblacion.getPoblacionId());
		poblacionImpl.setCompanyId(poblacion.getCompanyId());
		poblacionImpl.setGroupId(poblacion.getGroupId());
		poblacionImpl.setUserId(poblacion.getUserId());
		poblacionImpl.setUserName(poblacion.getUserName());
		poblacionImpl.setCreateDate(poblacion.getCreateDate());
		poblacionImpl.setModifiedDate(poblacion.getModifiedDate());
		poblacionImpl.setDescription(poblacion.getDescription());

		return poblacionImpl;
	}

	/**
	 * Returns the poblacion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the poblacion
	 * @return the poblacion
	 * @throws com.liferay.sample.NoSuchPoblacionException if a poblacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poblacion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPoblacionException, SystemException {
		Poblacion poblacion = fetchByPrimaryKey(primaryKey);

		if (poblacion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPoblacionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return poblacion;
	}

	/**
	 * Returns the poblacion with the primary key or throws a {@link com.liferay.sample.NoSuchPoblacionException} if it could not be found.
	 *
	 * @param poblacionId the primary key of the poblacion
	 * @return the poblacion
	 * @throws com.liferay.sample.NoSuchPoblacionException if a poblacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poblacion findByPrimaryKey(long poblacionId)
		throws NoSuchPoblacionException, SystemException {
		return findByPrimaryKey((Serializable)poblacionId);
	}

	/**
	 * Returns the poblacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the poblacion
	 * @return the poblacion, or <code>null</code> if a poblacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poblacion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Poblacion poblacion = (Poblacion)EntityCacheUtil.getResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
				PoblacionImpl.class, primaryKey);

		if (poblacion == _nullPoblacion) {
			return null;
		}

		if (poblacion == null) {
			Session session = null;

			try {
				session = openSession();

				poblacion = (Poblacion)session.get(PoblacionImpl.class,
						primaryKey);

				if (poblacion != null) {
					cacheResult(poblacion);
				}
				else {
					EntityCacheUtil.putResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
						PoblacionImpl.class, primaryKey, _nullPoblacion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PoblacionModelImpl.ENTITY_CACHE_ENABLED,
					PoblacionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return poblacion;
	}

	/**
	 * Returns the poblacion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param poblacionId the primary key of the poblacion
	 * @return the poblacion, or <code>null</code> if a poblacion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poblacion fetchByPrimaryKey(long poblacionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)poblacionId);
	}

	/**
	 * Returns all the poblacions.
	 *
	 * @return the poblacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poblacion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the poblacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.PoblacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of poblacions
	 * @param end the upper bound of the range of poblacions (not inclusive)
	 * @return the range of poblacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poblacion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the poblacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.PoblacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of poblacions
	 * @param end the upper bound of the range of poblacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of poblacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poblacion> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Poblacion> list = (List<Poblacion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POBLACION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POBLACION;

				if (pagination) {
					sql = sql.concat(PoblacionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Poblacion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Poblacion>(list);
				}
				else {
					list = (List<Poblacion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the poblacions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Poblacion poblacion : findAll()) {
			remove(poblacion);
		}
	}

	/**
	 * Returns the number of poblacions.
	 *
	 * @return the number of poblacions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_POBLACION);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the poblacion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.Poblacion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Poblacion>> listenersList = new ArrayList<ModelListener<Poblacion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Poblacion>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PoblacionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POBLACION = "SELECT poblacion FROM Poblacion poblacion";
	private static final String _SQL_COUNT_POBLACION = "SELECT COUNT(poblacion) FROM Poblacion poblacion";
	private static final String _ORDER_BY_ENTITY_ALIAS = "poblacion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Poblacion exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PoblacionPersistenceImpl.class);
	private static Poblacion _nullPoblacion = new PoblacionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Poblacion> toCacheModel() {
				return _nullPoblacionCacheModel;
			}
		};

	private static CacheModel<Poblacion> _nullPoblacionCacheModel = new CacheModel<Poblacion>() {
			@Override
			public Poblacion toEntityModel() {
				return _nullPoblacion;
			}
		};
}