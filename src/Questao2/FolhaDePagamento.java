package Questao2;

import javax.swing.JOptionPane;

public class FolhaDePagamento {

	public static void main(String[] args) {
	String  nome;
	int opcao, mat, salario, producao;
	float percent, vendas, valor;
	opcao=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo de Funcion�rio:\n1)Sal�rio Fixo\n2)Comiss�o\n3)Produtividade"));
	
	switch(opcao){
	case 1:
		FPadrao f1 = new FPadrao();
		mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do Funcionario:"));
		f1.setMatricula(mat);
		nome = JOptionPane.showInputDialog(null, "Digite o nome do Funcion�rio: ");
		f1.setNome(nome);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o sal�rio do Funcionario:"));
		f1.setSalario(salario);
		
		JOptionPane.showMessageDialog(null, f1);
		break;
	case 2:
		FComissionado f2 = new FComissionado();	
		mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do Funcionario:"));
		f2.setMatricula(mat);
		nome = JOptionPane.showInputDialog(null, "Digite o nome do Funcion�rio: ");
		f2.setNome(nome);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o sal�rio do Funcionario:"));
		f2.setSalario(salario);
		percent = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o percentual da comi��o:"));	
		f2.setPercent(percent);
		vendas = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor total das vendas:"));	
		f2.setVendas(vendas);
		
		JOptionPane.showMessageDialog(null,f2.toString() + "\nSalario + Comissao: R$" + f2.calcularProventos());
		break;
	case 3:
		FProdutividade f3 = new FProdutividade();
		mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do Funcionario:"));
		f3.setMatricula(mat);
		nome = JOptionPane.showInputDialog(null, "Digite o nome do Funcion�rio: ");
		f3.setNome(nome);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o sal�rio do Funcionario:"));
		f3.setSalario(salario);
		valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor por produ��o:"));
		f3.setValor(valor);
		producao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual foi a produ��o do funcion�rio:"));
		f3.setProdu��o(producao);
		JOptionPane.showMessageDialog(null,f3.toString() + "\nSalario + Produ��o: R$" + f3.calcularProventos());
		break;
	default:
		JOptionPane.showMessageDialog(null, "OP�O INV�LIDA!!!");	
		
					
	}

	}

}
