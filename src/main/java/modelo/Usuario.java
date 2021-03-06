package modelo;

import java.time.LocalDate;

public class Usuario {
	
	private String nome;
	private String cpf;
	private String email;
	private LocalDate dataAniversario;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(LocalDate dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
