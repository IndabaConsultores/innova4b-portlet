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

import com.innova4b.service.NoSuchLibroException;
import com.innova4b.service.model.Libro;
import com.innova4b.service.model.impl.LibroImpl;
import com.innova4b.service.model.impl.LibroModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the libro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author aritz
 * @see LibroPersistence
 * @see LibroUtil
 * @generated
 */
public class LibroPersistenceImpl extends BasePersistenceImpl<Libro>
	implements LibroPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LibroUtil} to access the libro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LibroImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LibroModelImpl.ENTITY_CACHE_ENABLED,
			LibroModelImpl.FINDER_CACHE_ENABLED, LibroImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LibroModelImpl.ENTITY_CACHE_ENABLED,
			LibroModelImpl.FINDER_CACHE_ENABLED, LibroImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LibroModelImpl.ENTITY_CACHE_ENABLED,
			LibroModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LibroPersistenceImpl() {
		setModelClass(Libro.class);
	}

	/**
	 * Caches the libro in the entity cache if it is enabled.
	 *
	 * @param libro the libro
	 */
	@Override
	public void cacheResult(Libro libro) {
		EntityCacheUtil.putResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
			LibroImpl.class, libro.getPrimaryKey(), libro);

		libro.resetOriginalValues();
	}

	/**
	 * Caches the libros in the entity cache if it is enabled.
	 *
	 * @param libros the libros
	 */
	@Override
	public void cacheResult(List<Libro> libros) {
		for (Libro libro : libros) {
			if (EntityCacheUtil.getResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
						LibroImpl.class, libro.getPrimaryKey()) == null) {
				cacheResult(libro);
			}
			else {
				libro.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all libros.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LibroImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LibroImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the libro.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Libro libro) {
		EntityCacheUtil.removeResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
			LibroImpl.class, libro.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Libro> libros) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Libro libro : libros) {
			EntityCacheUtil.removeResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
				LibroImpl.class, libro.getPrimaryKey());
		}
	}

	/**
	 * Creates a new libro with the primary key. Does not add the libro to the database.
	 *
	 * @param libroId the primary key for the new libro
	 * @return the new libro
	 */
	@Override
	public Libro create(long libroId) {
		Libro libro = new LibroImpl();

		libro.setNew(true);
		libro.setPrimaryKey(libroId);

		return libro;
	}

	/**
	 * Removes the libro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param libroId the primary key of the libro
	 * @return the libro that was removed
	 * @throws com.innova4b.service.NoSuchLibroException if a libro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Libro remove(long libroId)
		throws NoSuchLibroException, SystemException {
		return remove((Serializable)libroId);
	}

	/**
	 * Removes the libro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the libro
	 * @return the libro that was removed
	 * @throws com.innova4b.service.NoSuchLibroException if a libro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Libro remove(Serializable primaryKey)
		throws NoSuchLibroException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Libro libro = (Libro)session.get(LibroImpl.class, primaryKey);

			if (libro == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLibroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(libro);
		}
		catch (NoSuchLibroException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Libro removeImpl(Libro libro) throws SystemException {
		libro = toUnwrappedModel(libro);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(libro)) {
				libro = (Libro)session.get(LibroImpl.class,
						libro.getPrimaryKeyObj());
			}

			if (libro != null) {
				session.delete(libro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (libro != null) {
			clearCache(libro);
		}

		return libro;
	}

	@Override
	public Libro updateImpl(com.innova4b.service.model.Libro libro)
		throws SystemException {
		libro = toUnwrappedModel(libro);

		boolean isNew = libro.isNew();

		Session session = null;

		try {
			session = openSession();

			if (libro.isNew()) {
				session.save(libro);

				libro.setNew(false);
			}
			else {
				session.merge(libro);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
			LibroImpl.class, libro.getPrimaryKey(), libro);

		return libro;
	}

	protected Libro toUnwrappedModel(Libro libro) {
		if (libro instanceof LibroImpl) {
			return libro;
		}

		LibroImpl libroImpl = new LibroImpl();

		libroImpl.setNew(libro.isNew());
		libroImpl.setPrimaryKey(libro.getPrimaryKey());

		libroImpl.setLibroId(libro.getLibroId());
		libroImpl.setTitulo(libro.getTitulo());
		libroImpl.setAutor(libro.getAutor());
		libroImpl.setAnio(libro.getAnio());
		libroImpl.setGroupId(libro.getGroupId());
		libroImpl.setCompanyId(libro.getCompanyId());

		return libroImpl;
	}

	/**
	 * Returns the libro with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the libro
	 * @return the libro
	 * @throws com.innova4b.service.NoSuchLibroException if a libro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Libro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLibroException, SystemException {
		Libro libro = fetchByPrimaryKey(primaryKey);

		if (libro == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLibroException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return libro;
	}

	/**
	 * Returns the libro with the primary key or throws a {@link com.innova4b.service.NoSuchLibroException} if it could not be found.
	 *
	 * @param libroId the primary key of the libro
	 * @return the libro
	 * @throws com.innova4b.service.NoSuchLibroException if a libro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Libro findByPrimaryKey(long libroId)
		throws NoSuchLibroException, SystemException {
		return findByPrimaryKey((Serializable)libroId);
	}

	/**
	 * Returns the libro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the libro
	 * @return the libro, or <code>null</code> if a libro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Libro fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Libro libro = (Libro)EntityCacheUtil.getResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
				LibroImpl.class, primaryKey);

		if (libro == _nullLibro) {
			return null;
		}

		if (libro == null) {
			Session session = null;

			try {
				session = openSession();

				libro = (Libro)session.get(LibroImpl.class, primaryKey);

				if (libro != null) {
					cacheResult(libro);
				}
				else {
					EntityCacheUtil.putResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
						LibroImpl.class, primaryKey, _nullLibro);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LibroModelImpl.ENTITY_CACHE_ENABLED,
					LibroImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return libro;
	}

	/**
	 * Returns the libro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param libroId the primary key of the libro
	 * @return the libro, or <code>null</code> if a libro with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Libro fetchByPrimaryKey(long libroId) throws SystemException {
		return fetchByPrimaryKey((Serializable)libroId);
	}

	/**
	 * Returns all the libros.
	 *
	 * @return the libros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Libro> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the libros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.innova4b.service.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of libros
	 * @param end the upper bound of the range of libros (not inclusive)
	 * @return the range of libros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Libro> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the libros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.innova4b.service.model.impl.LibroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of libros
	 * @param end the upper bound of the range of libros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of libros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Libro> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Libro> list = (List<Libro>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LIBRO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LIBRO;

				if (pagination) {
					sql = sql.concat(LibroModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Libro>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Libro>(list);
				}
				else {
					list = (List<Libro>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the libros from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Libro libro : findAll()) {
			remove(libro);
		}
	}

	/**
	 * Returns the number of libros.
	 *
	 * @return the number of libros
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LIBRO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the libro persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.innova4b.service.model.Libro")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Libro>> listenersList = new ArrayList<ModelListener<Libro>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Libro>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(LibroImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LIBRO = "SELECT libro FROM Libro libro";
	private static final String _SQL_COUNT_LIBRO = "SELECT COUNT(libro) FROM Libro libro";
	private static final String _ORDER_BY_ENTITY_ALIAS = "libro.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Libro exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LibroPersistenceImpl.class);
	private static Libro _nullLibro = new LibroImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Libro> toCacheModel() {
				return _nullLibroCacheModel;
			}
		};

	private static CacheModel<Libro> _nullLibroCacheModel = new CacheModel<Libro>() {
			@Override
			public Libro toEntityModel() {
				return _nullLibro;
			}
		};
}