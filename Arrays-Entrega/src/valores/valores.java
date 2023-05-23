package valores;

import java.util.Scanner;

public class valores {
	
	int[] valor1 = new int [10];
	int[] valor2 = new int [10];
	Scanner objScanner = new Scanner (System.in);
	
	public void ValoresNumericos() {
		
		int cont = 0;
		while (cont < valor1.length) {
			System.out.println("DIGITE UM VALOR " + (cont +1 ));
			valor1[cont] = objScanner.nextInt();
			cont++;
			
		}
		cont = 0;
		while(cont < valor2.length) {
			valor2[cont] = valor1[cont]*3;
			cont++;
		}
		System.out.println("LISTAGEM DE VALORES: ");
		cont = 0;
		while(cont < valor1.length) {
			System.out.println((cont + 1) + " VALOR: " + valor1[cont]);
			System.out.println((cont + 1) + " VALOR MULTIPLICADO: " + valor2[cont]);
			cont++;
		}
	}	
}
