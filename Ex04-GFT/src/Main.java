import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionarios:");
		int quantFuncionario;
		quantFuncionario = sc.nextInt();
		
		for(int i=1; i<= quantFuncionario;i++) {
		
			System.out.printf("Cadastro do %d º Funcionario(a):", i);
			System.out.println();
			System.out.println("Essa pessoa é terceirizada? (s/n)");
			char resposta= sc.next().charAt(0);
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas:");
			int horas = sc.nextInt();
			System.out.print("Valor por hora:");
			double valorHora = sc.nextDouble();
				
				if(resposta == 's') {
					System.out.print("Digite o valor bônus adicional:");
					double bonusAdd = sc.nextDouble();
					Funcionario listFunc = new FuncionarioTerceirizado(nome, horas, valorHora, bonusAdd);
					list.add(listFunc);
				}else {
					Funcionario listFunc = new Funcionario(nome, horas, valorHora);
					list.add(listFunc);
				}
		
		
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Funcionario listFunc : list) {
			System.out.println(listFunc.getNome() + "- $" 
					+ String.format("%.2f", listFunc.pagamento()));
		}
		sc.close();
	}

}
