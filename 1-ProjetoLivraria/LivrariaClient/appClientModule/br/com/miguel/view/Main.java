package br.com.miguel.view;

import javax.ejb.EJB;

/*
 import javax.enterprise.context.RequestScoped;
 import javax.inject.Inject;
 import javax.inject.Named;
 import java.util.List;
 */

import br.com.miguel.controller.LivroEJBRemote;
import br.com.miguel.model.Livro;

public class Main
{
	@EJB
	private static LivroEJBRemote livroEJB;

	public static void main(String[] args)
	{
		Livro livro = new Livro();
		livro.setTitulo("Os Guardi�es da Gal�xia");
		livro.setPreco(110.0);
		livro.setDescricao("Historia da Marvel");
		livro.setIsbn("N/A");
		livro.setNumeropaginas(37);
		livro.setIlustrado(true);
		livroEJB.criaLivro(livro);
		livro.setTitulo("Os Guardi�es da Gal�xia vs Skrulls");
		livroEJB.atualizaLivro(livro);
	}
}