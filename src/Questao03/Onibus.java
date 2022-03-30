package Questao03;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo {
	private int assentos;
	

	public Onibus(String placa, int ano) {
		super(placa, ano);
		// TODO Auto-generated constructor stub
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "DADOS DO VEÍCULO\nPlaca:" + getPlaca() + "\nAno:" + getAno() + "\nAssentos: " + assentos);
	}
	
}
