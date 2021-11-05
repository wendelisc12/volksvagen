package br.edu.ifpe;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Candidato {
	
	@Id
	private ArrayList<String> categoriaEstagio = new ArrayList<>(); // enum pra ser feito ainda
	private String nome;
	private InstituicaoEnsino instituicaoEnsino;
	private String endereco;
	private String uf;
	private String cep;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataNascimento;
	private String telefone;
	private String celular;
	private String email;
	
	
	public Candidato(ArrayList<String> categoriaEstagio, String nome, String endereco, String uf, String cep,
			LocalDate dataNascimento, String telefone, String celular, String email, InstituicaoEnsino instituicaoEnsino) {
		super();
		this.categoriaEstagio = categoriaEstagio;
		this.nome = nome;
		this.endereco = endereco;
		this.uf = uf;
		this.cep = cep;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.instituicaoEnsino = instituicaoEnsino;
	}
	public ArrayList<String> getCategoriaEstagio() {
		return categoriaEstagio;
	}
	public void setCategoriaEstagio(ArrayList<String> categoriaEstagio) {
		this.categoriaEstagio = categoriaEstagio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InstituicaoEnsino getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(InstituicaoEnsino instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	
	
	
			
}
