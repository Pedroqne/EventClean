-- V1__criar_tabela_evento.sql

CREATE TABLE tb_event (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    identifier VARCHAR(100) NOT NULL UNIQUE,
    date_start TIMESTAMP NOT NULL,
    date_end TIMESTAMP NOT NULL,
    location VARCHAR(255) NOT NULL,
    capacity INTEGER NOT NULL,
    organizer VARCHAR(255) NOT NULL,
    type_event VARCHAR(50) NOT NULL
);