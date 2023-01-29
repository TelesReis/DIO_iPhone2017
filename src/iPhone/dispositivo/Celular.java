package iPhone.dispositivo;

import iPhone.musica.Musica;
import iPhone.navegador.Navegador;
import iPhone.telefone.Telefone;

public class Celular implements Musica, Telefone, Navegador{

	@Override
	public void tocar() {
		System.out.println("Tocando m�sica");
		
	}
	
	@Override
	public void pausar() {
		System.out.println("M�sica pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Escolhendo m�sica");
		
	}
	
	@Override
	public void ligar() {
		pausar();
		System.out.println("Ligando...");
		
	}

	@Override
	public void atender() {
		pausar();
		System.out.println("Tocando...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		pausar();
		System.out.println("Mensagem de voz");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Abrindo p�gina de internet");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("P�gina atualizada");
		
	}
	
}
