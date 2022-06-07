package entidades;

public class Funcionario {
	public String nome;
	public int horasTrabalhadas;
	public double valorHora;
	
	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagamento() {
		return horasTrabalhadas * valorHora;
		
	}
	
}
