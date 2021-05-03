package br.edu.univas.prova;

import java.util.Scanner;
public class trabalho2 {

	
	public static void main(String[] args) {

	double areaRetangulo = 0;
	double areaTriangulo = 0;
	int opcao1;
	
	Scanner resposta = new Scanner(System.in);
	Scanner op = new Scanner(System.in);
	
	do {
	    System.out.println("Escolha um polígono");
	    System.out.println("|1| - Polígono Quadrado");
	    System.out.println("|2| - Polígono Triangulo");
	    System.out.println("|3| - Polígono Retangulo");
	    System.out.println("|4| - Polígono Losango");
	    System.out.println("|5| - Sair");
    
    
		opcao1 = op.nextInt();
	
	switch (opcao1) {

	case 1: 
		System.out.println("Informe a base do quadrado.");
		int base1 = resposta.nextInt();
		System.out.println("Informe a altura do quadrado.");
		int altura1 = resposta.nextInt();
		System.out.println("A area deste quadrado de base =" +base1);
		System.out.println("E altura =" +altura1);
		areaRetangulo = base1 * altura1;
		System.out.println("É " +areaRetangulo+ "\n");
		
		break;
	case 2: 
		System.out.println("Informe a base do triangulo.");
		int base3 = resposta.nextInt();
		System.out.println("Informe a altura do triangulo.");
		int altura3 = resposta.nextInt();
		System.out.println("A area deste triangulo de base =" +base3);
		System.out.println("E altura =" +altura3);
		areaRetangulo = (base3 * altura3);
		areaTriangulo = areaRetangulo / 2;
		System.out.println("É " +areaTriangulo+ "\n");
		
		break;
	case 3: 
		System.out.println("Informe a base do retangulo.");
		int base2 = resposta.nextInt();
		System.out.println("Informe a altura do retangulo.");
		int altura2 = resposta.nextInt();
		System.out.println("A area deste retangulo de base =" +base2);
		System.out.println("E altura =" +altura2);
		areaRetangulo = base2 * altura2;
		System.out.println("É " +areaRetangulo+ "\n");
		
		break;
	case 4: 
		System.out.println("Informe o valor da diagonal 1.");
		int diagonal1 = resposta.nextInt();
		System.out.println("Informe o valor da diagonal 2.");
		int diagonal2 = resposta.nextInt();
		System.out.println("A area deste losango de diagonal =" +diagonal1);
		System.out.println("E diagonal =" +diagonal2);
		areaRetangulo = diagonal1 * diagonal2;
		areaTriangulo = areaRetangulo / 2;
		System.out.println("É " +areaTriangulo+ "\n");
		break;
		
	default:
		if (opcao1 != 5) {
			System.out.println("Opção inválida! Por favor, digite uma opção correta!\n");
		}
	}
	} while (opcao1 != 5);


}
}