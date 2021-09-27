package br.com.felipes.banco;

public class Engenheiro extends Funcionario {

	public Engenheiro(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public double getBonicacao() {
		return super.getBonicacao() + 22500; 
	}

}
