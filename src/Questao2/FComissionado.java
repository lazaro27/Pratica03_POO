package Questao2;

public class FComissionado extends Funcionario{
	public double percent;
	public double vendas;
		
	

	
	public FComissionado(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
		
	}


	public FComissionado() {
		
	}


	public double getPercent() {
		return percent;
	}


	public void setPercent(double percent) {
		this.percent = percent;
	}


	public double getVendas() {
		return vendas;
	}


	public void setVendas(double vendas) {
		this.vendas = vendas;
	}


	public double calcularProventos() { 
			
		return this.getSalario( ) + ((this.percent/100) * this.vendas);
	}
	

}
