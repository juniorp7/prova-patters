package br.edu.univas.main;

import br.edu.univas.vo.Cheese;
import br.edu.univas.vo.CompositePizza;
import br.edu.univas.vo.MassaPizza;
import br.edu.univas.vo.Onions;
import br.edu.univas.vo.Tomatoes;

public class StartApp {

	public static void main(String[] args) { 
		Cheese cheese = new Cheese();
		MassaPizza pizza = new MassaPizza(); 
		Onions onions = new Onions(); 
		Tomatoes tomatoes = new Tomatoes();  

		CompositePizza composite = new CompositePizza(); 
		composite.addComponent(pizza); 
		composite.addComponent(cheese); 
		composite.addComponent(onions); 
		composite.addComponent(tomatoes); 

		System.out.println(composite.descricao()); 
		System.out.println(composite.preco()); 
	}
}