package br.com.sesi.model;

public class Informacoes {
	
	protected String nome;
	
	protected String cantor;
	
	protected int duracao;
	
	protected int totalDeReproducao;
	
	protected int curtidas;
	
	protected int classificacao;
	
	protected String album;
	
	protected String genero;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getTotalDeReproducao() {
		return totalDeReproducao;
	}

	public void setTotalDeReproducao(int totalDeReproducao) {
		this.totalDeReproducao = totalDeReproducao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	
	
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public void imprimeAudio() {
		
		System.out.println("Nome da musica: " + nome);
		System.out.println("Nome do cantor: " + cantor);
		System.out.println("Album: " + album);
		System.out.println("Genêro: " + genero );
		System.out.println("Duração: " + duracao + " minutos");
		System.out.println("O total de curtidas: " + curtidas + " ♥");
		System.out.println("O total de reprodução: " + totalDeReproducao);
	}
	
	
	public void curtir() {
	System.out.println("----- ♥ você curtir essa musica------");
		
	}
	

}
