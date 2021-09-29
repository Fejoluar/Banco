package br.com.felipes.estados;

import java.util.ArrayList;
import java.util.Collections;

public class Estados {
	
	public static void main(String[] args) {
				
		ArrayList<String> estados = new ArrayList<>();
		
		estados.add("Paraíba");
		estados.add("Pernambuco");
		estados.add("Parana");
		estados.add("Pará");
		estados.add("São Paulo");
		estados.add("Minas Gerais");
		estados.add("Rio de Janeiro");
		estados.add("Ceara");
		estados.add("Rio Grande do Norte");
		estados.add("Piauí");
		estados.add("Maranhão");
		estados.add("Amazonas");
		estados.add("Roraima");
		estados.add("Distrito Federal");
		estados.add("Manaus");		
		estados.remove("Manaus");
		
		
		System.out.println(estados);
		
		Collections.sort(estados);
		
		System.out.println("------------------------");	
		
		estados.forEach(estado -> {
			System.out.println("estado: " + estado);
		});
		
		System.out.println("------------------------");	
		
		System.out.println(estados.get(9));
		
	}
	

}
