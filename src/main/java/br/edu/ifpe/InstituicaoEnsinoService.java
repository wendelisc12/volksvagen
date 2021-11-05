package br.edu.ifpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituicaoEnsinoService {
	@Autowired
	private InstituicaoEnsinoDAO daoInstituicaoEnsino;
	
	public void inserirCandidato(InstituicaoEnsino instituicao) {
		this.daoInstituicaoEnsino.save(instituicao);
	}
}
