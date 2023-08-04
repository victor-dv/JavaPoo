package atividade.two;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product produto ;
        produto = new Product();
		
		
		Scanner scanner = new Scanner(System.in);
		
		int acao ;
		
		System.out.println("==== BEM-VINDO ====");
		System.out.println("Perguntas sobre o produto:");
		System.out.println("1. Deseja inserir no estoque:");
		produto.nome = scanner.next();
		System.out.println("2. Preço do produto " + produto.nome + ":" );
		produto.preco = scanner.nextDouble();
	    System.out.println("3. Deseja inserir no estoque: ");
	    produto.quantidade = scanner.nextInt();
		System.out.println("Valor total do estoque:");
		System.out.print( produto.valorTp() + "\n" );
		System.out.println("=========================================================");
		
		System.out.println("Nome: " + produto.nome + "\n"
				+ "Preço desejado: " + produto.preco + "\n"
				+ "Estoque : " + produto.quantidade + "\n"
                + "Valor total: " + produto.valorTp());
		
		System.out.println("1. Deseja adicionar no estoque" + "\n"
				+ "2. Deseja retirar");
		acao = scanner.nextInt();
		int valorAdd = 0;
		
		if(acao == 1) {
			System.out.println("Quantos deseja add:");
			valorAdd = scanner.nextInt();
            produto.addP(valorAdd);
            System.out.println("" + produto.quantidade);
            System.err.println("" + produto.valorTp());
            
            System.out.println("=========================================================");
    		
    		System.out.println("Nome: " + produto.nome + "\n"
    				+ "Preço desejado: " + produto.preco + "\n"
    				+ "Estoque : " + produto.quantidade + "\n"
                    + "Valor total: " + produto.valorTp() + "\n");
            
		}else if(acao == 2) {
			
			System.out.println("Quantos deseja retirar:");
			valorAdd = scanner.nextInt();
			produto.endP(valorAdd);
			System.out.println("" + produto.quantidade);
			System.out.println("" + produto.valorTp() + "\n");
			
			 System.out.println("=========================================================");
	    		
	    		System.out.println("Nome: " + produto.nome + "\n"
	    				+ "Preço desejado: " + produto.preco + "\n"
	    				+ "Estoque : " + produto.quantidade + "\n"
	                    + "Valor total: " + produto.valorTp());
			
		}
		
		
		

	}

}
