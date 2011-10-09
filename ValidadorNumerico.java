package br.ufpb.apspoo.exercicio.formulario;

public class ValidadorNumerico implements Validador{
	
	private int maximo,minimo;
	
	public ValidadorNumerico(){
		this.maximo = 150;
		this.minimo = 0;
	}
	
	public void validar(String s) throws CampoInvalidoException{
		try{
			int v = Integer.parseInt(s);
			if((v < minimo)||(v > maximo))
				throw new CampoInvalidoException("valor Invalido");
		}catch(NumberFormatException e){
			throw new CampoInvalidoException("valor nao é um numero");
		}
	}
}
