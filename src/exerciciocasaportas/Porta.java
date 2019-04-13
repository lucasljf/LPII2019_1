package exerciciocasaportas;

public class Porta {
	boolean aberta;
	String cor;
	double altura;
	double largura;
	double espessura;
	
	Porta(String cor, double altura, double largura, double espessura) {
		this.aberta = false;
		this.cor = cor;
		this.altura = altura;
		this.largura = largura;
		this.espessura = espessura;
	}
	
	public void abre() {
		this.aberta = true;
	}
	
	public void fecha() {
		this.aberta = false;
	}
	
	public void pinta(String c) {
		this.cor = c;
	}
	
	public boolean estaAberta() {
		return this.aberta;
	}
}
