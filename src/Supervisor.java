
public class Supervisor extends Funcionario {

	public void Bonificacao() {
		this.salario += 5000.00;
		System.out.println("Sua bonifica��o � de :" + this.salario);

	}

	public void status() {
		System.out.println("A supervisora � " + this.nome + " com " + this.idade + " anos");
	}

}
