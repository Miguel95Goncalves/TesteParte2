package SuporteAulas;

public class Teste extends MomentoAvaliacao {

	public String local;
	
	public Teste(Aluno aluno, Integer nota, Integer dificuldade, String data, String local) {
		super(aluno, nota, dificuldade, data);
		this.local = local;
	}
}
