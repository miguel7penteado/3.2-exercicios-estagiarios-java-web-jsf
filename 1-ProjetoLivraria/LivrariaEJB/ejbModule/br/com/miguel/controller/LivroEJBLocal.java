package br.com.miguel.controller;

import java.util.List;

import javax.ejb.Local;

import br.com.miguel.model.Livro;

@Local
public interface LivroEJBLocal
{
	public List<Livro> localizaLivros();
	public Livro localizaLivroPorID(Long id);
	public Livro criaLivro(Livro livro);
	public void apagaLivro(Livro livro);
	public Livro atualizaLivro(Livro livro);
	
}
