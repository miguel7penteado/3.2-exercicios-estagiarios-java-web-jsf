package br.com.miguel.controller;

import java.util.List;
import javax.ejb.Remote;
import br.com.miguel.model.Livro;

@Remote
public interface LivroEJBRemote
{

	public List<Livro> localizaLivros();

	public Livro localizaLivroPorID(Long id);

	public Livro criaLivro(Livro livro);

	public void apagaLivro(Livro livro);

	public Livro atualizaLivro(Livro livro);

}
