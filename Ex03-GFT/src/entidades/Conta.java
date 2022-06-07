package entidades;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	

	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	// Se a variavel não puder ser alterada 
	// pelo usuario só terá get

	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}



	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}



	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void saque(double quantia) {
		saldo -= (quantia + 5.0);
	}
	
	public String toString() {
	 return "Numero da conta: " + numeroConta +
			 " Titular: " + nomeTitular + " Saldo: "+
			 String.format("%.2f", saldo) ;
	}
	
}
