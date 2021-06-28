package br.edu.univas.prova;
import java.util.Scanner;

public class Questao1Prova2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double[] peso = new double [5];
		double[] altura = new double [5];

		int normal = 0;
		double imc = 0;
		int porcentagemnormal = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o peso");
			peso[i] = leitura.nextDouble();
			System.out.println("Digite a altura");
			altura[i] = leitura.nextDouble();

			imc = peso[i] / (altura[i] * altura[i]);
			if (imc >= 18.5 && imc <= 24.9) {
				normal++;
			}
		}
		
		porcentagemnormal = (normal * 100) / 5;
		System.out.println("Porcentagem de pessoas com IMC normal: " +porcentagemnormal+ "%");

		
		leitura.close();
	}
}