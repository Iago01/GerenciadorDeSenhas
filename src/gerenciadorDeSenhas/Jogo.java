package gerenciadorDeSenhas;

import javax.swing.JOptionPane;

public class Jogo extends Senha{
	public Jogo(String senha, String email, String nomeDoJogo, String destribuidoraJogo) {
		super(senha, email);
		// TODO Auto-generated constructor stub
		}
	public Jogo() {
		
	}
	private String nomeDoJogo;
	private String destribuidoraJogo;
	
	public String getNomeDoJogo() {
		return this.nomeDoJogo;
	}
	public void setNomeDoJogo(String nome) {
		this.nomeDoJogo =nome;
	}
	public String getDestribuidoraJogo() {
		return this.destribuidoraJogo;
	}
	public void setDestribuidoraJogo(String destribuidora) {
		this.destribuidoraJogo = destribuidora;
	}
	
	public void adicionarJogo(){
		this.adicionarSenha();
		this.nomeDoJogo = JOptionPane.showInputDialog("DIGITE O NOME DO JOGO: ");
		this.destribuidoraJogo = JOptionPane.showInputDialog("DIGITE A DESTRIBUIDORA DO JOGO: ");
	}
	public void statusJogo() {
		statusSenha();
		System.out.println("NOME DO JOGO: " + getNomeDoJogo()+".");
		System.out.println("DESTRIBUIDORA DO JOGO: " + getDestribuidoraJogo()+".");
	}
}
