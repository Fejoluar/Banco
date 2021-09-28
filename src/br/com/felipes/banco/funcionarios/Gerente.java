package br.com.felipes.banco.funcionarios;

public class Gerente extends Funcionario implements Autenticavel {
	
	private String senha;
	
	public Gerente(String nome, String cpf) {
		super(nome, cpf);	
	}	
	
	public void setSenha(String senha) {
		this.senha = senha;
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
