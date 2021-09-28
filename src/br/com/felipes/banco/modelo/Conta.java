package br.com.felipes.banco.modelo;

public abstract class Conta {
	
	private static int totalDeContas = 0;
	private Cliente titular;
	private Data abertura;
	private String numero;
	private String agencia;
	private double saldo;
	
	public Conta(Data data, Cliente titular, String numero, String agencia) {
		this.abertura = data;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		totalDeContas += 1;
	}
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo Insuficiente");
		} else {
			this.saldo -= valor;			
		}
	}
	
	public double calculaRendimento() {
		double rendimento = this.saldo*0.1;
		return rendimento;
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("So pode depositar valor maior que 0");
		} else {
			this.saldo += valor;
		}
	}
	
	public void transferePara(Conta conta, double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			conta.deposita(valor);
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
	 
	 public String recuperaDadosParaImpressao() {
		 String saldo = Double.toString(getSaldo());
		 return "agencia: " + getAgencia() + " conta: " + getNumero() + " saldo: " + saldo
		 + "data: " + getAbertura().recuperaData();
		 
	 }

	public Data getAbertura() {
		return abertura;
	}
	


}
