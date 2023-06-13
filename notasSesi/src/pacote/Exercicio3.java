package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
			
			Scanner objScanner = new Scanner (System.in);
			String cargo;
			double salario = 0, total = 0, x, y;
			
			cargo = JOptionPane.showInputDialog("DIGITE O CODIGO");
			
			salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO"));
			
			switch (cargo) {
				case "1" :
					
					y = salario;
					x = y/100;
					total = salario + (x *50);
	
					JOptionPane.showMessageDialog(null, "SEU CARGO É: ESCRITURÁRIO. E SEU ATUAL SALÁRIO É DE :  "+ total + " HOUVE AUMENTO DE 50%");
									
					break;
					
				case "2" :
					
					y = salario;
					x = y/100;
					total = salario + (x *35);
	
					JOptionPane.showMessageDialog(null, "SEU CARGO É: SECRETÁRIO. E SEU ATUAL SALÁRIO É DE :  "+ total + " HOUVE AUMENTO DE 35%");
									
					break;
					
				case "3" :
					
					y = salario;
					x = y/100;
					total = salario + (x * 20);
	
					JOptionPane.showMessageDialog(null, "SEU CARGO É: CAIXA. E SEU ATUAL SALÁRIO É DE :  "+ total + " HOUVE AUMENTO DE 20%");
									
					break;
					
				case "4" :
					
					y = salario;
					x = y/100;
					total = salario + (x * 10);
	
					JOptionPane.showMessageDialog(null, "SEU CARGO É: GERENTE. E SEU ATUAL SALÁRIO É DE :  "+ total + " HOUVE AUMENTO DE 10%");
									
					break;
				case "5" :
					
					y = salario;
					total = salario;
	
					JOptionPane.showMessageDialog(null, "SEU CARGO É: DIRETOR. E SEU ATUAL SALÁRIO É DE :  "+ total + " NÃO HOUVE AUMENTO ");
									
					break;
					
					default:
					break;
			}
			
	 }
	}
	
	
