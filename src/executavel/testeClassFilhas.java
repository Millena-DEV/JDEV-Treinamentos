package executavel;

import classes.Aluno;
import classes.Diretor;
import classes.Pessoa;
import classes.Secretario;

public class testeClassFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Millena a gostosona");
		aluno.setIdade(16);
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Samuel o loucoooooo");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Marcilene A saco de almas");
		secretario.setIdade(18);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("salario do aluno  � igual a: " + aluno.salario());
		System.out.println("salario do diretor � igual a: " + diretor.salario());
		System.out.println("salario do secretario � igual a: " + secretario.salario());
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
		
	}

	public static void teste (Pessoa pessoa) {
		System.out.println("essa pessoa � demais: " +pessoa.getNome()
		+ "o salario � igual a: " + pessoa.salario());
	}
}
