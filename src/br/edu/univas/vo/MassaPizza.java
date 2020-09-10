package br.edu.univas.vo;

public class MassaPizza implements Ingredientes{
	@Override
	public String descricao() {
		return "Pizza";
	}
	@Override
	public double preco() {
		return 12;
	}

}