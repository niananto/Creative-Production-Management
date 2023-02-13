CREATE SEQUENCE User_seq START WITH 0 INCREMENT BY 1;

CREATE TABLE User (
	id NUMERIC DEFAULT NEXTVAL ('User_seq'),
	name VARCHAR(50) NOT NULL,
	email VARCHAR(50),
    contact_no VARCHAR(20),
    address VARCHAR(100),

	CONSTRAINT User_PK primary key(id) 
);

CREATE TABLE CSO (
    id NUMERIC NOT NULL,

    CONSTRAINT CSO_PK primary key(id),
    CONSTRAINT CSO_User_FK foreign key(id) 
        references User(id) ON DELETE CASCADE
);

CREATE TABLE Designer (
    id NUMERIC NOT NULL,
    salary NUMERIC,
    category CHAR(1),

    CONSTRAINT Designer_PK primary key(id),
    CONSTRAINT Designer_User_FK foreign key(id) 
        references User(id) ON DELETE CASCADE
);

CREATE SEQUENCE Task_seq START WITH 0 INCREMENT BY 1;

CREATE TABLE Task (
	id NUMERIC DEFAULT NEXTVAL ('Task_seq'),
	name VARCHAR(50) NOT NULL,

	CONSTRAINT Task_PK primary key(id) 
);

CREATE SEQUENCE Vendor_seq START WITH 0 INCREMENT BY 1;

CREATE TABLE Vendor (
	id NUMERIC DEFAULT NEXTVAL ('Vendor_seq'),
	name VARCHAR(50) NOT NULL,
    email VARCHAR(50),
    contact_no VARCHAR(20),
    address VARCHAR(100),
    category CHAR(1),

	CONSTRAINT Vendor_PK primary key(id) 
);

CREATE SEQUENCE Service_seq START WITH 0 INCREMENT BY 1;

CREATE TABLE Service (
    id NUMERIC DEFAULT NEXTVAL ('Service_seq'),
    name VARCHAR(100) NOT NULL UNIQUE,

    CONSTRAINT Service_PK primary key(id)
)

CREATE TABLE Vendor_Service (
    vendor_id NUMERIC,
    service_id NUMERIC,

    CONSTRAINT _FK foreign key(id) 
        references User(id) ON DELETE CASCADE
)



















CREATE SEQUENCE Estimation_seq START WITH 0 INCREMENT BY 1;

CREATE TABLE Estimation (
    id NUMERIC DEFAULT NEXTVAL ('Estimation_seq'),
)
