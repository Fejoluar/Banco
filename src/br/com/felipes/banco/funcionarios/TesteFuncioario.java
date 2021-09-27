package br.com.felipes.banco.funcionarios;

public class TesteFuncioario {

	public static void main(String[] args) {
		
		
		 Funcionario gerente = new Gerente("Cacau", "123-5454");
		 Funcionario secretario = new Secretario("Felipe","074-13243");
		 ControleDeBonificacoes controle = new ControleDeBonificacoes();
		 
		 gerente.setSalario(10000);
		 secretario.setSalario(5000);
		 
		 controle.registro(secretario);
		 controle.registro(gerente);
		 
		 System.out.println(controle.getTotalDeBonificacoes());
		 
		

	}

}
