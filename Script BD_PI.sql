PRAGMA foreign_keys = OFF;
PRAGMA foreign_keys = ON;

DROP TABLE CLIENTE;
DROP TABLE FUNCIONARIO;
DROP TABLE MOVIMENTACAO;
DROP TABLE SAPATOS;

DELETE FROM CLIENTE;
DELETE FROM FUNCIONARIO;
DELETE FROM MOVIMENTACAO;
DELETE FROM SAPATOS;


CREATE TABLE CLIENTE(
NOME VARCHAR(100) NOT NULL,
IDADE INTEGER(3),
TELEFONE VARCHAR(11),
CPF VARCHAR (14) PRIMARY KEY NOT NULL UNIQUE,
RG VARCHAR(9) NOT NULL
);

CREATE TABLE FUNCIONARIO(
ID_FUNCIONARIO INTEGER PRIMARY KEY AUTOINCREMENT,
NOME VARCHAR(100) NOT NULL,
CARGO VARCHAR(50) NOT NULL
);

CREATE TABLE MOVIMENTACAO(
ID_MOVIMENTACAO INTEGER PRIMARY KEY AUTOINCREMENT,
ID_FUNCIONARIO INTEGER NOT NULL,
CPF VARCHAR(14) NOT NULL,
ID_SAPATO INTEGER NOT NULL,
DATA_MOV VARCHAR(10) NOT NULL,
STATUS VARCHAR(30) NOT NULL,
FOREIGN KEY (ID_FUNCIONARIO) REFERENCES FUNCIONARIO(ID_FUNCIONARIO),
FOREIGN KEY (CPF) REFERENCES CLIENTE(CPF),
FOREIGN KEY (ID_SAPATO) REFERENCES SAPATOS(ID_SAPATO)
);

CREATE TABLE SAPATOS(
ID_SAPATO INTEGER PRIMARY KEY AUTOINCREMENT,
NOME_PRODUTO VARCHAR(50) NOT NULL,
NUMERO INTEGER NOT NULL,
STATUS VARCHAR(1)
);

SELECT * FROM CLIENTE;
SELECT * FROM FUNCIONARIO;
SELECT * FROM MOVIMENTACAO;
SELECT * FROM SAPATOS;