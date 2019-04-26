package manipular_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Exemplo1 {
	public static void main(String[] args) {
//		representa um arquivo
//		- o arquivo informado aqui deve existir ou então ser criado com um método informado abaixo
//		- a estrutura de diretório utilizada abaixo é referente ao Linux. Outro sistema operacional,
//		possivelmente, terá uma estrutura diferente.
		File arquivo = new File("/home/lucas/texto.txt");

		try {
//			verifica se o arquivo existe
			boolean existe = arquivo.exists();
			System.out.println(existe);

//			caso o arquivo não exista, é possível criá-lo com:
//			arquivo.createNewFile();

//			procedimento necessário para escrever em um arquivo
//			FileWriter fw = new FileWriter(arquivo); //SUBSTITUIR o arquivo aberto.
			FileWriter fw = new FileWriter(arquivo, true); //ADICIONAR texto ao arquivo já existente.
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Exemplo de texto");
			bw.write("nova linha de texto");
			bw.newLine();
			bw.close();
			fw.close();

//			procedimento para ler um arquivo
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
