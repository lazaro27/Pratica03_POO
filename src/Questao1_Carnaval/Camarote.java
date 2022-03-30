package Questao1_Carnaval;

import javax.swing.JOptionPane;

public class Camarote extends Ingressos {
	String local;
	float valorAdicional;
	
	
	
	public Camarote() {
		super();
	}

	public Camarote(float valor) {
		super(valor);
		
	}

	public Camarote(float valor, String local, float valorAdicional) {
		super(valor);
		this.local = local;
		this.valorAdicional = valorAdicional;
	} 
	
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public void ImprimeValor() {
		JOptionPane.showMessageDialog(null, "CAMAROTE\nvalor:" + (valor + valorAdicional) + "\nLocal: " + local);
	}
	
	
}
