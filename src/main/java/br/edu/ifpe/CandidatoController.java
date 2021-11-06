package br.edu.ifpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

	@Controller
	public class CandidatoController {
	
		@Autowired
		private CandidatoService candidatoService;
		
		@GetMapping("/cadastroCandidato")
		public String exibirFormCadastro() {
			return "fichaInscricao";
		}
		
		@PostMapping("/salvarCandidato")
		public String salvarCliente(Candidato candidato) {
			this.candidatoService.inserirCandidato(candidato);
			return "index";
		}

}
