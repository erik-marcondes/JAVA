package LerDadosTeclado;

import java.util.Locale;
import java.util.Scanner;

public class LerDadosTeclado {

	public static void main(String[] args) {
		String nome;
		int idade;
		double salario;
		
		System.out.println("TESTE SCANNER");
		
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);

		System.out.println("Nome:"); 
		nome = entrada.nextLine(); 
		System.out.println("Idade:"); 
		idade = entrada.nextInt();
		System.out.println("Sal�rio:"); 
		salario = entrada.nextDouble();

		System.out.println("Nome: " + nome + "\\nIdade: " + idade+ "\\nSal�rio: " + salario);
		
	}

}
