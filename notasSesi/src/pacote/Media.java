package pacote;

public class Media {

	public static void main(String[] args) {
		
		int nota1 = 5;
		int nota2 = 5;
		int nota3 = 5;
		int nota4 = 5;
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4 ) /4;
		
		if(media > 7) {
			
			System.out.println( "aprovado");
		
		} else if ( media >= 5 && media <= 7 ) {
			
			System.out.println(" RECUPERAÇÃO");
			
		}else {
			System.out.println( "REPROVADO" );
		}

	}

}
