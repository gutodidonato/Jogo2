package br.com.fiap.jogo;

public interface Fase {

	public static final int x = 0;
	public static final int y = 0;

	default void mover(int x, int y) {
		System.out.println("a posição x é " + x + "e a posição y é " + y);
	
						
	}
	
	

}
