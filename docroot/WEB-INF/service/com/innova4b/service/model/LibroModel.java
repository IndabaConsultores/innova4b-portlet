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

package com.innova4b.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Libro service. Represents a row in the &quot;innova_Libro&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.innova4b.service.model.impl.LibroModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.innova4b.service.model.impl.LibroImpl}.
 * </p>
 *
 * @author aritz
 * @see Libro
 * @see com.innova4b.service.model.impl.LibroImpl
 * @see com.innova4b.service.model.impl.LibroModelImpl
 * @generated
 */
public interface LibroModel extends BaseModel<Libro> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a libro model instance should use the {@link Libro} interface instead.
	 */

	/**
	 * Returns the primary key of this libro.
	 *
	 * @return the primary key of this libro
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this libro.
	 *
	 * @param primaryKey the primary key of this libro
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the libro ID of this libro.
	 *
	 * @return the libro ID of this libro
	 */
	public long getLibroId();

	/**
	 * Sets the libro ID of this libro.
	 *
	 * @param libroId the libro ID of this libro
	 */
	public void setLibroId(long libroId);

	/**
	 * Returns the titulo of this libro.
	 *
	 * @return the titulo of this libro
	 */
	@AutoEscape
	public String getTitulo();

	/**
	 * Sets the titulo of this libro.
	 *
	 * @param titulo the titulo of this libro
	 */
	public void setTitulo(String titulo);

	/**
	 * Returns the autor of this libro.
	 *
	 * @return the autor of this libro
	 */
	@AutoEscape
	public String getAutor();

	/**
	 * Sets the autor of this libro.
	 *
	 * @param autor the autor of this libro
	 */
	public void setAutor(String autor);

	/**
	 * Returns the anio of this libro.
	 *
	 * @return the anio of this libro
	 */
	public int getAnio();

	/**
	 * Sets the anio of this libro.
	 *
	 * @param anio the anio of this libro
	 */
	public void setAnio(int anio);

	/**
	 * Returns the group ID of this libro.
	 *
	 * @return the group ID of this libro
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this libro.
	 *
	 * @param groupId the group ID of this libro
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this libro.
	 *
	 * @return the company ID of this libro
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this libro.
	 *
	 * @param companyId the company ID of this libro
	 */
	public void setCompanyId(long companyId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Libro libro);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Libro> toCacheModel();

	@Override
	public Libro toEscapedModel();

	@Override
	public Libro toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}