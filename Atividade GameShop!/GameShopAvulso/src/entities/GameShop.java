package entities;

public class GameShop {

	private int codigo;
	private int idade;
	private double qtdHoras;

	public GameShop(int codigo, int idade) {
		super();
		this.codigo = codigo;
		this.idade = idade;
	}

	public void Comprar(double qtdHoras) {
		this.qtdHoras += qtdHoras;
	}

	public void Jogar(double qtdHoras) {
		if (this.qtdHoras < qtdHoras) {
			System.out.println("Você Não Tem Tantas Horas :(\n");
		} else {
			this.qtdHoras -= qtdHoras;
		}
	}

	public void Brinde() {
		this.qtdHoras *= 2;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getIdade() {
		return idade;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void Menu() {
		System.out.print("\n1 - Comprar Horas\n" + "2 - Jogar\n" + "3 - Brinde\n" + "4 - Consultar Saldo de Horas\n"
				+ "5 - Sair\n\n" + "Digite a Opção: ");
	}
}
