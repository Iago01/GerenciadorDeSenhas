package gerenciadorDeSenhas;

import javax.swing.JOptionPane;

public class Banco extends Senha{
	
	public Banco( String senha, String email) {
		super(senha, email);
		// TODO Auto-generated constructor stub
	}
	
	public Banco() {
		
	}
	private String nomeBanco;
	private String numeroConta;
	private String tipoConta;
	
	public String getNomeBanco() {
		return this.nomeBanco;
	}
	public void setNomeBanco(String banco) {
		this.nomeBanco = banco;
	}
	public String getNumeroConta() {
		return this.numeroConta;
	}
	public void setNumeroConta(String nConta) {
		this.numeroConta = nConta;
	}
	
	public String getTipoConta() {
		return this.tipoConta;
	}
	public void setTipoConta(String tipoconta) {
		this.tipoConta = tipoconta;
	}
	public void adicionarBanco() {
		adicionarSenha();
		this.nomeBanco =JOptionPane.showInputDialog("DIGITE O NOME DO SEU BANCO: ");
		this.numeroConta =JOptionPane.showInputDialog("DIGITE O NUMERO DA CONTA: ");
		this.tipoConta = JOptionPane.showInputDialog("DIGITE O TIPO DA CONTA: ");
	}
	public void statusBanco() {
		statusSenha();
		System.out.println("NOME DO BANCO: " + getNomeBanco()+".");
		System.out.println("NUMERO DA CONTA: " + getNumeroConta()+".");
		System.out.println("TIPO DA CONTA: " + getTipoConta()+".");
	}
}
