package entities;

import java.util.Objects;

public class Funcionario {

	private String nome;
	private String mail;
	private Double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String mail, Double salario) {
		this.nome = nome;
		this.mail = mail;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", mail=" + mail + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mail, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(mail, other.mail) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
	
}
