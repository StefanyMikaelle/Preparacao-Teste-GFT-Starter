

public class Main {

	public static void main(String[] args) {
		
		//ContaCorrente(Integer numero, String titular, Double saldo)
		Conta cc = new ContaCorrente("Pedro Henrique", 100.0, 10);
		Conta cp = new ContaPoupanca("Stefany Mikaelle", 100.0, 8);
		
		/*
		 * Se n�o tivesse construtor enviaria assim
		 * 
		cc.setTitular("Pedro Henrique");
	    cc.setSaldo(100.0);
	    cc.setNumero(1);
	    
	    
	    cp.setTitular("Stefany Mikaelle");
	    cp.setSaldo(100.0);
	    cp.setNumero(1);
	    */
		
	    
	    System.out.println("Conta Poupan�a");
	    System.out.println(cc);
	        
	        
	    System.out.println("Conta Corrente");
	    System.out.println(cp);
	
	}

}
