package br.com.felipes.banco.funcionarios;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public double getBonicacao(Funcionario funcionario) {
		return super.getBonicacao() + 3000;
	}
	
	

}
