package gerenciadorDeSenhas;

import javax.swing.JOptionPane;

public class Usuario {
	private String nome;
	private String senha;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void criarSenha(){
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O TIPO DE SENHA: \r\n1-email\r\n2-jogo\n\r3-banco"));
		if(tipo == 1) {
			Email email = new Email();
			email.adicionarEmail();
			email.statusEmail();
		}
		else if (tipo == 2) {
			Jogo jogo = new Jogo();
			jogo.adicionarJogo();
			jogo.statusJogo();
			}
		else if (tipo == 3) {
			Banco banco = new Banco();
			banco.adicionarBanco();
			banco.statusBanco();
		}

	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
