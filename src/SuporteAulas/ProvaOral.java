package SuporteAulas;

public class ProvaOral extends MomentoAvaliacao{

	private Integer fluencia;
	public Integer dominioMateria;
	
	
	public ProvaOral(Aluno aluno, Integer nota, Integer dificuldade, String data, Integer fluencia,
			Integer dominioMateria) {
		super(aluno, nota, dificuldade, data);
		this.fluencia = fluencia;
		this.dominioMateria = dominioMateria;
	}

	public Integer getFluencia() {
		return fluencia;
	}
	
	public void setFluencia(Integer fluencia) {
		this.fluencia = fluencia;
	}
	
	

}
