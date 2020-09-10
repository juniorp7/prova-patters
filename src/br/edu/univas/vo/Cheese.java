package br.edu.univas.vo; 

public class Cheese implements Ingredientes{ 
	@Override 
	public String descricao() { 
		return "Queijo"; 
	} 
	@Override 
	public double preco() { 
		return 3.5; 
	} 
	
} 