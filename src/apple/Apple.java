package apple;

import iPhone.dispositivo.Celular;
import iPhone.musica.Musica;
import iPhone.navegador.Navegador;
import iPhone.telefone.Telefone;

public class Apple {
	
	public static void main(String[] args) {
		Celular iPhone = new Celular();
		
		Musica musica = iPhone;
		Telefone telefone = iPhone;
		Navegador navegador = iPhone;
		
		musica.selecionarMusica();
		musica.tocar();
		telefone.ligar();
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		telefone.atender();
		navegador.atualizarPagina();
		telefone.iniciarCorreioVoz();
		
		
	}
	
}
