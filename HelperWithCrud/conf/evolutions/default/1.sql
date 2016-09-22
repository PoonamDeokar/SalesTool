# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table college (
  cid                           bigserial not null,
  cname                         varchar(255),
  constraint pk_college primary key (cid)
);

create table delegate2 (
  did                           serial not null,
  delegate_name                 varchar(255),
  constraint pk_delegate2 primary key (did)
);

create table event2 (
  eid                           serial not null,
  event_name                    varchar(255),
  constraint pk_event2 primary key (eid)
);

create table event2_delegate2 (
  event2_eid                    integer not null,
  delegate2_did                 integer not null,
  constraint pk_event2_delegate2 primary key (event2_eid,delegate2_did)
);

create table person (
  p_id                          bigserial not null,
  p_name                        varchar(255),
  pdeatil_fk                    bigint,
  constraint uq_person_pdeatil_fk unique (pdeatil_fk),
  constraint pk_person primary key (p_id)
);

create table person_detail (
  detail_pk                     bigserial not null,
  job                           varchar(255),
  income                        float,
  constraint pk_person_detail primary key (detail_pk)
);

create table student (
  id                            bigserial not null,
  student_name                  varchar(255),
  l_name                        varchar(255),
  phone_no                      bigint,
  constraint pk_student primary key (id)
);

create table student_reln (
  sid                           bigserial not null,
  sname                         varchar(255),
  college_cid                   bigint,
  constraint pk_student_reln primary key (sid)
);

alter table event2_delegate2 add constraint fk_event2_delegate2_event2 foreign key (event2_eid) references event2 (eid) on delete restrict on update restrict;
create index ix_event2_delegate2_event2 on event2_delegate2 (event2_eid);

alter table event2_delegate2 add constraint fk_event2_delegate2_delegate2 foreign key (delegate2_did) references delegate2 (did) on delete restrict on update restrict;
create index ix_event2_delegate2_delegate2 on event2_delegate2 (delegate2_did);

alter table person add constraint fk_person_pdeatil_fk foreign key (pdeatil_fk) references person_detail (detail_pk) on delete restrict on update restrict;

alter table student_reln add constraint fk_student_reln_college_cid foreign key (college_cid) references college (cid) on delete restrict on update restrict;
create index ix_student_reln_college_cid on student_reln (college_cid);


# --- !Downs

alter table if exists event2_delegate2 drop constraint if exists fk_event2_delegate2_event2;
drop index if exists ix_event2_delegate2_event2;

alter table if exists event2_delegate2 drop constraint if exists fk_event2_delegate2_delegate2;
drop index if exists ix_event2_delegate2_delegate2;

alter table if exists person drop constraint if exists fk_person_pdeatil_fk;

alter table if exists student_reln drop constraint if exists fk_student_reln_college_cid;
drop index if exists ix_student_reln_college_cid;

drop table if exists college cascade;

drop table if exists delegate2 cascade;

drop table if exists event2 cascade;

drop table if exists event2_delegate2 cascade;

drop table if exists person cascade;

drop table if exists person_detail cascade;

drop table if exists student cascade;

drop table if exists student_reln cascade;

