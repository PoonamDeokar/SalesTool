# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                            bigserial not null,
  email                         varchar(255),
  phone                         bigint,
  address                       varchar(255),
  constraint pk_company primary key (id)
);

create table employee (
  eid                           bigserial not null,
  fname                         varchar(255),
  lname                         varchar(255),
  pass                          varchar(255),
  gen                           varchar(255),
  sal                           varchar(255),
  constraint pk_employee primary key (eid)
);


# --- !Downs

drop table if exists company cascade;

drop table if exists employee cascade;

