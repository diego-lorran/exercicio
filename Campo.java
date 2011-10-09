package br.ufpb.apspoo.exercicio.formulario;


public class Campo {
	
	private String nomeCampo;
	private Validador validador;
	
	public Campo(String nome){
		this.nomeCampo = nome;
	}
	
	public Campo(String nome, Validador validador){
		 this.nomeCampo = nome;
		 this.validador = validador;
	}
	
	public boolean validar(String n){
		try{
			this.validador.validar(n);
			return true;
		}catch(CampoInvalidoException e){
			e.getMessage();
			return false;
		}
	}
	public void setValidador(Validador v){
		this.validador = v; 
	}
	
	public void setNomeCampo(String nome){
		this.nomeCampo = nome;
	}
	
	public String getNome(){
		return this.nomeCampo;
	}

	public Validador getValidador() {
		return this.validador;
	}

}
