
public class Gerente extends Funcionario {

	public void Bonificacao() {
		this.salario += 10000.00;
		System.out.println("Sua bonifica��o � de :" + this.salario);

	}

	public void status() {
		System.out.println("O gerente � " + this.nome + " com " + this.idade + " anos");
	}
}
