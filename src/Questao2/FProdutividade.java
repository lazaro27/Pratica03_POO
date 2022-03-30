package Questao2;

public class FProdutividade extends Funcionario {
	private double valor;
	private int produção;
	
	


	public FProdutividade(int matricula, String nome, double salario, double valor, int produção) {
		super(matricula, nome, salario);
		this.valor = valor;
		this.produção = produção;
	}

	public FProdutividade() {
		
	}


	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public int getProdução() {
		return produção;
	}




	public void setProdução(int produção) {
		this.produção = produção;
	}




	public double calcularProventos() {
		
		return this.getSalario() + (this.valor * this.produção);
	}

}
