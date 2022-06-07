
public class Conta {
	protected Integer numero;
	protected String titular;
	protected Double saldo;

	
	
	
	
	
	public Conta( String titular, Double saldo, Integer numero) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	

	// Encapsulamento get= envia , set = altera 	
	
	
	
	public String getTitular() {
		return titular;
	}
	
	

	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
