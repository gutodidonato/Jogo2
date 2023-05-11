package br.com.fiap.jogo;

public abstract class ObjetoJogo implements Movimentacao {
	private String nome;
	//agora todo mundo herda
	//settar a posicao inicial de todo mundo aleatória 
	private int x = (int) (Math.random()*100); 
	private int y = (int) (Math.random()*100);
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
