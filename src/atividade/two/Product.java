package atividade.two;

public class Product {
	public String nome;
	public double preco;
	public int quantidade;
	public double valorT;
	public int prodAdd;
	
	public String nomeP() {
		return nome;
	}
	
	public double valorTp() {
		return quantidade * preco;
	    
	
	}
	
	public void addP(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void endP(int quantidade) {
		this.quantidade -= quantidade;
	}
	


	
	
}
