package br.com.felipes.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(Data abertura,Cliente titular, String numero, String agencia) {
		super(abertura, titular, numero, agencia);
	}	

	@Override
	public double getValorDeImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo()*0.01;
	}
	
	
}

		


