package br.com.miguel.view;

import java.util.List;  

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;  
import javax.inject.Inject;  
import javax.inject.Named;  

import br.com.miguel.controller.LivroEJBRemote;
import br.com.miguel.model.Livro;

public class Principal 
{
	@EJB
	private  LivroEJBRemote livroEJB;
	
	public static void main(String[] args)
	{
		// Livro livro = new Livro();
				

		
	}

}
