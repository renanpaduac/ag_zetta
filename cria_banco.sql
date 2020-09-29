CREATE DATABASE zetta_bd;

USE zetta_bd;

/***** TABELA CARGOS *****/
CREATE TABLE tb_cargos (
  id int auto_increment primary key,
  nome varchar(100)
);

/***** TABELA PERFIS *****/
CREATE TABLE tb_perfil (
  id int auto_increment primary key,
  nome varchar(100)
);

/***** TABELA USUÁRIOS *****/
CREATE TABLE tb_usuarios (
  id int auto_increment primary key,
  nome varchar(100),
  cpf varchar (20),
  data_nasc datetime,
  sexo varchar (1),
  cargo_id int,
  perfil_id int,
  FOREIGN KEY (perfil_id) REFERENCES tb_perfil(id),
  FOREIGN KEY (cargo_id) REFERENCES tb_cargos(id)
);
/*****************/
