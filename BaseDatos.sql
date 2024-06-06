create database bank with owner postgres;
create schema bank_schema;

alter schema bank_schema owner to postgres;

create sequence bank_schema.persona_id_seq
    start with 1 increment by 1
    no minvalue no maxvalue cache 1;

create table bank_schema.persona
(
    id             bigint  default nextval('persona_id_seq')
        constraint persona_pk
            primary key,
    nombre         varchar(255) not null,
    genero         varchar(255),
    edad           integer,
    identificacion varchar,
    direccion      varchar,
    telefono       varchar
);

alter table bank_schema.persona owner to postgres;

create table bank_schema.cliente (
    id bigint primary key,
    password varchar(255) not null,
    estado boolean default true,
    foreign key (id) references bank_schema.persona(id) on delete cascade
);

alter table bank_schema.cliente owner to postgres;

create sequence bank_schema.cuenta_id_seq
    start with 1 increment by 1
    no minvalue no maxvalue cache 1;

create table bank_schema.cuenta (
    id bigint default nextval('cuenta_id_seq')
                                constraint cuenta_pk
                                    primary key,
    numero_cuenta   varchar not null,
    tipo_cuenta     varchar not null,
    saldo_inicial   integer not null,
    estado boolean default true,
    cliente_id    bigint
        constraint cuenta_cliente_id_fk
            references bank_schema.cliente
);

alter table bank_schema.cuenta owner to postgres;