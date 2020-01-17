
public class Main {

	public static void main(String[] args) {
		Gerente f1 = new Gerente();
		f1.nome = "Gabriel";
		f1.idade = 31;
		f1.salario = 60000.00;
		f1.status();
		f1.Bonificacao();

		System.out.println("-------------------------------------------------------------");

		Supervisor f2 = new Supervisor();
		f2.nome = "Emily";
		f2.idade = 28;
		f2.salario = 10000.00;
		f2.status();
		f2.Bonificacao();

		System.out.println("-------------------------------------------------------------");
		Vendedor f3 = new Vendedor();
		f3.nome = "Lucas";
		f3.idade = 20;
		f3.salario = 5000.00;
		f3.status();
		f3.Bonificacao();
	}

}
