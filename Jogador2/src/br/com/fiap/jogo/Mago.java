package br.com.fiap.jogo;

public class Mago extends Jogador  implements Fase{
	private int mp;

	
	Mago(String nome, int xp, int hp, boolean envenenado, int mp, int x, int y) {
		super(nome, xp, hp, envenenado);
	}



}
