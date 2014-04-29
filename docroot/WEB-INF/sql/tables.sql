create table autoCompleteAjax_Poblacion (
	poblacionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	description VARCHAR(75) null
);