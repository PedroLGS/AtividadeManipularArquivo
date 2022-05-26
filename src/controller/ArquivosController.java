package controller;

import java.io.IOException;

public interface ArquivosController {

	public void leDir(String caminho) throws IOException;
	public void leArquivo(String caminho, String nome, int codigo) throws IOException;
	public void escreveArquivo(String caminho, String nome) throws IOException;
	public void abreArquivo(String caminho, String nome) throws IOException;
	public void manipulaArquivo(String caminho, String nome) throws IOException;
	
}