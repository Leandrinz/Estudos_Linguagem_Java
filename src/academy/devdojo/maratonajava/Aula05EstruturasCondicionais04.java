package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Imprima o dia da semana, considerando 1 como domingo
		int number = 10;
		// char, int, byte, short, enum, String
		switch (number) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Terça");
			break;
		case 4:
			System.out.print("Quarta");
			break;
		case 5:
			System.out.print("Quinta");
			break;
		case 6:
			System.out.print("Sexta");
			break;
		case 7:
			System.out.print("Sábado");
			break;
		default:
			System.out.print("Opção inválida");
		}
		
	}

}