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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Libro in entity cache.
 *
 * @author aritz
 * @see Libro
 * @generated
 */
public class LibroCacheModel implements CacheModel<Libro>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{libroId=");
		sb.append(libroId);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", autor=");
		sb.append(autor);
		sb.append(", anio=");
		sb.append(anio);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Libro toEntityModel() {
		LibroImpl libroImpl = new LibroImpl();

		libroImpl.setLibroId(libroId);

		if (titulo == null) {
			libroImpl.setTitulo(StringPool.BLANK);
		}
		else {
			libroImpl.setTitulo(titulo);
		}

		if (autor == null) {
			libroImpl.setAutor(StringPool.BLANK);
		}
		else {
			libroImpl.setAutor(autor);
		}

		libroImpl.setAnio(anio);
		libroImpl.setGroupId(groupId);
		libroImpl.setCompanyId(companyId);

		libroImpl.resetOriginalValues();

		return libroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		libroId = objectInput.readLong();
		titulo = objectInput.readUTF();
		autor = objectInput.readUTF();
		anio = objectInput.readInt();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(libroId);

		if (titulo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(titulo);
		}

		if (autor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(autor);
		}

		objectOutput.writeInt(anio);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
	}

	public long libroId;
	public String titulo;
	public String autor;
	public int anio;
	public long groupId;
	public long companyId;
}