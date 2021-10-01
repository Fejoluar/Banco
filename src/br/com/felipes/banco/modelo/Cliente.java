package br.com.felipes.banco.modelo;

import br.com.felipes.banco.funcionarios.Autenticavel;

public class Cliente implements Autenticavel {
	
	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco;
	private String senha;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getTipo() {
		String tipo = getClass().getSimpleName();
		return tipo;
	}


}
