package exerciciocasaportas;

public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Fulano", 18);
		
//		Teste da classe Pessoa
		System.out.println(p.nome);
		System.out.println(p.idade);
		p.fazAniversario();
		System.out.println(p.idade);
		
//		Teste da classe Porta
		Porta p1 = new Porta("Verde", 2.1, 1, 0.05);
		System.out.println(p1.aberta);
		System.out.println(p1.cor);
		System.out.println(p1.altura);
		System.out.println(p1.largura);
		System.out.println(p1.espessura);
		p1.abre();
		System.out.println(p1.estaAberta());
		p1.fecha();
		System.out.println(p1.estaAberta());
		p1.pinta("Verde Claro");
		System.out.println(p1.cor);
		
//		Teste da classe Casa
		Casa c1 = new Casa(p1);
		c1.pinta("Azul");
		System.out.println(c1.cor);
		
		System.out.print("Total de portas: ");
		System.out.println(c1.totalDePortas());
		
		System.out.print("Portas abertas: ");
		System.out.println(c1.quantasPortasEstaoAbertas());
		
		System.out.println("Abrindo a primeira porta...");
		c1.portas.get(0).abre();
		
		System.out.print("Portas abertas: ");
		System.out.println(c1.quantasPortasEstaoAbertas());
		
		System.out.println("Criando uma nova porta...");
		Porta p2 = new Porta("Amarela", 2.1, 0.9, 0.1);
		
		System.out.println("Abrindo a segunda porta...");
		p2.abre();
		
		System.out.println("Adicionando a nova porta (aberta)...");
		c1.adicionarPorta(p2);
		
		System.out.print("Total de portas: ");
		System.out.println(c1.totalDePortas());
		System.out.print("Portas abertas: ");
		System.out.println(c1.quantasPortasEstaoAbertas());
		
		System.out.println("Fechando a segunda porta...");
		c1.portas.get(1).fecha();
		System.out.print("Portas abertas: ");
		System.out.println(c1.quantasPortasEstaoAbertas());		
	}
}
