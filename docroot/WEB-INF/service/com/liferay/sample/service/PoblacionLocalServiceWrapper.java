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

package com.liferay.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PoblacionLocalService}.
 *
 * @author Moises Belda
 * @see PoblacionLocalService
 * @generated
 */
public class PoblacionLocalServiceWrapper implements PoblacionLocalService,
	ServiceWrapper<PoblacionLocalService> {
	public PoblacionLocalServiceWrapper(
		PoblacionLocalService poblacionLocalService) {
		_poblacionLocalService = poblacionLocalService;
	}

	/**
	* Adds the poblacion to the database. Also notifies the appropriate model listeners.
	*
	* @param poblacion the poblacion
	* @return the poblacion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.Poblacion addPoblacion(
		com.liferay.sample.model.Poblacion poblacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.addPoblacion(poblacion);
	}

	/**
	* Creates a new poblacion with the primary key. Does not add the poblacion to the database.
	*
	* @param poblacionId the primary key for the new poblacion
	* @return the new poblacion
	*/
	@Override
	public com.liferay.sample.model.Poblacion createPoblacion(long poblacionId) {
		return _poblacionLocalService.createPoblacion(poblacionId);
	}

	/**
	* Deletes the poblacion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param poblacionId the primary key of the poblacion
	* @return the poblacion that was removed
	* @throws PortalException if a poblacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.Poblacion deletePoblacion(long poblacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.deletePoblacion(poblacionId);
	}

	/**
	* Deletes the poblacion from the database. Also notifies the appropriate model listeners.
	*
	* @param poblacion the poblacion
	* @return the poblacion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.Poblacion deletePoblacion(
		com.liferay.sample.model.Poblacion poblacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.deletePoblacion(poblacion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _poblacionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.PoblacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.PoblacionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.sample.model.Poblacion fetchPoblacion(long poblacionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.fetchPoblacion(poblacionId);
	}

	/**
	* Returns the poblacion with the primary key.
	*
	* @param poblacionId the primary key of the poblacion
	* @return the poblacion
	* @throws PortalException if a poblacion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.Poblacion getPoblacion(long poblacionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.getPoblacion(poblacionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.liferay.sample.model.Poblacion> getPoblacions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.getPoblacions(start, end);
	}

	/**
	* Returns the number of poblacions.
	*
	* @return the number of poblacions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPoblacionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.getPoblacionsCount();
	}

	/**
	* Updates the poblacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param poblacion the poblacion
	* @return the poblacion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.Poblacion updatePoblacion(
		com.liferay.sample.model.Poblacion poblacion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacionLocalService.updatePoblacion(poblacion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _poblacionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_poblacionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _poblacionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PoblacionLocalService getWrappedPoblacionLocalService() {
		return _poblacionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPoblacionLocalService(
		PoblacionLocalService poblacionLocalService) {
		_poblacionLocalService = poblacionLocalService;
	}

	@Override
	public PoblacionLocalService getWrappedService() {
		return _poblacionLocalService;
	}

	@Override
	public void setWrappedService(PoblacionLocalService poblacionLocalService) {
		_poblacionLocalService = poblacionLocalService;
	}

	private PoblacionLocalService _poblacionLocalService;
}