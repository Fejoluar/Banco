package br.com.felipes.banco.funcionarios;

public class SecretariaAdministrativa extends Secretario {

	public SecretariaAdministrativa(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public double getBonicacao() {
		return super.getSalario()*0.05 + 300;
	}

}
