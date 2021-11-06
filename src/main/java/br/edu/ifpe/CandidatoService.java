package br.edu.ifpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
	@Autowired
	private CandidatoDAO daoCandidato;
	
	public void inserirCandidato(Candidato candidato) {
		this.daoCandidato.save(candidato);
	}

}
