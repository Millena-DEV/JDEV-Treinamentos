 package classes;

import java.util.ArrayList;
import java.util.List;

import constantes.statusAluno;

public class Aluno extends Pessoa {
	
        /*atributos do Aluno*/
		
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		
		
		private List<Disciplina> disciplinas = new ArrayList<Disciplina> ();
		
		 public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
		 public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}
	
		public Aluno () {
			
		}
		public Aluno (String nomePadrao) {
			nome = nomePadrao;
		}
		public Aluno (String nomePadrao, int idadePadrao) {
			super.nome = nomePadrao;
			idade = idadePadrao;
		}
		
		
        /* metodos SETTERS e GETTERS do objeto*/
		
		/*SET é para adicionar ou receber dados para os atributos*/
		/*GET é para resgatar ou obter o valor do atributo*/
	
		
		
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
		public String getDataMatricula() {
			return dataMatricula;
		}
		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}
		public String getNomeEscola() {
			return nomeEscola;
		}
		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}
		public String getSerieMatriculado() {
			return serieMatriculado;
		}
		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		
		/* metodo que retorna a media do aluno */
		public double getMediaNota() {

			double somaNotas = 0.0;
			for (Disciplina disciplina : disciplinas) {
				somaNotas += disciplina.getNota();
			}
			return somaNotas / disciplinas.size();
		}

		public boolean getAlunoAprovado() {

			double media = this.getMediaNota();

			if (media >= 7) {

				return true;

			} else {
				return false;
			}
		}

		public String getAlunoAprovado2() {

			double media = this.getMediaNota();
			if (media >= 5) {
				if (media >= 7) {
					return statusAluno.APROVADO;
				} else {
					return statusAluno.RECUPERACAO;
				}

			} else {
				return statusAluno.REPROVADO;

			}
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", regristoGeral=" + regristoGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
			result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
			result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
			result = prime * result + idade;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
			result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
			result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
			result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
			result = prime * result + ((regristoGeral == null) ? 0 : regristoGeral.hashCode());
			result = prime * result + ((serieMatriculado == null) ? 0 : serieMatriculado.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (dataMatricula == null) {
				if (other.dataMatricula != null)
					return false;
			} else if (!dataMatricula.equals(other.dataMatricula))
				return false;
			if (dataNascimento == null) {
				if (other.dataNascimento != null)
					return false;
			} else if (!dataNascimento.equals(other.dataNascimento))
				return false;
			if (disciplinas == null) {
				if (other.disciplinas != null)
					return false;
			} else if (!disciplinas.equals(other.disciplinas))
				return false;
			if (idade != other.idade)
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (nomeEscola == null) {
				if (other.nomeEscola != null)
					return false;
			} else if (!nomeEscola.equals(other.nomeEscola))
				return false;
			if (nomeMae == null) {
				if (other.nomeMae != null)
					return false;
			} else if (!nomeMae.equals(other.nomeMae))
				return false;
			if (nomePai == null) {
				if (other.nomePai != null)
					return false;
			} else if (!nomePai.equals(other.nomePai))
				return false;
			if (numeroCpf == null) {
				if (other.numeroCpf != null)
					return false;
			} else if (!numeroCpf.equals(other.numeroCpf))
				return false;
			if (regristoGeral == null) {
				if (other.regristoGeral != null)
					return false;
			} else if (!regristoGeral.equals(other.regristoGeral))
				return false;
			if (serieMatriculado == null) {
				if (other.serieMatriculado != null)
					return false;
			} else if (!serieMatriculado.equals(other.serieMatriculado))
				return false;
			return true;
		}

		@Override /* indentifica metodo sobrescrito*/
		public boolean pessoaMaiorIdade() {
		
		return idade >=21;
		}
		public String msgMaiorIdade () {
			return this.pessoaMaiorIdade() ? "oba aluno é maior de idade":" vixe aluno não é maior de idade";
		}
		@Override
		public double salario() {
			return 0;
		}
}


 