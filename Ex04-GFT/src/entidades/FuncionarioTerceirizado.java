package entidades;

public class FuncionarioTerceirizado extends Funcionario {
	private double bonusAdd;
	
	
	public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double bonusAdd) {
		super(nome, horasTrabalhadas, valorHora);
		this.bonusAdd = bonusAdd;
	}

	public double getBonusAdd() {
		return bonusAdd;
	}

	public void setBonusAdd(double bonusAdd) {
		this.bonusAdd = bonusAdd;
	}
	
	@Override
	public double pagamento () {
		return super.pagamento() + bonusAdd * 1.1; 		
	}
	
}
