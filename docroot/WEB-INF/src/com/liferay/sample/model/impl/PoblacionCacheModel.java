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

package com.liferay.sample.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.sample.model.Poblacion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Poblacion in entity cache.
 *
 * @author Moises Belda
 * @see Poblacion
 * @generated
 */
public class PoblacionCacheModel implements CacheModel<Poblacion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{poblacionId=");
		sb.append(poblacionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Poblacion toEntityModel() {
		PoblacionImpl poblacionImpl = new PoblacionImpl();

		poblacionImpl.setPoblacionId(poblacionId);
		poblacionImpl.setCompanyId(companyId);
		poblacionImpl.setGroupId(groupId);
		poblacionImpl.setUserId(userId);

		if (userName == null) {
			poblacionImpl.setUserName(StringPool.BLANK);
		}
		else {
			poblacionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			poblacionImpl.setCreateDate(null);
		}
		else {
			poblacionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			poblacionImpl.setModifiedDate(null);
		}
		else {
			poblacionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (description == null) {
			poblacionImpl.setDescription(StringPool.BLANK);
		}
		else {
			poblacionImpl.setDescription(description);
		}

		poblacionImpl.resetOriginalValues();

		return poblacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		poblacionId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(poblacionId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long poblacionId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String description;
}