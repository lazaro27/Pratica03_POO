package Questao1_Carnaval;

import javax.swing.JOptionPane;

public class Normal extends Ingressos{

	public Normal(float valor) {
		super(valor);
				
	}
	
	public Normal() {
		
	}
	
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, "Ingresso Normal - Valor R$: " + this.valor);
	}
	

}
