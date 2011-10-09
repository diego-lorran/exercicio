package br.ufpb.apspoo.exercicio.formulario;

public class ValidadorDecorator implements Validador{
	
	private Validador validador;
	
	public ValidadorDecorator(Validador validador){
		this.validador = validador;
	}

	public void validar(String n) throws CampoInvalidoException {
		this.validador.validar(n);
		
	}
	
	

}
