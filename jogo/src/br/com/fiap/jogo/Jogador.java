package br.com.fiap.jogo;

public abstract class Jogador extends ObjetoJogo implements Movimentacao {
	
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	public Jogador(String nome, int xp, int hp, boolean envenenado) {
		this.nome = nome;
		this.xp = xp;
		this.hp = hp;
		this.envenenado = envenenado;

	}

	
	
	public void receberDano(int pontos) {
		hp -= pontos;
		if(foiDerrotado()) {
			System.out.println("Game Over " + nome);
		}
	}

	public void receberCura(int pontos) {
		hp += pontos;		
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public void ganharExperiencia(int pontos) {
		xp += pontos;		
	}

	public void receberAntidoto() {
//		if(isEnvenenado()) { //code smell
//			envenenado = false;
//		}
//		
//		if(!isEnvenenado()) {
//			envenenado = true;
//		}
		
		envenenado = !envenenado;
		
	}

	public void atacar(Jogador jogador) {
		// this -> atacante
		// jogador -> atacado
		jogador.receberDano(this.getXp());
		if(jogador.foiDerrotado())
			ganharExperiencia(jogador.getXp());
		
	}

	private boolean foiDerrotado() {
		return hp <= 0;
	}



}

	

