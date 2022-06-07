
public class ContaPoupanca extends Conta{
	
	
	public ContaPoupanca(String titular, Double saldo, Integer numero) {
		super(titular, saldo, numero);
	}

	public Double rendimento() {
		return 0.05 * this.getSaldo();
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [getRendimento()=" + rendimento() + ", getTitular()=" + getTitular() + ", getNumero()="
				+ getNumero() + ", getSaldo()=" + getSaldo() + "]";
	}

	
		
	
	
	


	
	
	// ContaPoupanca: rendimento = saldo * 0.05;
}
