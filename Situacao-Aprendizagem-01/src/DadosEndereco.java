
public class DadosEndereco {
	
	private String cep ;
	
	private String logradouro;
	
	private String numeroCasa;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if(cep.isEmpty()) {
			System.out.println( " DIGITE UM CEP VÁLIDO");
			System.exit(0);
		}else {
			if (cep.length()>=3) {
				this.cep = cep;
			}else {
				System.out.println(" DIGITE UM CEP COM NO MINIMO 3 NÚMEROS");
				System.exit(0);
			
			}
		}
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if(logradouro.isEmpty()) {
			System.out.println( " DIGITE UM LOGRADOURO VÁLIDO");
			System.exit(0);
		}else {
			if (logradouro.length()>=3) {
				this.logradouro = logradouro;
			}else {
				System.out.println(" DIGITE UM LOGRADOURO COM NO MINIMO NÚMEROS");
				System.exit(0);
			}
		}
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		if(numeroCasa.isEmpty()) {
			System.out.println( " DIGITE UM NUMERO DE CASA VÁLIDO ");
			System.exit(0);
		}else { 
			this.numeroCasa = numeroCasa;
		}
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if(bairro.isEmpty()) {
			System.out.println( " DIGITE UM NOME DE BAIRRO VÁLIDO ");
			System.exit(0);
		}else { 
			this.bairro = bairro;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if(cidade.isEmpty()) {
			System.out.println( " DIGITE UM NOME DE CIDADE VÁLIDO ");
			System.exit(0);
		}else { 
			this.cidade = cidade;
			}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if(estado.isEmpty()) {
			System.out.println( " DIGITE UM NOME DE ESTADO VÁLIDO ");
			System.exit(0);
		}else { 
			if (estado.length()==2) {
				this.estado = estado;
			}else {
				System.out.println(" DIGITE APENAS SIGLA DO ESTADO");
				System.exit(0);
			}
		}
	}
	
}
	
  