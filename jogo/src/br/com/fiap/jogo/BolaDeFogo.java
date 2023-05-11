package br.com.fiap.jogo;

public class BolaDeFogo extends ObjetoJogo implements Movimentacao {
	private int poder;

public int getPoder() {
	return poder;
}
@Override
public String getNome() {
	return "bola de fogo";
}
public void setPoder(int poder) {
	this.poder = poder;
	
}

}
