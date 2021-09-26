package br.com.felipes.banco;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registro(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonicacao();
	}

	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}

	
	
	
}
