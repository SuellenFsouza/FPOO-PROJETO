package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner (System.in);
		String produto;
		double valor = 0, quantidade;
		
		produto = JOptionPane.showInputDialog("DIGITE O CODIGO");
		
		switch (produto ) {
		case "A001":
			
			quantidade = Double.parseDouble(JOptionPane.showInputDialog("QUANTIDADE DE PRODUTOS COMPRADOS:"));
			valor = quantidade * 7.50;
			
			break;
			
		case "A002":
						
			quantidade = Double.parseDouble(JOptionPane.showInputDialog("QUANTIDADE DE PRODUTOS COMPRADOS:"));
			valor = quantidade * 9.90;
						
			break;
			
		case "A003":
			
			quantidade = Double.parseDouble(JOptionPane.showInputDialog("QUANTIDADE DE PRODUTOS COMPRADOS:"));
			valor = quantidade * 14;
						
			break;
			
		case "A004":
					
			quantidade = Double.parseDouble(JOptionPane.showInputDialog("QUANTIDADE DE PRODUTOS COMPRADOS:"));
			valor = quantidade * 19.99;
								
			break;
			
			default:
			break;
		}
		
		JOptionPane.showMessageDialog(null, "total:" + valor);
 }
}
