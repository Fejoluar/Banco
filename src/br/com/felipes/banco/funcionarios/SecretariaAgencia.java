package br.com.felipes.banco.funcionarios;

public class SecretariaAgencia extends Secretario {

	public SecretariaAgencia(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public double getBonicacao() {
		return super.getSalario()*0.1 + 500;
	}

}
