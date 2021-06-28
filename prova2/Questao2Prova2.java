package br.edu.univas.prova;

import java.util.Scanner;
public class Questao2Prova2 {

	
	public static void main(String[] args) {

	double receitavalor = 0;
	double despesavalor = 0;
	int opcao1;
	int soma = 0;
	int soma2 = 0;
	int resultado = 0;
	
	Scanner leitura = new Scanner(System.in);
	Scanner op = new Scanner(System.in);
	
	do {
	    System.out.println("Escolha tipo de conta");
	    System.out.println("|1| - Receita");
	    System.out.println("|2| - Despesa");
	    System.out.println("|0| - Sair");
    
    
		opcao1 = op.nextInt();
	
	switch (opcao1) {

	case 1: 
		System.out.println("Informe o valor.");
		int valor1 = leitura.nextInt();
		soma += valor1;
		break;
		
	case 2: 
		System.out.println("Informe o valor.");
		int valor2 = leitura.nextInt();
		soma2 += valor2;
		break;

	default:
		if (opcao1 != 0) {
			System.out.println("Opção inválida! Por favor, digite uma opção correta!\n");
		}
	}
	} while (opcao1 != 0);

	resultado = soma - soma2;
	System.out.println("Saldo final:" +resultado);
	if (resultado < 0) {
		System.out.println("Saldo negativo");
		
	}
	else {
		System.out.println("Saldo positivo");
	}
	leitura.close();
	op.close();
}
}