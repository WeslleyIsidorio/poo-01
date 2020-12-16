package lista03;

public class Jogador {
	int forca;
	int nivel;
	int pontosAtuais;
	
	Jogador(int forca, int nivel, int pontosAtuais) {
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontosAtuais;
		
	}
	
	int Ataque() {
		int dano = this.forca * this.nivel;
		return dano;
	}
	
	void Atacar(Jogador jogador) {
		jogador.pontosAtuais -= this.Ataque();
	}

}
