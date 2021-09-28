package br.com.felipes.banco.funcionarios;

public abstract class Funcionario implements Departamento {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNomeFuncionario() {
		return nome;
	}
	public void setNomeFuncionario(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public abstract double getBonicacao();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
