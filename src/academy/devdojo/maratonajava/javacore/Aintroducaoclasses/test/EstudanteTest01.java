package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		estudante.idade = 20;
		estudante.nome = "Leandro";
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome); // Imprime "Leandro"
		System.out.println(estudante.idade); // Imprime 20
		System.out.println(estudante.sexo); // Imprime 'M'
		
		System.out.println(estudante); // Imprime o endereço, por que é uma variável de tipo reference
	}
}
