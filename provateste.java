package br.edu.univas.prova;

public class prova {

	public static void main(String[] args) {
		int a = 4;
		int b = 27;
		int c = 7;
		int d = 10;
		int e = 6;
		
		int soma = 0;
		
		if (a % 2 == 0) {
			soma += a;
		}
		
		if (b % 2 == 0) {
			soma += b;
		}
		
		if (c % 2 == 0) {
			soma += c;
		}
		
		if (d % 2 == 0) {
			soma += d;
		}
		
		if (e % 2 == 0) {
			soma += e;
		}
		
		System.out.println("A soma dos números pares é: " + soma);
	}
}