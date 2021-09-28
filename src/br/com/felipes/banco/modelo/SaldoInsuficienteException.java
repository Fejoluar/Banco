package br.com.felipes.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	
	public SaldoInsuficienteException(Conta conta,double valor) {
        if(conta.getSaldo() < valor) {
        	System.out.println("Saldo Insuficiente!");
        }
    }

}
