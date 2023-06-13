package pacote;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner (System.in);
		String plano;
		
		System.out.println("DIGITE SEU PLANO");
		
		plano = objScanner.next();
		
	 if (plano.equalsIgnoreCase("bronze")) {
			System.out.println("R$ 220,00");
			
		} else if(plano.equalsIgnoreCase("prata")) {
			System.out.println("R$ 310,00");
			
		} else if (plano.equalsIgnoreCase("ouro")) {
			System.out.println("R$ 450,00");
		}else {
			System.out.println("Não existe esse plano de saúde");
		}
	}		
		
		
		

	}


