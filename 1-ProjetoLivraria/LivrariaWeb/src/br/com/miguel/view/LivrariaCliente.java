package br.com.miguel.view;

import java.util.ArrayList;
import java.util.List;  

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;  
import javax.inject.Inject;  
import javax.inject.Named;

import br.com.miguel.controller.LivroEJB;
import br.com.miguel.model.Livro;

@Named("ObejtoLivraria")
@RequestScoped
public class LivrariaCliente
{

	@EJB
	private LivroEJB livraria; 
	private Livro livro = new Livro();
	private List<Livro> listaLivros = new ArrayList<Livro>();
	
	
	public LivrariaCliente()
	{
		// TODO Auto-generated constructor stub
	}
	
	public String criaLivro()
	{
		livro = livraria.criaLivro(livro);
		listaLivros = livraria.localizaLivros();
		return "listaLivros.xhtml";
	}

	public LivroEJB getLivraria()
	{
		return livraria;
	}

	public void setLivraria(LivroEJB livraria)
	{
		this.livraria = livraria;
	}

	public Livro getLivro()
	{
		return livro;
	}

	public void setLivro(Livro livro)
	{
		this.livro = livro;
	}

	public List<Livro> getListaLivros()
	{
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros)
	{
		this.listaLivros = listaLivros;
	}
	

}
