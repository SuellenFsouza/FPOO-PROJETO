package br.com.sesi.app;
import br.com.sesi.model.Audios;
import java.util.Scanner;
import br.com.sesi.model.podcast;



public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		Audios primeiroAudio = new Audios();
		
		boolean ativa =true;
		int opcao; 
		
		while(ativa ==true) {
			System.out.println("selecione uma opção");
			
			System.out.println("1- Música: Sparks - Coldplay");
			System.out.println("2- Podcast: Podpah");
			System.out.println("3- Sair do programa");
			opcao = scanner .nextInt();
		
		switch (opcao) {
		
		case 1:
			
			primeiroAudio.setNome("Sparks");
			primeiroAudio.setCantor("Coldplay");
			primeiroAudio.setAlbum("Parachutes");
			primeiroAudio.setGenero("pop");
			primeiroAudio.setDuracao(4);
			primeiroAudio.setTotalDeReproducao(10);
			primeiroAudio.setCurtidas(100);
			
			primeiroAudio.imprimeAudio();
			primeiroAudio.curtir();
		
		break;
		
		case 2 :
		System.out.println("-----------------------------------------------------------------------------");
		
		podcast primeiroPodcast = new podcast();
		
		primeiroPodcast.setNome("Podpah");
		primeiroPodcast.setCurtidas(10);
		primeiroPodcast.setTotalDeReproducao(30);
		primeiroPodcast.setEpisodio(12);
		primeiroPodcast.setMinutosEpisodio(70);
		
		primeiroPodcast.duracaoPodcast();
		primeiroPodcast.imprimeAudio();
		
		break;
		
		case 3:
			System.out.println("Sair do programa");
			ativa =false;
		break;
		default:
			System.out.println("Opção inválida");
		}
	
}
}
}
