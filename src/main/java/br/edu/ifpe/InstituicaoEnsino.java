package br.edu.ifpe;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstituicaoEnsino {
	
	@Id
	private String nomeInstituicao;
	private String curso;
	private int duracao;
	private int semestreAtual;
	private String numeroMatricula;
	private String enderecoInstituicao;
	private String ufInstituicao;
	private String cepInstituicao;
	private String telefoneInstituicao;
	private String telefone2;
	private String coordenador;
	private String emailInstituicao;
	
	public InstituicaoEnsino(String nomeInstituicao, String curso, int duracao, int semestreAtual, String numeroMatricula,
			String enderecoInstituicao, String ufInstituicao, String cepInstituicao, String telefoneInstituicao, String telefone2, String coordenador,
			String emailInstituicao) {
		super();
		this.nomeInstituicao = nomeInstituicao;
		this.curso = curso;
		this.duracao = duracao;
		this.semestreAtual = semestreAtual;
		this.numeroMatricula = numeroMatricula;
		this.enderecoInstituicao = enderecoInstituicao;
		this.ufInstituicao = ufInstituicao;
		this.cepInstituicao = cepInstituicao;
		this.telefoneInstituicao = telefoneInstituicao;
		this.telefone2 = telefone2;
		this.coordenador = coordenador;
		this.emailInstituicao = emailInstituicao;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(int semestreAtual) {
		this.semestreAtual = semestreAtual;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getenderecoInstituicao() {
		return enderecoInstituicao;
	}

	public void setenderecoInstituicao(String enderecoInstituicao) {
		this.enderecoInstituicao = enderecoInstituicao;
	}

	public String getUfInstituicao() {
		return ufInstituicao;
	}

	public void setUfInstituicao(String ufInstituicao) {
		this.ufInstituicao = ufInstituicao;
	}

	public String getCepInstituicao() {
		return cepInstituicao;
	}

	public void setCepInstituicao(String cepInstituicao) {
		this.cepInstituicao = cepInstituicao;
	}

	public String getTelefoneInstituicao() {
		return telefoneInstituicao;
	}

	public void setTelefoneInstituicao(String telefoneInstituicao) {
		this.telefoneInstituicao = telefoneInstituicao;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public String getEmailInstituicao() {
		return emailInstituicao;
	}

	public void setEmailInstituicao(String emailInstituicao) {
		this.emailInstituicao = emailInstituicao;
	}
	
	
	
}
