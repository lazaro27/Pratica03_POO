package Questao2;

import javax.swing.JOptionPane;

public class FolhaDePagamento {

	public static void main(String[] args) {
	String  nome;
	int opcao, mat, salario, producao;
	float percent, vendas, valor;
	opcao=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo de Funcionário:\n1)Salário Fixo\n2)Comissão\n3)Produtividade"));
	
	switch(opcao){
	case 1:
		FPadrao f1 = new FPadrao();
		mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do Funcionario:"));
		f1.setMatricula(mat);
		nome = JOptionPane.showInputDialog(null, "Digite o nome do Funcionário: ");
		f1.setNome(nome);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário do Funcionario:"));
		f1.setSalario(salario);
		
		JOptionPane.showMessageDialog(null, f1);
		break;
	case 2:
		FComissionado f2 = new FComissionado();	
		mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do Funcionario:"));
		f2.setMatricula(mat);
		nome = JOptionPane.showInputDialog(null, "Digite o nome do Funcionário: ");
		f2.setNome(nome);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário do Funcionario:"));
		f2.setSalario(salario);
		percent = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o percentual da comição:"));	
		f2.setPercent(percent);
		vendas = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor total das vendas:"));	
		f2.setVendas(vendas);
		
		JOptionPane.showMessageDialog(null,f2.toString() + "\nSalario + Comissao: R$" + f2.calcularProventos());
		break;
	case 3:
		FProdutividade f3 = new FProdutividade();
		mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do Funcionario:"));
		f3.setMatricula(mat);
		nome = JOptionPane.showInputDialog(null, "Digite o nome do Funcionário: ");
		f3.setNome(nome);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário do Funcionario:"));
		f3.setSalario(salario);
		valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor por produção:"));
		f3.setValor(valor);
		producao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual foi a produção do funcionário:"));
		f3.setProdução(producao);
		JOptionPane.showMessageDialog(null,f3.toString() + "\nSalario + Produção: R$" + f3.calcularProventos());
		break;
	default:
		JOptionPane.showMessageDialog(null, "OPÃO INVÁLIDA!!!");	
		
					
	}

	}

}
