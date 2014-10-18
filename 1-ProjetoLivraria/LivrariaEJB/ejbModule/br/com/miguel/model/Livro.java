package br.com.miguel.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the livros database table.
 * 
 */
@Entity
@Table(name="livros")
@NamedQuery(name="Livro.findAll", query="SELECT l FROM Livro l")
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String descricao;
	private boolean ilustrado;
	private String isbn;
	private int numeroPaginas;
	private double preco;
	private String titulo;

	public Livro() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public boolean getIlustrado() {
		return this.ilustrado;
	}

	public void setIlustrado(boolean ilustrado) {
		this.ilustrado = ilustrado;
	}


	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Column(name="numero_paginas")
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}