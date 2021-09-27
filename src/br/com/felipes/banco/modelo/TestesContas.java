package br.com.felipes.banco.modelo;

public class TestesContas {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("fe", "32345-g5");
		
		ContaCorrente cc = new ContaCorrente(c1, "23423f5", "234234r");
		
		cc.setSaldo(3000);
		
		
		
	}

}
