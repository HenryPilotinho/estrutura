package aula5_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	final static String ARQ_IN = "C:\\Users\\FATEC ZONA LESTE\\Downloads\\musica.txt";
	static FileReader fr; 
	static BufferedReader br;
	static Scanner leitor;
	
	final static String ARQ_OUT = "C:\\Users\\FATEC ZONA LESTE\\Downloads\\saida.txt";
	static FileWriter fw;
	static BufferedWriter bw;

	
	public static void main(String[] args) throws IOException {
		fr= new FileReader(ARQ_IN);
		br= new BufferedReader(fr);
		fw= new FileWriter(ARQ_OUT);
		bw= new BufferedWriter(fw);
		
		exemploLeitura();
		exemploEscrita();
		ex1DataSubstring();
		ex2Datasplit();
		ex3Datasplit();
		ex4lowerCaseTrim();
		
		
		
	}


	private static void ex4lowerCaseTrim() {
		String respostauser = "nelson nelsin";
		 leitor = new Scanner(System.in);
		System.out.println("Quem descobriu o Brasil?");
		String resposta = leitor.nextLine();
		
		if (resposta.trim().toLowerCase().equals(respostauser)) {
			System.out.println("Parab�ns!");
		} else {
			System.out.println("ta errado nelson");
		}
		
	}


	private static void ex3Datasplit() {
		String nomeComp = "Nelson Nere Nelso";
		String [] nomes = nomeComp.split(" ");
		int ultPos = nomes.length - 1;
		System.out.println(nomes[ultPos]);
	}


	private static void ex2Datasplit() {
		String dataEua = "2020/09/22";
		String[] datas = dataEua.split("/");
		String ano = datas[0];
		String mes = datas[1];
		String dia = datas[2];
		System.out.println(dia+"/"+mes+"/"+ano);
		
	}


	private static void ex1DataSubstring() {
		String dataEua = "2020/09/22";
		String ano = dataEua.substring(0,4);
		String mes = dataEua.substring(5,7);
		String dia = dataEua.substring(8);
		String dataFormat = dia + "/" + mes +"/" + ano;
		System.out.println(dataFormat);
		
	}


	private static void exemploEscrita() throws IOException {
		bw.append("nelsinho linha");
		bw.newLine();
		bw.append("nelsinho 2\n");
		bw.append("nelsinho 3\n");
		bw.flush();
	}


	private static void exemploLeitura() throws IOException {
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}
