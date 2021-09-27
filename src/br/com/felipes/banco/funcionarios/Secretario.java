package br.com.felipes.banco.funcionarios;

public class Secretario extends Funcionario {

	public Secretario(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public double getBonicacao() {
		return super.getBonicacao() + 1000;
	}
	
}
