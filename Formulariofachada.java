package br.ufpb.apspoo.exercicio.formulario;

public class Formulariofachada {
	
	private Formulario form;
	private Campo campo;
	
	public Formulariofachada(){
		form  = new Formulario();
	}
	
	public void inicializaCampo(String s, Validador v){
		campo = new Campo(s,v);
	}
	
	public void validaCampo(String s){
		campo.validar(s);
	}
	
	public void addCampo(Campo c){
		form.addCampo(c);
	}
	
	public void listarCampos(){
		form.listar();
	}
	
	public int getSize(){
		return form.getSize();
	}
}
