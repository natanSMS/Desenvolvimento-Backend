CREATE DATABASE db_escola_tech;

USE db_escola_tech;

CREATE TABLE tb_endereco (
	id INT AUTO_INCREMENT PRIMARY KEY,
    logradouro VARCHAR(255),
    bairro VARCHAR(255),
    numero INT,
    uf CHAR(2),
    pais VARCHAR(255)
);

CREATE TABLE tb_filial (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    cnpj CHAR(14),
    id_endereco INT,
    FOREIGN KEY (id_endereco) REFERENCES tb_endereco(id)
);

INSERT INTO tb_endereco(logradouro, bairro, numero, uf, pais) VALUES
	("Rua XPTO", "Barroso", 41, "SP", "Brasil");
    
INSERT INTO tb_filial(nome, cnpj, id_endereco) VALUES
	("Escolinha Programada", "123.456.789.10", 1);