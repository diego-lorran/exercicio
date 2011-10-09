package br.ufpb.apspoo.exercicio.formulario;

public abstract class ValidadorSenhaTextoDecorator extends ValidadorDecorator{
	
	private int maximo,minimo;
	
	public ValidadorSenhaTextoDecorator(Validador validador){
		super(validador);
		this.maximo = 20;
		this.minimo = 1;
	}
	public void Validar(String s)throws CampoInvalidoException{
		if(s.length() < minimo){
			throw new CampoInvalidoException("O texto nao pode ser vazio!");
		}super.validar(s);
	}

}
