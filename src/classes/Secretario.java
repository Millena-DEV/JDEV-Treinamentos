package classes;

import Interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	protected String registro;
	protected String nivelCargo;
	protected String experiencia;
	
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", regristoGeral="
				+ regristoGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		return 1500;
	}
	
	
	
	@Override
	public  boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}
	
	

}
