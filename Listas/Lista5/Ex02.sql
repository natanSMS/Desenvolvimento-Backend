CREATE DATABASE db_floricultura;

USE db_floricultura;

CREATE TABLE tb_flores (
	id INT PRIMARY KEY,
    especie VARCHAR(255),
    preco DECIMAL(6,2)
);

INSERT INTO tb_flores VALUES
	(1, 'florida', 123.45),
    (2, 'aflorada', 456.78);