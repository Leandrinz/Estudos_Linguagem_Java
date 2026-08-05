package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarrosTest01 {

	public static void main(String[] args) {
		Carros carro1 = new Carros();
		Carros carro2 = new Carros();
		
		// Carro 1
		carro1.nome = "Volkswagen";
		carro1.modelo = "Fusca 1300 Standard";
		carro1.ano = 1972;
		
		// Carro 2
		carro2.nome = "Chevrolet";
		carro2.modelo = "Opala Comodoro SL/E";
		carro2.ano = 1988;
		
		
		System.out.println("Nome:" + carro1.nome + " Modelo:"+ carro1.modelo + " Ano:" + carro1.ano);
		
		System.out.println("Nome:" + carro2.nome + " modelo:"+ carro2.modelo + " Ano:" + carro2.ano);
	}

}
