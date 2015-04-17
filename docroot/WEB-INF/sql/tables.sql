create table innova_Libro (
	libroId LONG not null primary key,
	titulo VARCHAR(75) null,
	autor VARCHAR(75) null,
	anio INTEGER,
	groupId LONG,
	companyId LONG
);