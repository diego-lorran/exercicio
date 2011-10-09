package br.ufpb.apspoo.exercicio.formulario;

public class ValidadorTexto implements Validador{
	
	private int maximo,minimo;
	
	public ValidadorTexto(){
		this.maximo = 300;
		this.minimo = 5;
	}

	public void validar(String s)throws CampoInvalidoException{
			if ((s.length() > maximo)||(s.length() < minimo)){
				throw new CampoInvalidoException("O texto deve ter no mínimo" + minimo  +"caracteres e no maximo " + maximo + "caracteres");
			}
			char [] c = s.toCharArray();
			for(int i = 0 ; i < c.length ; i++){
				if((c[i] >= 0)||(c[i] <= 9)){
					throw new CampoInvalidoException("O texto nao pode conter numeros!");
				}
			}
	}

}
