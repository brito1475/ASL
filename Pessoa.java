package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	private String nome;
	private LocalDate nascimento;
	private float altura;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, LocalDate nasc, float altura) {
		this.nome = nome;
		this.nascimento = nasc;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData_nascimento() {
		return nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.nascimento = data_nascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public long getIdade() {
		LocalDate hoje = LocalDate.now();
		long idade = ChronoUnit.YEARS.between(nascimento, hoje);  
		return idade;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nome: "+nome+" Altura: "+altura+" Idade: "+getIdade();
	}

}
