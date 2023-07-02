package controller;

import model.Aluno;

public class AlunoController {
	private Aluno aluno;
	
	public AlunoController() {
		aluno = new Aluno();
	}
	
	public void adicionarLAuno(Aluno novoAluno) {
		aluno = novoAluno;
		
	}
	
	public Aluno retornarAluno(int IdAluno) {
		if(IdAluno >= 0) {
			return aluno;
		}
		return null;
	}
}
