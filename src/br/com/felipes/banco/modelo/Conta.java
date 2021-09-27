package br.com.felipes.banco.modelo;

public abstract class Conta {
	
	private static int totalDeContas = 0;
	private Cliente titular;
	private String numero;
	private String agencia;
	private double saldo;
	
	public Conta(Cliente titular, String numero, String agencia) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		totalDeContas += 1;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else 
			return false;
		
	}
	
	public void deposita(double valor) {
		this.saldo  += valor;;	
	}
	
	public boolean transferePara(Conta conta, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == true) {
			conta.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double calculaDeRendimento() {
		return this.saldo*0.1;
	}

	

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public static int getTotalDeContas() {
		return totalDeContas;
	}
	
	
	
	

}
