package br.com.felipes.banco;

public class Gerente extends Funcionario {
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public Gerente(String nome, String cpf) {
		super(nome, cpf);	
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso nao permitido");
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public double getBonicacao() {
		return super.getBonicacao() + 1000;
	}
	
	
	
	
	
	
	

}
