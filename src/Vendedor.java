
public class Vendedor extends Funcionario {

	public void Bonificacao() {
		this.salario += 3000.00;
		System.out.println("Sua bonifica��o � de :" + this.salario);

	}

	public void status() {
		System.out.println("O vendendor � " + this.nome + " com " + this.idade + " anos");
	}

}
