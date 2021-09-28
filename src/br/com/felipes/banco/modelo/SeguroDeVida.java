package br.com.felipes.banco.modelo;

public class SeguroDeVida implements Tributavel {
	
	private double valor;
	private Cliente titular;
	private int numeroApolice;
	
	

	@Override
	public double getValorDeImposto() {
		return this.valor*0.01 + 50;
	}

	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public int getNumeroApolice() {
		return numeroApolice;
	}


	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	
}
