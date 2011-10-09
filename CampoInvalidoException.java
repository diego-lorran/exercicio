package br.ufpb.apspoo.exercicio.formulario;

public class CampoInvalidoException extends Exception {
	
	String msg;
	
	public CampoInvalidoException(String msg){
		this.msg = msg;
	}
	
}
