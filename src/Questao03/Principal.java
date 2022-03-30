package Questao03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Onibus bus = new Onibus("", 0);
		bus.setPlaca(JOptionPane.showInputDialog("Digite a placa do Onibus:")); 
		bus.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano do Onibus:")));
		bus.setAssentos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos do Onibus:")));
		bus.exibirDados();
		
		Caminhao c1 = new Caminhao("", 0, 0);
		c1.setPlaca(JOptionPane.showInputDialog("Digite a placa do Caminhão:"));
		c1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano do Caminhão:")));
		c1.setEixos(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de eixos do caminhão:")));
		c1.exibirDados();
		
	}

}
