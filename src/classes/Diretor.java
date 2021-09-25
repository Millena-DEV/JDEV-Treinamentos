package classes;

public class Diretor extends Pessoa {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulaCao;
	
	
	
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulaCao() {
		return titulaCao;
	}
	public void setTitulaCao(String titulaCao) {
		this.titulaCao = titulaCao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulaCao="
				+ titulaCao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", regristoGeral=" + regristoGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		
		return 4568.36;
	}
	
	
	
	

}
