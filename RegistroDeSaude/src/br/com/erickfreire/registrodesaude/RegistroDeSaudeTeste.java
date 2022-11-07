package br.com.erickfreire.registrodesaude;

import java.util.Scanner;

public class RegistroDeSaudeTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		String sexo;
		int anoAtual;
		int dia;
		int mes;
		int ano;
		double altura;
		double peso;
		
		System.out.println("Registro de Saúde: ");
		System.out.print("Nome: ");
		nome = entrada.nextLine();
		
		System.out.print("Sobrenome: ");
		sobrenome = entrada.nextLine();
		
		System.out.print("Sexo: ");
		sexo = entrada.nextLine();
		
		System.out.print("Em que ano estamos?");
		anoAtual = entrada.nextInt();
		
		System.out.print("Dia Nascimento: ");
		dia = entrada.nextInt();
		
		System.out.print("Mês Nascimento: ");
		mes = entrada.nextInt();
		
		System.out.print("Ano Nascimento: ");
		ano = entrada.nextInt();
		
		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		
		System.out.print("Peso: ");
		peso = entrada.nextDouble();
		
		RegistroDeSaude paciente1 = new RegistroDeSaude(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.printf("****************************************************************%n"
				        + "*                Registro do Paciente                          *%n"
				        + "****************************************************************%n%n");
		
		System.out.printf("Nome: %s %s%n", paciente1.getNome(), paciente1.getSobrenome());
		System.out.printf("Sexo: %s%n", paciente1.getSexo());
		System.out.printf("Data Nascimento: %d/%d/%d%n", paciente1.getDia(), paciente1.getMes(), paciente1.getAno());
		System.out.printf("Idade: %d%n", paciente1.calculaIdade(anoAtual));
		System.out.printf("Altura: %.2f%n", paciente1.getAltura());
		System.out.printf("Peso: %.2f%n", paciente1.getPeso());		
		paciente1.calculaImc();
		System.out.printf("%nFrequencia Cardiáca Maxima: %d%n", paciente1.frequenciaMaxima(anoAtual));
		System.out.printf("Frequencia Cardiáca Alvo: %s%n", paciente1.frequenciaAlvo(anoAtual));

	}

}
