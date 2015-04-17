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

package com.innova4b.service.model.impl;

import com.innova4b.service.model.Libro;
import com.innova4b.service.model.LibroModel;
import com.innova4b.service.model.LibroSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Libro service. Represents a row in the &quot;innova_Libro&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.innova4b.service.model.LibroModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LibroImpl}.
 * </p>
 *
 * @author aritz
 * @see LibroImpl
 * @see com.innova4b.service.model.Libro
 * @see com.innova4b.service.model.LibroModel
 * @generated
 */
@JSON(strict = true)
public class LibroModelImpl extends BaseModelImpl<Libro> implements LibroModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a libro model instance should use the {@link com.innova4b.service.model.Libro} interface instead.
	 */
	public static final String TABLE_NAME = "innova_Libro";
	public static final Object[][] TABLE_COLUMNS = {
			{ "libroId", Types.BIGINT },
			{ "titulo", Types.VARCHAR },
			{ "autor", Types.VARCHAR },
			{ "anio", Types.INTEGER },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table innova_Libro (libroId LONG not null primary key,titulo VARCHAR(75) null,autor VARCHAR(75) null,anio INTEGER,groupId LONG,companyId LONG)";
	public static final String TABLE_SQL_DROP = "drop table innova_Libro";
	public static final String ORDER_BY_JPQL = " ORDER BY libro.anio DESC";
	public static final String ORDER_BY_SQL = " ORDER BY innova_Libro.anio DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.innova4b.service.model.Libro"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.innova4b.service.model.Libro"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Libro toModel(LibroSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Libro model = new LibroImpl();

		model.setLibroId(soapModel.getLibroId());
		model.setTitulo(soapModel.getTitulo());
		model.setAutor(soapModel.getAutor());
		model.setAnio(soapModel.getAnio());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Libro> toModels(LibroSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Libro> models = new ArrayList<Libro>(soapModels.length);

		for (LibroSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.innova4b.service.model.Libro"));

	public LibroModelImpl() {
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

	@JSON
	@Override
	public long getLibroId() {
		return _libroId;
	}

	@Override
	public void setLibroId(long libroId) {
		_libroId = libroId;
	}

	@JSON
	@Override
	public String getTitulo() {
		if (_titulo == null) {
			return StringPool.BLANK;
		}
		else {
			return _titulo;
		}
	}

	@Override
	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	@JSON
	@Override
	public String getAutor() {
		if (_autor == null) {
			return StringPool.BLANK;
		}
		else {
			return _autor;
		}
	}

	@Override
	public void setAutor(String autor) {
		_autor = autor;
	}

	@JSON
	@Override
	public int getAnio() {
		return _anio;
	}

	@Override
	public void setAnio(int anio) {
		_anio = anio;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Libro.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Libro toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Libro)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LibroImpl libroImpl = new LibroImpl();

		libroImpl.setLibroId(getLibroId());
		libroImpl.setTitulo(getTitulo());
		libroImpl.setAutor(getAutor());
		libroImpl.setAnio(getAnio());
		libroImpl.setGroupId(getGroupId());
		libroImpl.setCompanyId(getCompanyId());

		libroImpl.resetOriginalValues();

		return libroImpl;
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

		if (!(obj instanceof Libro)) {
			return false;
		}

		Libro libro = (Libro)obj;

		long primaryKey = libro.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Libro> toCacheModel() {
		LibroCacheModel libroCacheModel = new LibroCacheModel();

		libroCacheModel.libroId = getLibroId();

		libroCacheModel.titulo = getTitulo();

		String titulo = libroCacheModel.titulo;

		if ((titulo != null) && (titulo.length() == 0)) {
			libroCacheModel.titulo = null;
		}

		libroCacheModel.autor = getAutor();

		String autor = libroCacheModel.autor;

		if ((autor != null) && (autor.length() == 0)) {
			libroCacheModel.autor = null;
		}

		libroCacheModel.anio = getAnio();

		libroCacheModel.groupId = getGroupId();

		libroCacheModel.companyId = getCompanyId();

		return libroCacheModel;
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

	private static ClassLoader _classLoader = Libro.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Libro.class };
	private long _libroId;
	private String _titulo;
	private String _autor;
	private int _anio;
	private long _groupId;
	private long _companyId;
	private Libro _escapedModel;
}