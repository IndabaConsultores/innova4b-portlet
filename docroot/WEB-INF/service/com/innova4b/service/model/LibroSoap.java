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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.innova4b.service.service.http.LibroServiceSoap}.
 *
 * @author aritz
 * @see com.innova4b.service.service.http.LibroServiceSoap
 * @generated
 */
public class LibroSoap implements Serializable {
	public static LibroSoap toSoapModel(Libro model) {
		LibroSoap soapModel = new LibroSoap();

		soapModel.setLibroId(model.getLibroId());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setAutor(model.getAutor());
		soapModel.setAnio(model.getAnio());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());

		return soapModel;
	}

	public static LibroSoap[] toSoapModels(Libro[] models) {
		LibroSoap[] soapModels = new LibroSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LibroSoap[][] toSoapModels(Libro[][] models) {
		LibroSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LibroSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LibroSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LibroSoap[] toSoapModels(List<Libro> models) {
		List<LibroSoap> soapModels = new ArrayList<LibroSoap>(models.size());

		for (Libro model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LibroSoap[soapModels.size()]);
	}

	public LibroSoap() {
	}

	public long getPrimaryKey() {
		return _libroId;
	}

	public void setPrimaryKey(long pk) {
		setLibroId(pk);
	}

	public long getLibroId() {
		return _libroId;
	}

	public void setLibroId(long libroId) {
		_libroId = libroId;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	public String getAutor() {
		return _autor;
	}

	public void setAutor(String autor) {
		_autor = autor;
	}

	public int getAnio() {
		return _anio;
	}

	public void setAnio(int anio) {
		_anio = anio;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	private long _libroId;
	private String _titulo;
	private String _autor;
	private int _anio;
	private long _groupId;
	private long _companyId;
}