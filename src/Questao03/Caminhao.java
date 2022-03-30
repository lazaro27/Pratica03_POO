package Questao03;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
	int eixos;



	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "DADOS DO VEÍCULO\nPlaca:" + getPlaca() + "\nAno:" + getAno() + "\nEixos:" + eixos);
	}

}
