package model;

public class Aluno {
	private String nomeAluno;
	private String emailAluno;
	private int qtdAulasAluno;
	private double valorAula;
	
	// Getters e Setters

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nome) {
        this.nomeAluno = nome;
    }

    public String getEmail() {
        return emailAluno;
    }

    public void setEmail(String email) {
        this.emailAluno = email;
    }

    public int getQtdAula() {
        return qtdAulasAluno;
    }

    public void setQtdAula(int qtdAula) {
        this.qtdAulasAluno = qtdAula;
    }

    public double getValorAulas() {
        return valorAula;
    }

    public void setValorAulas(double valorAulas) {
        this.valorAula = valorAulas;
    }
    
    // Outros métodos

    public double calcularPagamento() {
        return qtdAulasAluno * valorAula;
    }
  	
}
