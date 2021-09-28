package br.com.felipes.banco.funcionarios;

public class Engenheiro extends Funcionario {

	public Engenheiro(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public double getBonicacao() {
		return super.getSalario()*0.3;
	}

	@Override
	public String setNomeDepartamento(String nome) {
		return nome;
	}

	@Override
	public String getNomeDepartamento() {
		// TODO Auto-generated method stub
		return null;
	}

}
