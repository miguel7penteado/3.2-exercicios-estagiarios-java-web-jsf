package br.com.miguel.controller;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import java.util.List;

import br.com.miguel.model.Livro;

@Stateless
@Remote(LivroEJBRemote.class)
public class LivroEJB implements LivroEJBRemote, LivroEJBLocal
{

	@PersistenceContext(unitName = "LivrariaEJB")
	private EntityManager gerenciador;

	public LivroEJB()
	{
	}

	public List<Livro> localizaLivros()
	{
		TypedQuery<Livro> consulta = gerenciador.createNamedQuery(
				"localizaTodosLivros", Livro.class);
		return consulta.getResultList();
	}

	public Livro localizaLivroPorID(Long id)
	{
		return gerenciador.find(Livro.class, id);
	}

	public Livro criaLivro(Livro livro)
	{
		gerenciador.persist(livro);
		return (livro);
	}

	public void apagaLivro(Livro livro)
	{
		gerenciador.remove(gerenciador.merge(livro));
	}

	public Livro atualizaLivro(Livro livro)
	{
		return gerenciador.merge(livro);
	}

}
