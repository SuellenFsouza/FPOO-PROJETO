package pacote;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 = 2;
		int nota2 = 13;
		int nota3 = 25;
		
		if (nota1> nota2 && nota1 > nota3) {
			
			System.out.println( nota1 + "  Nota 1 é o maior numero!");
			
		}
		else if(nota2> nota1 && nota2 > nota3) {
			
			System.out.println(nota2 + "  Nota 2 é o maior numero!" );
		}else {
			System.out.println(nota3 + "  Nota 3 é o maior numero");
			
		}
        
	}

}
