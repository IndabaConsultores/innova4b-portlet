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

import com.innova4b.service.service.ClpSerializer;
import com.innova4b.service.service.LibroLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aritz
 */
public class LibroClp extends BaseModelImpl<Libro> implements Libro {
	public LibroClp() {
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
	public long getPrimaryKey() {
		return _libroId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLibroId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _libroId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getLibroId() {
		return _libroId;
	}

	@Override
	public void setLibroId(long libroId) {
		_libroId = libroId;

		if (_libroRemoteModel != null) {
			try {
				Class<?> clazz = _libroRemoteModel.getClass();

				Method method = clazz.getMethod("setLibroId", long.class);

				method.invoke(_libroRemoteModel, libroId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitulo() {
		return _titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		_titulo = titulo;

		if (_libroRemoteModel != null) {
			try {
				Class<?> clazz = _libroRemoteModel.getClass();

				Method method = clazz.getMethod("setTitulo", String.class);

				method.invoke(_libroRemoteModel, titulo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAutor() {
		return _autor;
	}

	@Override
	public void setAutor(String autor) {
		_autor = autor;

		if (_libroRemoteModel != null) {
			try {
				Class<?> clazz = _libroRemoteModel.getClass();

				Method method = clazz.getMethod("setAutor", String.class);

				method.invoke(_libroRemoteModel, autor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAnio() {
		return _anio;
	}

	@Override
	public void setAnio(int anio) {
		_anio = anio;

		if (_libroRemoteModel != null) {
			try {
				Class<?> clazz = _libroRemoteModel.getClass();

				Method method = clazz.getMethod("setAnio", int.class);

				method.invoke(_libroRemoteModel, anio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_libroRemoteModel != null) {
			try {
				Class<?> clazz = _libroRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_libroRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_libroRemoteModel != null) {
			try {
				Class<?> clazz = _libroRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_libroRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLibroRemoteModel() {
		return _libroRemoteModel;
	}

	public void setLibroRemoteModel(BaseModel<?> libroRemoteModel) {
		_libroRemoteModel = libroRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _libroRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_libroRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LibroLocalServiceUtil.addLibro(this);
		}
		else {
			LibroLocalServiceUtil.updateLibro(this);
		}
	}

	@Override
	public Libro toEscapedModel() {
		return (Libro)ProxyUtil.newProxyInstance(Libro.class.getClassLoader(),
			new Class[] { Libro.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LibroClp clone = new LibroClp();

		clone.setLibroId(getLibroId());
		clone.setTitulo(getTitulo());
		clone.setAutor(getAutor());
		clone.setAnio(getAnio());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());

		return clone;
	}

	@Override
	public int compareTo(Libro libro) {
		int value = 0;

		if (getAnio() < libro.getAnio()) {
			value = -1;
		}
		else if (getAnio() > libro.getAnio()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LibroClp)) {
			return false;
		}

		LibroClp libro = (LibroClp)obj;

		long primaryKey = libro.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{libroId=");
		sb.append(getLibroId());
		sb.append(", titulo=");
		sb.append(getTitulo());
		sb.append(", autor=");
		sb.append(getAutor());
		sb.append(", anio=");
		sb.append(getAnio());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.innova4b.service.model.Libro");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>libroId</column-name><column-value><![CDATA[");
		sb.append(getLibroId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titulo</column-name><column-value><![CDATA[");
		sb.append(getTitulo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autor</column-name><column-value><![CDATA[");
		sb.append(getAutor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anio</column-name><column-value><![CDATA[");
		sb.append(getAnio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _libroId;
	private String _titulo;
	private String _autor;
	private int _anio;
	private long _groupId;
	private long _companyId;
	private BaseModel<?> _libroRemoteModel;
	private Class<?> _clpSerializerClass = com.innova4b.service.service.ClpSerializer.class;
}