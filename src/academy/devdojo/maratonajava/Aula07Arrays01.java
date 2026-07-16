package academy.devdojo.maratonajava;

public class Aula07Arrays01 {

	public static void main(String[] args) {
		int idades[] = new int[3]; // Índices 0, 1, 2.
		// Arrays são considerados objetos
		for (int i = 0; i <= 2; i++) {
			idades[i] = (i + 2);
			System.out.println(idades[i]);
		}
		
	}

}
