package alunoNota;

public class Aluno {
	String nome;
	double nota1;
	double nota2;

	Aluno(String nome, double nota1, double nota2) {

		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	double media(Aluno aluno) {

		double media;

		media = nota1 + nota2 / 2;

		return media;
	}

	boolean aprovado(double media) {

		if (media >= 7) {

			return true;
		} else {
			return false;
		}

	}

	void exibirResultado(Aluno aluno) {

		System.out.println("Resultado"  + nome + media(aluno) + aprovado(nota1) );

	}

}
