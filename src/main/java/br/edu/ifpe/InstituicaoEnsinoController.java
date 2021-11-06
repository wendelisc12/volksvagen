package br.edu.ifpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InstituicaoEnsinoController {

	@Autowired
	private InstituicaoEnsinoService instituicaoEnsinoService;
	
	@GetMapping("/cadastroInstituicao")
	public String exibirFormCadastroInstituicao() {
		return "fichaInscricaoInstituicao";
	}
	
	@PostMapping("/salvarInstituicao")
	public String salvarInstituicao(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsinoService.inserirInstituicao(instituicaoEnsino);
		return "index";
	}

}
