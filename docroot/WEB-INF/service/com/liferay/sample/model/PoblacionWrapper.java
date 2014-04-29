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

package com.liferay.sample.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Poblacion}.
 * </p>
 *
 * @author Moises Belda
 * @see Poblacion
 * @generated
 */
public class PoblacionWrapper implements Poblacion, ModelWrapper<Poblacion> {
	public PoblacionWrapper(Poblacion poblacion) {
		_poblacion = poblacion;
	}

	@Override
	public Class<?> getModelClass() {
		return Poblacion.class;
	}

	@Override
	public String getModelClassName() {
		return Poblacion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("poblacionId", getPoblacionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long poblacionId = (Long)attributes.get("poblacionId");

		if (poblacionId != null) {
			setPoblacionId(poblacionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this poblacion.
	*
	* @return the primary key of this poblacion
	*/
	@Override
	public long getPrimaryKey() {
		return _poblacion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this poblacion.
	*
	* @param primaryKey the primary key of this poblacion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_poblacion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the poblacion ID of this poblacion.
	*
	* @return the poblacion ID of this poblacion
	*/
	@Override
	public long getPoblacionId() {
		return _poblacion.getPoblacionId();
	}

	/**
	* Sets the poblacion ID of this poblacion.
	*
	* @param poblacionId the poblacion ID of this poblacion
	*/
	@Override
	public void setPoblacionId(long poblacionId) {
		_poblacion.setPoblacionId(poblacionId);
	}

	/**
	* Returns the company ID of this poblacion.
	*
	* @return the company ID of this poblacion
	*/
	@Override
	public long getCompanyId() {
		return _poblacion.getCompanyId();
	}

	/**
	* Sets the company ID of this poblacion.
	*
	* @param companyId the company ID of this poblacion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_poblacion.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this poblacion.
	*
	* @return the group ID of this poblacion
	*/
	@Override
	public long getGroupId() {
		return _poblacion.getGroupId();
	}

	/**
	* Sets the group ID of this poblacion.
	*
	* @param groupId the group ID of this poblacion
	*/
	@Override
	public void setGroupId(long groupId) {
		_poblacion.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this poblacion.
	*
	* @return the user ID of this poblacion
	*/
	@Override
	public long getUserId() {
		return _poblacion.getUserId();
	}

	/**
	* Sets the user ID of this poblacion.
	*
	* @param userId the user ID of this poblacion
	*/
	@Override
	public void setUserId(long userId) {
		_poblacion.setUserId(userId);
	}

	/**
	* Returns the user uuid of this poblacion.
	*
	* @return the user uuid of this poblacion
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poblacion.getUserUuid();
	}

	/**
	* Sets the user uuid of this poblacion.
	*
	* @param userUuid the user uuid of this poblacion
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_poblacion.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this poblacion.
	*
	* @return the user name of this poblacion
	*/
	@Override
	public java.lang.String getUserName() {
		return _poblacion.getUserName();
	}

	/**
	* Sets the user name of this poblacion.
	*
	* @param userName the user name of this poblacion
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_poblacion.setUserName(userName);
	}

	/**
	* Returns the create date of this poblacion.
	*
	* @return the create date of this poblacion
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _poblacion.getCreateDate();
	}

	/**
	* Sets the create date of this poblacion.
	*
	* @param createDate the create date of this poblacion
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_poblacion.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this poblacion.
	*
	* @return the modified date of this poblacion
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _poblacion.getModifiedDate();
	}

	/**
	* Sets the modified date of this poblacion.
	*
	* @param modifiedDate the modified date of this poblacion
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_poblacion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the description of this poblacion.
	*
	* @return the description of this poblacion
	*/
	@Override
	public java.lang.String getDescription() {
		return _poblacion.getDescription();
	}

	/**
	* Sets the description of this poblacion.
	*
	* @param description the description of this poblacion
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_poblacion.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _poblacion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_poblacion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _poblacion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_poblacion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _poblacion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _poblacion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_poblacion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _poblacion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_poblacion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_poblacion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_poblacion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PoblacionWrapper((Poblacion)_poblacion.clone());
	}

	@Override
	public int compareTo(com.liferay.sample.model.Poblacion poblacion) {
		return _poblacion.compareTo(poblacion);
	}

	@Override
	public int hashCode() {
		return _poblacion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.Poblacion> toCacheModel() {
		return _poblacion.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.Poblacion toEscapedModel() {
		return new PoblacionWrapper(_poblacion.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.Poblacion toUnescapedModel() {
		return new PoblacionWrapper(_poblacion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _poblacion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _poblacion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_poblacion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PoblacionWrapper)) {
			return false;
		}

		PoblacionWrapper poblacionWrapper = (PoblacionWrapper)obj;

		if (Validator.equals(_poblacion, poblacionWrapper._poblacion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Poblacion getWrappedPoblacion() {
		return _poblacion;
	}

	@Override
	public Poblacion getWrappedModel() {
		return _poblacion;
	}

	@Override
	public void resetOriginalValues() {
		_poblacion.resetOriginalValues();
	}

	private Poblacion _poblacion;
}