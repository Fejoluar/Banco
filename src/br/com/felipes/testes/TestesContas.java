package br.com.felipes.testes;

import java.awt.Component;

import javax.swing.JFrame;

import br.com.felipes.banco.modelo.Cliente;
import br.com.felipes.banco.modelo.ContaCorrente;
import br.com.felipes.banco.modelo.ContaPoupanca;
import br.com.felipes.banco.modelo.Data;

public class TestesContas {
	
	public static void main(String[] args) {
		
			
		Cliente c1 = new Cliente("fe", "32345-g5");
		Data data = new Data(2021,9,15);
		
		ContaCorrente cc = new ContaCorrente(data, c1, "23423f5", "234234r");
		ContaPoupanca cp = new ContaPoupanca(data, c1,"23423f5", "001");
		
		System.out.println(cc.getTipo());
		
		System.out.println(cp.getTipo());
		

		
	}

}
