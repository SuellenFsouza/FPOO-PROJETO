
public class DadosContato {
	
    private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.isEmpty()) {
			System.out.println( " Digite um nome v�lido ");
			System.exit(0);
		}else { 
			this.email = email;
	}
	} 
	
	private String Telefone;

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone( String Telefone) {
		if(Telefone.isEmpty()) {
			System.out.println( " Digite um numero v�lido ");
			System.exit(0);
		}else {
			if (Telefone.length()==15) {
				this.Telefone = Telefone;
			}else {
				System.out.println(" DIGITE UM TELEFONE COM 15 N�MEROS");
				System.exit(0);
			}
		}
	}
}