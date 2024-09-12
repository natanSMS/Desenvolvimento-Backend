CREATE DATABASE db_empresa_eventos;

USE db_empresa_eventos;

CREATE TABLE tb_eventos (
	id INT PRIMARY KEY,
    nome VARCHAR(255),
    localizacao VARCHAR(255),
    preco_ingresso DECIMAL(6,2)
);

INSERT INTO tb_eventos VALUES
	(1, 'show bacana', 'rua XPTO 123', 123.45),
    (2, 'exposicao', 'rua XPTO 456', 456.78);