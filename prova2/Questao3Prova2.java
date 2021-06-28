package br.edu.univas.prova;
import java.util.Scanner;

public class Questao1Prova2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[] notas = new int [50];
		int direto = 0;
		int recup = 0;
		int depend = 0;
		int porcentagemdireto = 0;
		int porcentagemrecup = 0;
		int porcentagemdepend = 0;
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Digite a nota");
			notas[i] = leitura.nextInt();
			
			if (notas [i] >= 60) {
				direto++;
			}
			else if (notas [i] >= 30 && notas [i] < 60) {
				recup++;
			}
			else if (notas[i] < 30) {
				depend++;
			}
		}
		
		porcentagemdireto = (direto * 100) / (50);
		porcentagemrecup = (recup * 100) / (50);
		porcentagemdepend = (depend * 100) / (50);

		System.out.println("Quantidade de alunos que passaram direto: "+ direto);
		System.out.println("Porcentagem : " +porcentagemdireto+ "%");
		System.out.println("Quantidade de alunos que estão em recuperação: "+ recup);
		System.out.println("Porcentagem : " +porcentagemrecup+ "%");
		System.out.println("Quantidade de alunos que estão em dependência: "+ depend);
		System.out.println("Porcentagem : " +porcentagemdepend+ "%");
		
		
		
		leitura.close();
	}
}
