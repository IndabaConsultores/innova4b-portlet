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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Libro}.
 * </p>
 *
 * @author aritz
 * @see Libro
 * @generated
 */
public class LibroWrapper implements Libro, ModelWrapper<Libro> {
	public LibroWrapper(Libro libro) {
		_libro = libro;
	}

	@Override
	public Class<?> getModelClass() {
		return Libro.class;
	}

	@Override
	public String getModelClassName() {
		return Libro.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("libroId", getLibroId());
		attributes.put("titulo", getTitulo());
		attributes.put("autor", getAutor());
		attributes.put("anio", getAnio());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long libroId = (Long)attributes.get("libroId");

		if (libroId != null) {
			setLibroId(libroId);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}

		String autor = (String)attributes.get("autor");

		if (autor != null) {
			setAutor(autor);
		}

		Integer anio = (Integer)attributes.get("anio");

		if (anio != null) {
			setAnio(anio);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}
	}

	/**
	* Returns the primary key of this libro.
	*
	* @return the primary key of this libro
	*/
	@Override
	public long getPrimaryKey() {
		return _libro.getPrimaryKey();
	}

	/**
	* Sets the primary key of this libro.
	*
	* @param primaryKey the primary key of this libro
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_libro.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the libro ID of this libro.
	*
	* @return the libro ID of this libro
	*/
	@Override
	public long getLibroId() {
		return _libro.getLibroId();
	}

	/**
	* Sets the libro ID of this libro.
	*
	* @param libroId the libro ID of this libro
	*/
	@Override
	public void setLibroId(long libroId) {
		_libro.setLibroId(libroId);
	}

	/**
	* Returns the titulo of this libro.
	*
	* @return the titulo of this libro
	*/
	@Override
	public java.lang.String getTitulo() {
		return _libro.getTitulo();
	}

	/**
	* Sets the titulo of this libro.
	*
	* @param titulo the titulo of this libro
	*/
	@Override
	public void setTitulo(java.lang.String titulo) {
		_libro.setTitulo(titulo);
	}

	/**
	* Returns the autor of this libro.
	*
	* @return the autor of this libro
	*/
	@Override
	public java.lang.String getAutor() {
		return _libro.getAutor();
	}

	/**
	* Sets the autor of this libro.
	*
	* @param autor the autor of this libro
	*/
	@Override
	public void setAutor(java.lang.String autor) {
		_libro.setAutor(autor);
	}

	/**
	* Returns the anio of this libro.
	*
	* @return the anio of this libro
	*/
	@Override
	public int getAnio() {
		return _libro.getAnio();
	}

	/**
	* Sets the anio of this libro.
	*
	* @param anio the anio of this libro
	*/
	@Override
	public void setAnio(int anio) {
		_libro.setAnio(anio);
	}

	/**
	* Returns the group ID of this libro.
	*
	* @return the group ID of this libro
	*/
	@Override
	public long getGroupId() {
		return _libro.getGroupId();
	}

	/**
	* Sets the group ID of this libro.
	*
	* @param groupId the group ID of this libro
	*/
	@Override
	public void setGroupId(long groupId) {
		_libro.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this libro.
	*
	* @return the company ID of this libro
	*/
	@Override
	public long getCompanyId() {
		return _libro.getCompanyId();
	}

	/**
	* Sets the company ID of this libro.
	*
	* @param companyId the company ID of this libro
	*/
	@Override
	public void setCompanyId(long companyId) {
		_libro.setCompanyId(companyId);
	}

	@Override
	public boolean isNew() {
		return _libro.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_libro.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _libro.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_libro.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _libro.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _libro.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_libro.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _libro.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_libro.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_libro.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_libro.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LibroWrapper((Libro)_libro.clone());
	}

	@Override
	public int compareTo(Libro libro) {
		return _libro.compareTo(libro);
	}

	@Override
	public int hashCode() {
		return _libro.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Libro> toCacheModel() {
		return _libro.toCacheModel();
	}

	@Override
	public Libro toEscapedModel() {
		return new LibroWrapper(_libro.toEscapedModel());
	}

	@Override
	public Libro toUnescapedModel() {
		return new LibroWrapper(_libro.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _libro.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _libro.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_libro.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LibroWrapper)) {
			return false;
		}

		LibroWrapper libroWrapper = (LibroWrapper)obj;

		if (Validator.equals(_libro, libroWrapper._libro)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Libro getWrappedLibro() {
		return _libro;
	}

	@Override
	public Libro getWrappedModel() {
		return _libro;
	}

	@Override
	public void resetOriginalValues() {
		_libro.resetOriginalValues();
	}

	private Libro _libro;
}