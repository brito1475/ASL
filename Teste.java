package teste;

import modelo.Agenda;

public class Teste {
	public static void main(String[] args) {
		Agenda a = new Agenda();
		a.armazenarPessoa("Meliodas", 8000, 1.65f);
		a.armazenarPessoa("Escanor", 41, 1.50f);
		a.armazenarPessoa("Hawk", 5000, 1.80f);

		a.imprimeAgenda();
		a.removerPessoa("Hawk");
		a.imprimeAgenda();
		
		int index_pessoa = a.buscaPessoa("Meliodas");
		
		a.imprimePessoa(index_pessoa);
	}
}
