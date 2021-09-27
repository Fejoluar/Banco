package br.com.felipes.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(Cliente titular, String numero, String agencia) {
		super(titular, numero, agencia);
	}
	

	@Override
	public double getValorDeImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo()*0.01;
	}
	
	
}

		


