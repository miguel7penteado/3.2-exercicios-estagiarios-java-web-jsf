-- Table: livros

-- DROP TABLE livros;

CREATE TABLE livros
(
	id integer NOT NULL,
	descricao varchar(200),
	ilustrado boolean,
	isbn varchar(200),
	numeropaginas integer,
	preco double precision,
	titulo varchar(200),
	CONSTRAINT chave_primaria_livro PRIMARY KEY (id)
)
WITH ( OIDS=FALSE );

ALTER TABLE livros OWNER TO servidorjava;

========================================================================

delete from livros;

select * from livros;

insert into livros values (05,'Livro de Ficção científica muito legal!',TRUE,'0003',127,42.3,'Os Guardiões da Galáxia');

select * from livros;

