package br.com.miguel.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;

/**
 * The persistent class for the livros database table.
 * 
 */
@Entity
@Table(name = "livros")
@NamedQuery(name = "Livro.localizaTodosLivros", query = "SELECT l FROM Livro l")
public class Livro implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Array descricao;
	private Boolean ilustrado;
	private Array isbn;
	private Integer numeroPaginas;
	private Array preco;
	private Array titulo;

	public Livro()
	{
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Array getDescricao()
	{
		return this.descricao;
	}

	public void setDescricao(Array descricao)
	{
		this.descricao = descricao;
	}

	public Boolean getIlustrado()
	{
		return this.ilustrado;
	}

	public void setIlustrado(Boolean ilustrado)
	{
		this.ilustrado = ilustrado;
	}

	public Array getIsbn()
	{
		return this.isbn;
	}

	public void setIsbn(Array isbn)
	{
		this.isbn = isbn;
	}

	@Column(name = "numero_paginas")
	public Integer getNumeroPaginas()
	{
		return this.numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas)
	{
		this.numeroPaginas = numeroPaginas;
	}

	public Array getPreco()
	{
		return this.preco;
	}

	public void setPreco(Array preco)
	{
		this.preco = preco;
	}

	public Array getTitulo()
	{
		return this.titulo;
	}

	public void setTitulo(Array titulo)
	{
		this.titulo = titulo;
	}

}