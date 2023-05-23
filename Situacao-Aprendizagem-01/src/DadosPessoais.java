
public class DadosPessoais {
	
	private String Nome;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		if(Nome.isEmpty()) {
			System.out.println( " Digite um nome válido ");
			System.exit(0);
		}else { 
			if (Nome.length()>=3) { 
				this.Nome = Nome;
			}else {
				System.out.println(" DIGITE O NOME COM MAIS DE 3 CARACTERES");
				System.exit(0);
					}
			}
	}
	
	private String sobrenome;
	
	public String getsobrenome() {
		return sobrenome;
	}

	public void setsobrenome(String sobrenome) {
		if(sobrenome.isEmpty()) {
			System.out.println( " Digite um sobrenome válido");
			System.exit(0);
		}else { 
			if (Nome.length()>=3) { 
				this.sobrenome = sobrenome;
			}else {
				System.out.println(" DIGITE O SOBRENOME COM MAIS DE 3 CARACTERES");
				System.exit(0);
			}
			}
			}
	
	private String dataNascimento;
	
	public String getdataNascimento() {
		return dataNascimento;
	}

	public void setdataNascimento(String dataNascimento) {
		if(dataNascimento.isEmpty()) {
			System.out.println( " Digite a data de nascimento válida");
			System.exit(0);
		}else { 
			if (dataNascimento.length() ==10) { 
				this.dataNascimento = dataNascimento;
			}else {
				System.out.println(" DIGITE A DATA COM MAIS DE 10 NÚMEROS ");
				System.exit(0);
			}
		}
	}
	
	private String Genero;
	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		
		this.Genero = genero;
		if(genero.isEmpty() ) {
			System.out.println( " INFORME SEU GÊNERO");
			System.exit(0);
		}else { 
			if (genero.equalsIgnoreCase("FEMININO") ) { 
				this.Genero = genero;
			}else {
				if (genero.equalsIgnoreCase("MASCULINO") ) {
					this.Genero = genero;
				}else {
					if (genero.equalsIgnoreCase("OUTROS") ) { 
						this.Genero = genero;
					}else {
						System.out.println("GÊNERO NÃO VALIDO");
						System.exit(0);
					}
				}
					
			}
		}
	}
}


    
