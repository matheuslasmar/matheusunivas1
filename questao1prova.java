package br.edu.univas.prova;

public class questao1prova{

	public static void main(String[] args) {
		int a = 10;
		int b = 18;
		int c = 30;
		int d = 5;
		
		double media = (a+b+c+d);
		double mediar = media/4;
				
			if (mediar >= 70) {
			
				System.out.println("Aluno aprovado");
			}
				if (mediar >= 50 & mediar <= 69) {
				
					System.out.println("Aluno em recuperação");
				}
		
					if (mediar < 50) {
					
						System.out.println("Aluno em dependência");
					}
		
		
		
	
	}
}