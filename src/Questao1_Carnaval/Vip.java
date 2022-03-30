package Questao1_Carnaval;

import javax.swing.JOptionPane;

public class Vip extends Ingressos {
	float valorAdicional;

	public Vip() {
		
	}
	public Vip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	
	public float getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	public void Imprime() {
		
		JOptionPane.showMessageDialog(null, "INGRESSO VIP\n" + "VALOR R$ " + (valor + valorAdicional));
	}
	
	
	
	
}
