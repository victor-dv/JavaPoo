package atividade.two;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product name, price, quantity ;
		name = new Product();
		price = new Product();
		quantity = new Product();
		
		
		Scanner scanner = new Scanner(System.in);
		
		int acao ;
		
		System.out.println("==== BEM VINDO ====");
		System.out.println("Perguntas sobre o produto:");
		System.out.println("1. Deseja ver estoque TV:");
	    acao = scanner.nextInt();
		
	    
		if(acao == 1) {
			System.out.println(name.nomeP());
			System.out.println(price.valor());
			System.out.println(quantity.quanti());
			
			
		}
		
		
		

	}

}
