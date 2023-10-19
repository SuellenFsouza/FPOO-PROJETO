package br.com.sesi.model;

public class podcast extends Informacoes{
	
	private int  episodio;

	private int minutosEpisodio;

	public int getEpisodio() {
		return episodio;
	}

	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}

 	public int getMinutosEpisodio() {
		return minutosEpisodio;
	}

	public void setMinutosEpisodio(int minutosEpisodio) {
		this.minutosEpisodio = minutosEpisodio;
	}
	
	@Override
	public void imprimeAudio() {
		// TODO Auto-generated method stub
		super.imprimeAudio();
		System.out.println("Episodios: " + episodio);
		System.out.println("Minutos por episodio: " + minutosEpisodio);
		System.out.println("Duração total: " + duracaoPodcast());
	}
	
/*public void imprimePodcast() {
		
		System.out.println("Nome do podcast: " + nome);
		System.out.println("Duração por epsodio: " + minutosEpisodio + " minutos");
		System.out.println("O total de curtidas: " + curtidas + " ♥");
		System.out.println("Reprodução: " + totalDeReproducao);
		System.out.println("O total de reprodução: " + duracaoPodcast());
	}*/
	public double duracaoPodcast(){
		return minutosEpisodio * episodio;
	}

}
