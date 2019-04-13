package exerciciocasaportas;

import java.util.ArrayList;

public class Casa {
	String cor;
	int totalDePortas;
	ArrayList<Porta> portas = new ArrayList<Porta>();
	
//	construtor, exigindo uma porta
	Casa(Porta porta) {
		this.portas.add(porta);
		this.totalDePortas = 1;
	}
	
//	recebendo um array de portas
	Casa(ArrayList<Porta> portas) {
		this.portas = portas;
		this.totalDePortas = portas.size();
	}
	
	public void pinta(String cor) {
		this.cor = cor;
	}
	
//	public int quantasPortasEstaoAbertas() {
//		int quantidade = 0;
//		for (int i = 0; i < this.portas.size(); i++) {
//			if (this.portas.get(i).estaAberta()) {
//				quantidade++;
//			}
//		}
//		return quantidade;
//	}
	
	public int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		for (Porta porta : this.portas) {
			if (porta.estaAberta()) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public void adicionarPorta(Porta porta) {
		this.portas.add(porta);
		this.totalDePortas++;
	}
	
	public int totalDePortas() {
		return this.totalDePortas;
	}
}
