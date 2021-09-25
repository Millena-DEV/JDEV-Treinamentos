package classes;

/*classe base (atributos comuns a todos os objetos filhos)*/
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected  String dataNascimento;
	protected  String regristoGeral;
	protected  String numeroCpf;
	protected  String nomeMae;
	protected  String nomePai;
	/*metodo abstrado é que fica na classe base é obrigatoria para as classes filhas*/
	public abstract double salario ();
	
	
    /*retorna true caso seja 18 pra cima,senao retorna false*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegristoGeral() {
		return regristoGeral;
	}
	public void setRegristoGeral(String regristoGeral) {
		this.regristoGeral = regristoGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}


	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
	


