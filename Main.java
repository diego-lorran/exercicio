package br.ufpb.apspoo.exercicio.formulario;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		Campo campo;
		Formulariofachada fachada = new Formulariofachada();
		Scanner usuario = new Scanner(System.in);
		
		int opcaoUsuario = 3;
		while(opcaoUsuario != 0){
			System.out.println("----Sistema de Cadastro----\n" +
					"[1]Cadastrar\n" +
					"[2]Listar itens cadastrados\n" +
					"[0]Sair");
			opcaoUsuario = usuario.nextInt(); 
			
			switch(opcaoUsuario){
				case 1 :
					boolean op = true;
					while(op){
						System.out.println("----Cadastro de Usuario----");
						System.out.println("Nome :");
						try {
							fachada.inicializaCampo(usuario.next(), new ValidadorTexto());
							fachada.validaCampo(usuario.next());
							fachada.addCampo(campo);
							op = false;
						}catch (CampoInvalidoException e) {
							System.out.println(e.getMessage());
					}
				}			
					op = true;
					while(op){
						System.out.println("E-mail :");
						try {
							fachada.inicializaCampo(usuario.next(), new ValidadorEmail());
							fachada.validaCampo(usuario.next());
							fachada.addCampo(campo);
							op = false;
						} catch (CampoInvalidoException e) {
							System.out.println(e.getMessage());
						}
					}	
					op = true;
					while(op){
						System.out.println("Idade :");
						try {
							fachada.inicializaCampo(usuario.next(), new ValidadorNumerico());
							fachada.validaCampo(usuario.next());
							fachada.addCampo(campo);
							op = false;
						} catch (CampoInvalidoException e) {
							System.out.println(e.getMessage());
						}catch(NumberFormatException e){
							System.out.println(e.getMessage());
						}
					}
					op = true;
					while(op){
					System.out.println("Login :");
						try {
							fachada.inicializaCampo(usuario.next(), new ValidadorSenhaTextoDecorator(new ValidadorTexto()));
							fachada.validaCampo(usuario.next());
							fachada.addCampo(campo);
							op = false;
						} catch (CampoInvalidoException e) {
							System.out.println(e.getMessage());
						}catch(NumberFormatException e){
							System.out.println(e.getMessage());
						}	
					}	
					op = true;
					while(op){
					System.out.println("Senha :");
						try {
							fachada.inicializaCampo(usuario.next(), new ValidadorSenhaNumericaDecorator(new ValidadorTexto()));
							fachada.validaCampo(usuario.next());
							fachada.addCampo(campo);
							op = false;
						} catch (CampoInvalidoException e) {
							System.out.println(e.getMessage());
						}catch(NumberFormatException e){
							System.out.println(e.getMessage());
						}	
					}	
				case 2 :
					System.out.println("----Listar Cadastros----");
					fachada.listarCampos();
					System.out.println("FIM.");
				break;
				case 0 :
					System.out.println("Até logo");
				break;
			}
			
		}

	}
}