package br.com.fiap.jogo;

public interface Movimentacao {
	
	//default void mover(ObjetoJogo objetoJogo, int x, int y) {
    //eu podia ter feito a movimentação no objetoJogo tbm, diretamente para o x e y que eu quiser 
		//objetoJogo.setX(x);
		//objetoJogo.setY(y);
		//System.out.println(objetoJogo.getNome() + " sua posição agora é x= " + x + " e em y= " + y + "\n*2");
		
		
	//caso a movimentação seja somando variaveis de x e y, quaisquer direções: 
		default void mover(ObjetoJogo objetoJogo, int x, int y) {
				int newX = objetoJogo.getX() + x;
				int newY = objetoJogo.getY() + y;
				objetoJogo.setX(newX);
				objetoJogo.setY(newX);
				System.out.println(objetoJogo.getNome() + " sua posição agora é x= " + newX + " e em y= " + newY + "\n");
		
    }
	
	
	
	

}
