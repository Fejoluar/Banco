package br.com.felipes.banco.funcionarios;

public class TesteFuncioario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Felipe","043534");
		 
		gerente.setNome("felipe");
		 
		gerente.setSenha("marista2193");
		
		boolean acesso = gerente.autentica("marista2193");
		 
		System.out.println(acesso);
		

	}

}
