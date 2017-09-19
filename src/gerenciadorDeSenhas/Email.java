package gerenciadorDeSenhas;

import javax.swing.JOptionPane;

public class Email extends Senha {
	
	public Email() {	
	}
	
	public Email( String senha, String email,String operadora,String emailDeSeguranca) {
		super(senha, email);
		this.emailDeSeguranca = emailDeSeguranca;
		this.operadora = operadora;
	}

	private String operadora;
	private String emailDeSeguranca;
	
	public String getOperadora() {
		return this.operadora;
	}
	
	public void setOperadora(String o) {
		this.operadora = o;
	}
	
	public String getEmailDeSeguranca() {
		return this.emailDeSeguranca;
	}
	
	public void setEmailDeSeguranca(String e) {
		this.emailDeSeguranca = e;
	}
	
	public void adicionarEmail() {
		adicionarSenha();
		this.operadora = JOptionPane.showInputDialog("DIGITE A OPERADORA DE EMAIL: ");
		this.emailDeSeguranca = JOptionPane.showInputDialog("DIGITE O EMAIL DE SEGURANCA CADASTRADO: ");
	}
	
	public void statusEmail() {
		statusSenha();
		System.out.println("SOBRE O EMAIL: ");
		System.out.println("EMAIL DA OPERADORA: " + getOperadora()+".");
		System.out.println("EMAIL DE SEGURANCA: " + getEmailDeSeguranca()+".");
	}
}
