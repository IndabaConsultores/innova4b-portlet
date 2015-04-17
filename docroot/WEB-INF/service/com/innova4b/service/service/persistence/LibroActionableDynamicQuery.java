/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.innova4b.service.service.persistence;

import com.innova4b.service.model.Libro;
import com.innova4b.service.service.LibroLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author aritz
 * @generated
 */
public abstract class LibroActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public LibroActionableDynamicQuery() throws SystemException {
		setBaseLocalService(LibroLocalServiceUtil.getService());
		setClass(Libro.class);

		setClassLoader(com.innova4b.service.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("libroId");
	}
}