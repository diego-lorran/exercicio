package br.ufpb.apspoo.exercicio.formulario;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Formulario {
	
	private List<Campo> campos;
	private Map<Integer,Campo> mapCampo;
	private static int id = 0;
	private static int numeroCampo = 0;
	
	public Formulario(){
		this.campos = new LinkedList<Campo>();
		this.mapCampo = new HashMap<Integer,Campo>();
		this.id ++;
	}
	
	public void addCampo(Campo campo){
		this.campos.add(campo);
		this.mapCampo.put(numeroCampo ++, campo);
	}

	public Campo getCampo(String Num) {
		return mapCampo.get(Num);
	}
	
	public void listar(){
		for(int i = 0 ; i < mapCampo.size() ; i++){
			System.out.println(mapCampo.get(i));
		}
	}
	public int formularioGetId(){
		return this.id;
	}
	
	public int getSize(){
		return this.campos.size();
	}

}
