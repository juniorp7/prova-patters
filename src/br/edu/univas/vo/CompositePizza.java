package br.edu.univas.vo; 

import java.util.ArrayList; 
import java.util.List; 

public class CompositePizza implements Ingredientes{ 

	private List<Ingredientes> ingredienteList; 

	public CompositePizza() { 
		ingredienteList = new ArrayList<>(); 
	} 
	@Override 
	public String descricao() { 
		String descricao = ""; 
			for (Ingredientes ingrediente : ingredienteList) { 
				descricao += ingrediente.descricao(); 
				descricao +=" "; 
			} 
		return descricao; 
 	} 
 
 	@Override 
 	public double preco() { 
 		int price = 0; 
 		for (Ingredientes ingrediente : ingredienteList) { 
 			price += ingrediente.preco(); 
 		} 
 		return price; 
 	} 
 	 
 	public void addComponent(Ingredientes ingrediente) { 
 		ingredienteList.add(ingrediente); 
 	} 
 	 
 	public void removeComponent(Ingredientes ingrediente) { 
 		ingredienteList.remove(ingrediente); 
 	} 
 
 
 } 