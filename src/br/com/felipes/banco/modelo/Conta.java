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
		if(valor < 0) {
			throw new IllegalArgumentException("Nao pode sacar valor negativo");
		}else if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo Insuficiente");
		}else if(valor >= 10000) {
				throw new IllegalArgumentException("Não pode sacar acima de 10000 reais");
			}
		 else {
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
		saca(valor);
		conta.deposita(valor);
	}
	
	
	public double calculaDeRendimento() {
		return this.saldo*0.1;
	}
	

	public Cliente getTitular() {
		return titular;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
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
	
	
	public String getTipo() {
		return getClass().getSimpleName();
	}
	


}
