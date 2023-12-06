create database db_atividade4;

use db_atividade4;

create table clientes
(
	id integer primary key auto_increment,
    nome varchar(100),
    cpf bigint,
    email varchar(50)
);

insert into clientes (nome, cpf, email) values
("Gabriela Fernandes", 12345678910, "gabriela@gmail.com"),
("Arthur Lanches", 09876543212, "arthur@gmail.com");

create table produtos
(
	id integer primary key auto_increment,
    nome varchar(50),
    codigo varchar(10),
    quantidade integer,
    preco double,
    descricao varchar(200),
    atributo varchar(50),
    fornecedor varchar(50),
    categoria varchar(50)
);

create table compra
(
	id integer primary key auto_increment,
    produto_id integer,
    cliente_id integer,
    
    foreign key (produto_id) references produtos(id),
    foreign key (cliente_id) references clientes(id)
);