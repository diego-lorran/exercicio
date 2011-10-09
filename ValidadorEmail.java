package br.ufpb.apspoo.exercicio.formulario;

public class ValidadorEmail implements Validador{
	
	public void validar(String s) throws CampoInvalidoException{
		if(( s.indexOf("@") == 0)||(s.indexOf("@") == s.length())){
			throw new CampoInvalidoException("Email invalido");
		}
		char [] c = s.toCharArray();
		for(int i = 0 ; i < c.length ; i++){
			if((c[i] >= 0)||(c[i] <= 9)){
				throw new CampoInvalidoException("O texto nao pode conter numeros!");
			}
		}
	}

}
