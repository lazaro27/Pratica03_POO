package Questao2;

public class FProdutividade extends Funcionario {
	private double valor;
	private int produ��o;
	
	


	public FProdutividade(int matricula, String nome, double salario, double valor, int produ��o) {
		super(matricula, nome, salario);
		this.valor = valor;
		this.produ��o = produ��o;
	}

	public FProdutividade() {
		
	}


	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public int getProdu��o() {
		return produ��o;
	}




	public void setProdu��o(int produ��o) {
		this.produ��o = produ��o;
	}




	public double calcularProventos() {
		
		return this.getSalario() + (this.valor * this.produ��o);
	}

}
