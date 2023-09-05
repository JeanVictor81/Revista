package br.com.unit.aula13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
	
	static Revista revista =  new Revista(10, "Piratas");
	static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
	public static void main(String[] args) {
		do {
			System.out.println("Opições: ");
			System.out.println("1- Registar nova edição");
			System.out.println("2- Remover edição");
			System.out.println("3- Reciclar edição");
			System.out.println("4- Listar edições");
			
			String resposta = JOptionPane.showInputDialog("Digite a opção");
			int opcao = Integer.parseInt(resposta);

			switch(opcao) {
			case 1:
				cadastarEdicao();
				break;
			case 2:
				removerEdicao();
				break;
			case 3:
				reciclarExemplare();
				break;
			case 4:
				
			
			}
			
		}while(true);
	
	
	}
	public static void cadastarEdicao(){
		String resposta = JOptionPane.showInputDialog("Digite a tiragem");
		int tiragem = Integer.parseInt(resposta);
		String resposta2 = JOptionPane.showInputDialog("Digite a tiragem");
		int qtdeVendida = Integer.parseInt(resposta2);
		
		
		revista.adicionarEdicao(tiragem, qtdeVendida);
		
	}
	
	public static void removerEdicao() {
		revista.toString();
		
		String resposta = JOptionPane.showInputDialog("Digite o numero da edição que deseja apagar");
		int codigo = Integer.parseInt(resposta);
		revista.removerEdicao(codigo);
		
		if(!revista.removerEdicao(codigo)) {
			System.out.println("Edição não encontra");
			return;
		}
		System.out.println("Edição removida!");
		
	}
	public static void reciclarExemplare() {
		String resposta = JOptionPane.showInputDialog("Digite o numero da edição que deseja Reciclar");
		int codigo = Integer.parseInt(resposta);
		
		revista.reciclarEdicao(codigo);
		
	}
	public static void listarExemplare() {
		System.out.println(revista);
	}
	
	
	
	
}
