package br.com.erickfreire.registrodesaude;

public class RegistroDeSaude {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private double altura;
	private double peso;
	
	public RegistroDeSaude(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura,
			double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int calculaIdade(int anoAtual) {
		return anoAtual - ano;
	}
	
	public int frequenciaMaxima(int anoAtual) {
		return 220 - calculaIdade(anoAtual);
	}
	
	public String frequenciaAlvo(int anoAtual) {
		double cinquenta = frequenciaMaxima(anoAtual) * 0.5;
		double oitenta = frequenciaMaxima(anoAtual) * 0.8;
		String resultado = String.format("%.0f - %.0f", cinquenta, oitenta);
		return resultado;
	}
	
	public void calculaImc() {
        double imc = (peso / (altura * altura));
		
		if(imc < 18.5)
			System.out.printf("IMC igual a %.2f - Abaixo do peso ideal!", imc);
		
		if(imc > 18.4)
			if(imc < 25.0)
				System.out.printf("IMC igual a %.2f - Peso Normal!", imc);
		
		if(imc > 24.9)
			if(imc < 30)
				System.out.printf("IMC igual a %.2f - Sobrepeso!", imc);
		
		if(imc > 29.9)
			System.out.printf("IMC igual a %.2f - Est� Obeso!", imc);
	}
	
	

}
