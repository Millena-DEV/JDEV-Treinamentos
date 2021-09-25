package executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Interfaces.PermitirAcesso;
import classes.Aluno;
import classes.Disciplina;
import classes.Secretario;
import constantes.statusAluno;
import excecao.ExecaoProcessarNota;

public class primeiraClassejava {

	public static void main(String[] args) throws ExecaoProcessarNota  {
		
		try {

		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
		
		
	    PermitirAcesso secretario = new Secretario ();
		
		if (secretario.autenticar(login,senha)){
		
		List<Aluno>alunos = new ArrayList<Aluno>();
		
		/* � uma lista que dentro dela temos uma chave que indentifica uma sequencia de valores tamb�m*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>(); 

		/*List<Aluno>alunosAprovados = new ArrayList<Aluno>(); lista de alunos
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
		
		for (int qtd = 1 ; qtd <=2; qtd ++) {
		String nome = JOptionPane.showInputDialog("Digite o Nome do Aluno" + qtd +"?");
		/*String idade = JOptionPane.showInputDialog("Digite a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
		String registroGeral = JOptionPane.showInputDialog("Digite o registro geral");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da M�e");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do Pai");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data da matricula");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a serie matriculado");*/
		
        

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegristoGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);*/
        
		for (int pos = 1; pos <= 4; pos++) {

			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina" + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas ().add(disciplina);
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma Disciplina? ");
		
		if ( escolha == 0) { /* op��o sim � 0*/			
			int continuarRemover = 0; 
			int posi = 1;
			
			while (continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posi );
			posi ++;
			continuarRemover = JOptionPane.showConfirmDialog(null," Continuar a Remover?");
    	}
		
		}
		
		alunos.add(aluno1); 
	}
		maps.put(statusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(statusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(statusAluno.REPROVADO, new ArrayList<Aluno>());
		for (Aluno aluno : alunos) { /*separei em listas*/
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(statusAluno.APROVADO)) {
				maps.get(statusAluno.APROVADO).add(aluno);
			}else
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
				maps.get(statusAluno.RECUPERACAO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(statusAluno.REPROVADO)) {
				maps.get(statusAluno.REPROVADO).add(aluno);
			}
		}
	
	     System.out.println("------------------lista dos aprovados----------------");
		 for (Aluno aluno :maps.get(statusAluno.APROVADO)) {
		 System.out.println("Resultado = " + aluno.getAlunoAprovado2()+" Com media = " + aluno.getMediaNota());
		}
		
		 System.out.println("------------------lista dos alunos em recupera��o----------------");
		 for (Aluno aluno : maps.get(statusAluno.RECUPERACAO)) {
		 System.out.println("Resultado = " + aluno.getAlunoAprovado2()+" Com media = " + aluno.getMediaNota());
			}
		
		
		 System.out.println("------------------lista dos alunos reprovados----------------");
		 for (Aluno aluno : maps.get(statusAluno.REPROVADO)) {
	     System.out.println("Resultado = " + aluno.getAlunoAprovado2()+" Com media  = " + aluno.getMediaNota());
		 }
				}
	
		JOptionPane.showMessageDialog(null, "DENIED");
	} catch (Exception e) {
		StringBuilder saida = new StringBuilder();
		e.printStackTrace(); /* Imprime erro no console */

		System.out.println("Mensagem " + e.getMessage()); /* Mensagem do erro ou causa */

		for (int i = 0; i < e.getStackTrace().length; i++) {
			saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
			saida.append("\nMetodo de erro: " + e.getStackTrace()[i].getMethodName());
			saida.append("\nLinha de erro: " + e.getStackTrace()[i].getLineNumber());
			saida.append("\nClass: " + e.getClass().getName());
		}

		JOptionPane.showMessageDialog(null, "Erro de conversao de numero" + saida.toString());
		
	} finally/* sempre e executado mesmo se ocorrer erros ou nao */ {
		/*
		 * sempre e usado quando se prescisa se executar um processo acontecendo erro ou
		 * nao
		 */
		JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
	}

}
	public static void lerArquivo() throws ExecaoProcessarNota {
		try {
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExecaoProcessarNota(e.getMessage());
		}
	}
}


