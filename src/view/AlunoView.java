package view;

import controller.AlunoController;
import model.Aluno;

import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class AlunoView {
	private AlunoController controller;

	public AlunoView(AlunoController controller) {
		this.controller = controller;
	}
	
	public void adicionarALuno(String json) {
		try {
			BufferedReader leitorJson = 
					new BufferedReader(new FileReader(json));
			String conteudoJson = leitorJson.lines().collect(Collectors.joining());

            String nome = conteudoJson.getString("nomeAluno");
            String email = conteudoJson.getString("emailAluno");
            int qtdAula = conteudoJson.getInt("qtdAulasAluno");
            double valorAulas = conteudoJson.getDouble("valorAula");

            Aluno novoAluno = new Aluno();
            novoAluno.setEmail(email);
            novoAluno.setNome(nome);
            novoAluno.setQtdAula(qtdAula);
            novoAluno.setValorAulas(valorAulas);
            
            controller.adicionarLAuno(novoAluno);
        } catch (JSONException e) {
            System.out.println("Erro ao converter JSON: " + e.getMessage());
        }
	}
}
