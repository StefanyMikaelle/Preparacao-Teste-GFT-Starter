
public class ContaCorrente extends Conta{

	public ContaCorrente(String titular, Double saldo, Integer numero) {
		super(titular, saldo, numero);
	}
	
	public Double rendimento() {
		return 0.03 * this.getSaldo();
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [getRendimento()=" + rendimento() + ", getTitular()=" + getTitular() + ", getNumero()="
				+ getNumero() + ", getSaldo()=" + getSaldo() + "]";
	}
	
	
	
	
	

	




	
	
	
	// ContaPoupanca: rendimento = saldo * 0.03;
		
	 	
}
