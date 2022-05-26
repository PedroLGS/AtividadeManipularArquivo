package view;

import java.io.IOException;

import controller.ArquivoController;
import controller.ArquivosController;

public class Principal {

	public static void main(String[] args) {
		ArquivosController arqCont = new ArquivoController();
		
		String caminho = "C:\\TEMP";
		String nome = "generic_food.csv";
    	int codigo = 1;
		try {
//			arqCont.leDir(caminho);
//			arqCont.escreveArquivo(caminho, nome);
//			arqCont.leArquivo(caminho, nome, codigo);
//			arqCont.abreArquivo(caminho, nome);
			arqCont.manipulaArquivo(caminho, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}