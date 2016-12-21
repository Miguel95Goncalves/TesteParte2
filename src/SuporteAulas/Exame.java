package SuporteAulas;

public class Exame extends MomentoAvaliacao {

	private Questao[] questao;

	public Exame(Aluno aluno, Integer nota, Integer dificuldade, String data, Questao[] questao) {
		super(aluno, nota, dificuldade, data);
		this.questao = questao;
	}
	

}
