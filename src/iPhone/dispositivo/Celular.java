package iPhone.dispositivo;

import iPhone.musica.Musica;
import iPhone.navegador.Navegador;
import iPhone.telefone.Telefone;

public class Celular implements Musica, Telefone, Navegador{

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}
	
	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Escolhendo música");
		
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
		System.out.println("Abrindo página de internet");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}
	
}
