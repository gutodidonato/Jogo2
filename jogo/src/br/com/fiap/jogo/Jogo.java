package br.com.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		Mago mago1 = new Mago("Gandalf", 0, 0, false);
		Guerreiro guerreiro1 = new Guerreiro ("MachadoDeAssis", 0, 0, false);
		Dragao dragao = new Dragao();
		BolaDeFogo bolaDeFogo = new BolaDeFogo();
		Fase fase1 = new Fase();
		
	
	//	mostrarJogador(jogador1);
	//	jogador1.receberDano(10);
	//	mostrarJogador(jogador1);
	//	jogador1.receberCura(5);
	//	mostrarJogador(jogador1);
	//	jogador1.ganharExperiencia(20);
	//	mostrarJogador(jogador1);
	//	jogador1.receberAntidoto();
	//	mostrarJogador(jogador1);
	//	jogador2.atacar(jogador1);
	//	mostrarJogador(jogador1);
		
	//	System.out.println("Jogador 2 " + jogador2.getNome() + 
	//						" XP=" + jogador2.getXp() +
	//						" HP=" + jogador2.getHp() +
	//						" Env=" + jogador2.isEnvenenado() 
	//		);
//	}
//
//private static void mostrarJogador(Jogador jogador1) {
//		System.out.println("Jogador 1 " + jogador1.getNome() + 
//							" XP=" + jogador1.getXp() +
//							" HP=" + jogador1.getHp() +
//							" Env=" + jogador1.isEnvenenado() 
//						);
		
		fase1.carregar(bolaDeFogo);
		fase1.mover(bolaDeFogo, 25, 25);
		fase1.carregar(guerreiro1);
		fase1.mover(guerreiro1, 30, 30);
		fase1.carregar(mago1);
		fase1.mover(mago1, 30, 30);
		fase1.carregar(dragao);
		fase1.mover(dragao, 20, 20);
		//iniciam posição aleatória > carregar 
		//move a posição deles somando os X e Y
	}
}
