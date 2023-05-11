package br.com.fiap.jogo;

public class Mago extends Jogador implements Movimentacao{
	private int mp;
	
	Mago(String nome, int xp, int hp, boolean envenenado) {
		super(nome, xp, hp, envenenado);
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	



	


}
