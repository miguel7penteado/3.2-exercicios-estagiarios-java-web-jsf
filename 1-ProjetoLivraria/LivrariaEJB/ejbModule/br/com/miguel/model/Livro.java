package br.com.miguel.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the livros database table.
 * 
 */
@Entity
@Table(name = "livros")
@NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l")
public class Livro implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String descricao;
	private Boolean ilustrado;
	private String isbn;
	private Integer numeroPaginas;
	private Double preco;
	private String titulo;

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

	public String getDescricao()
	{
		return this.descricao;
	}

	public void setDescricao(String descricao)
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

	public String getIsbn()
	{
		return this.isbn;
	}

	public void setIsbn(String isbn)
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

	public Double getPreco()
	{
		return this.preco;
	}

	public void setPreco(Double preco)
	{
		this.preco = preco;
	}

	public String getTitulo()
	{
		return this.titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

}