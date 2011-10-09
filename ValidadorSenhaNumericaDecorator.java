package br.ufpb.apspoo.exercicio.formulario;

public class ValidadorSenhaNumericaDecorator extends ValidadorDecorator{
	
private int maximo,minimo;
	
	public ValidadorSenhaNumericaDecorator(Validador validador){
		super(validador);
		this.maximo = 100;
		this.minimo = 8;
	}
	public void Validar(String s)throws CampoInvalidoException{
		super.validar(s);
		char n = s.charAt(0);
		for ( int i=1; i < s.length(); i++){
			if( n == s.charAt(i))
				throw new CampoInvalidoException("Senha invalida" + s);
		}
	}

}
