package br.edu.ifpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InscricaoController {
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping("/cad_candidato")
	public String exibirTelaInscricao() {
		return "fichaInscricao";
	}
	@PostMapping("/salvar_candidato")
	public String salvarProduto(InstituicaoEnsino instituicao, Candidato candidato) {
		this.candidatoService.inserirCandidato(candidato);
		
		/*System.out.println("Candidato: " +
				candidato.getNome() +  " Categoria: " + candidato.getCategoriaEstagio()  + ", Email: " + candidato.getEmail() + ", Telefone: " 
				+ candidato.getCelular() + ", Curso: " + instituicao.getCurso() + ", Matrícula: " + instituicao.getNumeroMatricula() +
				", da Instituição: " + instituicao.getNomeInstituicao());
				*/
		return "index";
		
	}
}
