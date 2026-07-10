package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
		// Considerando 1 como domingo
		byte number = 1;
		switch (number) {
		case 1:
			System.out.print("Domingo - Fim de Semana");
			break;
		case 2:
			System.out.print("Segunda Feira - Dia útil");
			break;
		case 3:
			System.out.print("Terça Feira - Dia útil");
			break;
		case 4:
			System.out.print("Quarta Feira - Dia útil");
			break;
		case 5:
			System.out.print("Quinta Feira - Dia útil");
			break;
		case 6:
			System.out.print("Sexta Feira - Dia útil");
			break;
		case 7:
			System.out.print("Sábado - Fim de semana");
			break;
		default:
			System.out.print("Inválido");
			break;
		}
	}

}
