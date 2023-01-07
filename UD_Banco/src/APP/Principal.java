package APP;

import java.util.Locale;
import java.util.Scanner;

import utilit.Dados;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Dados dados;
		
		System.out.print("Digite o numero da conta: ");
		int nConta = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial (s/n)? ");
		char resp = sc.next().charAt(0);
		
		if(resp == 's') {
			System.out.print("Digite o valor de deposito inicial: ");
			double depositoIni = sc.nextDouble();
			dados = new Dados(titular, nConta, depositoIni);
		}else {
			dados = new Dados(titular, nConta);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(dados);
		System.out.println();
		
		System.out.print("Faca um deposito: ");
		double deposito = sc.nextDouble();
		dados.deposito(deposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(dados);
		System.out.println();
		
		System.out.print("Faca um saque: ");
		double saque = sc.nextDouble();
		dados.saque(saque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(dados);
		
		sc.close();
	}

}
