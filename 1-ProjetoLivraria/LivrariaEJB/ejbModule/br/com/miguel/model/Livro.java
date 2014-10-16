package br.com.miguel.model;

import java.io.Serializable;
import javax.persistence.*;
<<<<<<< HEAD
=======
import java.sql.Array;
>>>>>>> origin/master

/**
 * The persistent class for the livros database table.
 * 
 */
@Entity
@Table(name = "livros")
<<<<<<< HEAD
@NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l")
=======
@NamedQuery(name = "Livro.localizaTodosLivros", query = "SELECT l FROM Livro l")
>>>>>>> origin/master
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

<<<<<<< HEAD
	public String getDescricao()
=======
	public Array getDescricao()
>>>>>>> origin/master
	{
		return this.descricao;
	}

<<<<<<< HEAD
	public void setDescricao(String descricao)
=======
	public void setDescricao(Array descricao)
>>>>>>> origin/master
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

<<<<<<< HEAD
	public String getIsbn()
=======
	public Array getIsbn()
>>>>>>> origin/master
	{
		return this.isbn;
	}

<<<<<<< HEAD
	public void setIsbn(String isbn)
=======
	public void setIsbn(Array isbn)
>>>>>>> origin/master
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

<<<<<<< HEAD
	public Double getPreco()
=======
	public Array getPreco()
>>>>>>> origin/master
	{
		return this.preco;
	}

<<<<<<< HEAD
	public void setPreco(Double preco)
=======
	public void setPreco(Array preco)
>>>>>>> origin/master
	{
		this.preco = preco;
	}

<<<<<<< HEAD
	public String getTitulo()
=======
	public Array getTitulo()
>>>>>>> origin/master
	{
		return this.titulo;
	}

<<<<<<< HEAD
	public void setTitulo(String titulo)
=======
	public void setTitulo(Array titulo)
>>>>>>> origin/master
	{
		this.titulo = titulo;
	}

}