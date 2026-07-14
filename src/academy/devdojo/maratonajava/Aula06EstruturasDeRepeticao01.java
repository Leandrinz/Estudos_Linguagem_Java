package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {

	public static void main(String[] args) {
		// while, do while, for
		
		// while
		int count = 12;
		while (count < 10) {
			System.out.print(count);
			System.out.print("\n");
			count += 1;
		}
		
		// do while (Executa pelo menos uma vez)
		do {
			System.out.print("dentro do do-while");
		} while (count < 10);
		
		// for
		for (int i = 0; i < 10; i++){
			System.out.println("For "+i);
		}
	}

}
