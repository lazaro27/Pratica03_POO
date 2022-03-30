package Questao1_Carnaval;

import javax.swing.JOptionPane;

public class Carnaval {

	public static void main(String[] args) {
	int op;	
	float valor, adicional;
	op = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇAO DE INGRESSO DESEJADA:\n1)NORMAL\n2)VIP\n3)CAMAROTE"));
	
	switch (op) {
	case 1:
		Normal c1 = new Normal();
		valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ingresso:"));
		c1.setValor(valor);
		c1.imprimeValor();
		break;
	case 2:
		Vip c2 = new Vip();
		valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ingresso:"));
		c2.setValor(valor);
		adicional = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor adicional do ingresso VIP:"));
		c2.setValorAdicional(adicional);
		c2.Imprime();
		break;
	case 3:
		Camarote c3 = new Camarote();
		valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ingresso:"));
		c3.setValor(valor);
		adicional = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor adicional do CAMAROTE:"));
		c3.setValorAdicional(adicional);
		c3.setLocal(JOptionPane.showInputDialog("Digite a localização:"));
		c3.ImprimeValor();		
		break;
		default:
			JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!!!");
	}

	}

}