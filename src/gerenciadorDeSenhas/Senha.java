package gerenciadorDeSenhas;
import javax.swing.JOptionPane;
public class Senha {
	private String senha;
	private String email;
	
	public Senha() {
	}
	
	public Senha( String senha, String email) {
		this.senha = senha;
		this.email = email;
	}
		
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void adicionarSenha() {
		this.email = JOptionPane.showInputDialog("DIGITE SEU SUPER EMAIL: ");
		this.senha = JOptionPane.showInputDialog("DIGITE A SUA SENHA SUPER SECRETA: ");
		}
	public void statusSenha() {
		System.out.println("STATUS SENHA: ");
		System.out.println("email: " + getEmail()+".");
		System.out.println("senha: " + getSenha()+".");
	}
}
