-- Create table
create table USERINFO
(
  id         NUMBER not null,
  name       NVARCHAR2(24) not null,
  password   NVARCHAR2(32) not null,
  email      NVARCHAR2(50) not null,
  address    NVARCHAR2(50),
  phone      NVARCHAR2(11),
  sex        NVARCHAR2(2),
  isadmin    NUMBER(1) not null,
  activation NUMBER(1)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table USERINFO
  add constraint USER_PK_ID primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
