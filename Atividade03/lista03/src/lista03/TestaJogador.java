package lista03;

public class TestaJogador {

	public static void main(String[] args) {
		Jogador j1 = new Jogador(5, 1, 5000);
		Jogador j2 = new Jogador(5, 3, 5000);
		
		j1.Atacar(j2);
		j2.Atacar(j1);
		
		System.out.println(j1.pontosAtuais);
		System.out.println(j2.pontosAtuais);
	}

}
