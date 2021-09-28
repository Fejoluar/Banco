package br.com.felipes.banco.modelo;

public class TestesContas {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("fe", "32345-g5");
		Data data = new Data(2021,9,15);
		
		ContaCorrente cc = new ContaCorrente(data, c1, "23423f5", "234234r");
		
		cc.setSaldo(3000);
		
		String dados = cc.recuperaDadosParaImpressao();
		
		System.out.println(dados);
		
		System.out.println(cc.getAbertura().recuperaData());
		
		
		
	}

}
