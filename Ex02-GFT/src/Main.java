import java.util.Locale;
import java.util.Scanner;

import calculos.Produtos;


public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produtos;
		produtos = new Produtos ();
		
		System.out.println("Digite um produto cadastrado:");
		System.out.print("Nome:");
		produtos.nome = sc.nextLine();
		System.out.print("Preco:");
		produtos.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque:");
		produtos.quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Produto: " + produtos);
		System.out.println("Digite a quantidade que será adicionada:");
		int quantidadeAdd = sc.nextInt();
		produtos.AddProdutos(quantidadeAdd);
		System.out.println("Atualização: "+ produtos);
		System.out.println("Digite a quantidade que será removida:");
		int quantidadeRemovida= sc.nextInt();
		produtos.RemoveProduto(quantidadeRemovida);
		System.out.println("Atualização: "+ produtos);
		
		sc.close();
		
		
	}

}
