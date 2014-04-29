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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Moises Belda
 * @generated
 */
public class PoblacionSoap implements Serializable {
	public static PoblacionSoap toSoapModel(Poblacion model) {
		PoblacionSoap soapModel = new PoblacionSoap();

		soapModel.setPoblacionId(model.getPoblacionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static PoblacionSoap[] toSoapModels(Poblacion[] models) {
		PoblacionSoap[] soapModels = new PoblacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PoblacionSoap[][] toSoapModels(Poblacion[][] models) {
		PoblacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PoblacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PoblacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PoblacionSoap[] toSoapModels(List<Poblacion> models) {
		List<PoblacionSoap> soapModels = new ArrayList<PoblacionSoap>(models.size());

		for (Poblacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PoblacionSoap[soapModels.size()]);
	}

	public PoblacionSoap() {
	}

	public long getPrimaryKey() {
		return _poblacionId;
	}

	public void setPrimaryKey(long pk) {
		setPoblacionId(pk);
	}

	public long getPoblacionId() {
		return _poblacionId;
	}

	public void setPoblacionId(long poblacionId) {
		_poblacionId = poblacionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _poblacionId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _description;
}