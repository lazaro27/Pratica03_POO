package Questao2;

public abstract class Funcionario {
	protected int matricula;
	private String nome;
	private double salario;
		
	public Funcionario(int matricula, String nome, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}
	

	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double caucularProventos() {
		return salario;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nMatricula: "+ matricula+"\nSalario: R$" +salario;
	}
	

}
