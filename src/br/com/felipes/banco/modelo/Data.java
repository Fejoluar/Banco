package br.com.felipes.banco.modelo;

public class Data {
	
	private int ano;
	private int mes;
	private int dia;
	
	public Data(int ano, int mes, int dia) {
		this.setAno(ano);
		this.setMes(mes);
		this.setDia(dia);
	}


	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	 public String recuperaData() {
		 return getDia() + "/" + getMes() + '/' + getAno();

}
	 
}
