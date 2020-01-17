
public class Supervisor extends Funcionario {

	public void Bonificacao() {
		this.salario += 5000.00;
		System.out.println("Sua bonificação é de :" + this.salario);

	}

	public void status() {
		System.out.println("A supervisora é " + this.nome + " com " + this.idade + " anos");
	}

}
