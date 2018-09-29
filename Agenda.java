package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Pessoa> pessoa = new ArrayList<>();
	
	public void armazenarPessoa(String nome, int idade, float altura) {
		LocalDate dataNascimento = LocalDate.now().minusYears(idade);
		pessoa.add(new Pessoa(nome, dataNascimento, altura));
	}
	
	public void removerPessoa(String nome) {
		pessoa.remove(new Pessoa(nome));
	}
	
	public int buscaPessoa(String nome) {
		return pessoa.indexOf(new Pessoa(nome));
	}
	
	public void imprimeAgenda() {
		pessoa.stream().forEach(p -> System.out.println(p));
	}
	public void imprimePessoa(int index) {
		System.out.println(pessoa.get(index));
	}
}
