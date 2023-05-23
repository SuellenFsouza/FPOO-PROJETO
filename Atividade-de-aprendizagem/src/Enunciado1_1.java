
public class Enunciado1_1 {
	private int N1;
	private int N2;
	
	public void testeMenor() {
		
		if (getN1() > getN2()) {
			System.out.println(" o valor:   "+ N1 + " É MAIOR QUE VALOR:  " + N2);
		}else {
			System.out.println("o valor: "+ N2+ " É MAIOR QUE VALOR: "+ N1);
		}
	}
	
	
	public int getN1() {
		return N1;
	}
	public void setN1(int n1) {
		N1 = n1;
	}
	public int getN2() {
		return N2;
	}
	public void setN2(int n2) {
		N2 = n2;
	}
	

}
