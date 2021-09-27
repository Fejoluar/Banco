package br.com.felipes.banco.funcionarios;

public class Diretor extends Funcionario implements Autenticavel {

	private String senha;
	
	public Diretor(String nome, String cpf) {
		super(nome, cpf);
	}
	
	
	@Override
	public double getBonicacao() {
		return super.getSalario()*0.1;
	}


	@Override
	public boolean autentica(String senha) {
		if (this.senha == senha) {
		return true;
	} else {
		return false;
	}
}
	
}
