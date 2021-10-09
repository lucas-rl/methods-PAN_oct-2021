package listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Lista {
	/*public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add(77);
		lista.add("Julio Farias");
		lista.add(3003.32);
		lista.add(80);
		System.out.println("Lista com 80:" + lista);
		lista.remove(3);
		
		System.out.println("Lista com elementos diferentes " + lista);
		System.out.println("Lista com nome " + lista.get(1));
		System.out.println("Lista com salário " + lista.get(2));
		lista.clear();
		System.out.println("Lista esvaziada:" + lista);
		
	}
	*/
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Antônio Sousa");
		lista.add("Lúcia Ferreira");
		lista.add("Marcelo");
		
		lista.remove("Lúcia Ferreira");
		
		System.out.println(lista.size());
		
		lista.forEach(System.out::println);
		
		System.out.println("-----------");
		List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);
		itens.parallelStream().filter(i -> i > 16).forEach(System.out::println);
		
		
	}
	

}
