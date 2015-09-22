-- SQL Schema script for MyAccount




CREATE TABLE atg_user
( id varchar2(40) NOT NULL,
  userRole varchar2(15) NOT NULL,
  isActive varchar(5),
  isRemoved varchar2(5),
  addedby varchar2(40),
  lastlogin date,
  loginattemptcount number(2),
  CONSTRAINT atg_user_id_fk FOREIGN KEY (id) REFERENCES dps_user (id)
);

CREATE TABLE atg_phone
( id varchar2(40) NOT NULL,
  sequence_num  number(12),
  phonenumber number(14),
  phonetype varchar2(10),
  CONSTRAINT atg_phone_pk PRIMARY KEY (id)
);

CREATE TABLE atg_customer
( id varchar2(40) NOT NULL,
  sequence_num  number(12),
  customernumber number(12),
  partyid varchar2(16),
  customername varchar2(50),
  serviceaddress varchar2(40),
  addedby varchar2(40),
  createddate DATE,
  servicedescription varchar2(40),
  CONSTRAINT atg_customer_pk PRIMARY KEY (id)
);

CREATE TABLE atg_user_phone
( id varchar2(40) NOT NULL,
  user_id varchar2(40) NOT NULL,
  CONSTRAINT atg_user_phone_pk PRIMARY KEY (id, user_id),
  CONSTRAINT atg_user_phone_id_fk FOREIGN KEY (id) REFERENCES atg_phone (id),
  CONSTRAINT atg_user_phone_user_id_fk FOREIGN KEY (user_id) REFERENCES dps_user (id)
);

CREATE TABLE atg_user_customer
( id varchar2(40) NOT NULL,
  user_id varchar2(40) NOT NULL,
  CONSTRAINT atg_user_customer_pk PRIMARY KEY (id, user_id),
  CONSTRAINT atg_user_customer_id_fk FOREIGN KEY (id) REFERENCES atg_customer (id),
  CONSTRAINT atg_user_customer_user_id_fk FOREIGN KEY (user_id) REFERENCES dps_user (id)
);
