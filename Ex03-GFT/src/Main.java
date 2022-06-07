import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite o numero da conta:");
		int numeroConta = sc.nextInt();
		System.out.print("Digite o nome do titular:");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Deseja fazer deposito inicial (s/n)?");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			
			System.out.println("Digite o deposito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		}else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		System.out.println();
		System.out.print("Digite o valor do deposito:");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da Conta:");
		System.out.println(conta);
		System.out.print("Digite o valor do saque:");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados da Conta:");
		System.out.println(conta);
		sc.close();
	}

}
