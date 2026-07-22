package academy.devdojo.maratonajava;

public class Aula08ArraysMultidimensionais01 {

	public static void main(String[] args) {
		// 1,2,3,4,5 Meses
		// 31,28,31,30 dias
		int[][] dias = new int[3][4]; // O 3 representa o número de linhas, e o 4 o número de colunas
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		dias[0][0] = 31; // Janeiro
		dias[0][1] = 28; // Fevereiro
		dias[0][2] = 31; // Março
		dias[0][3] = 30; // Abril
		 
		dias[1][0] = 31; // Maio
		dias[1][1] = 30; // Junho
		dias[1][2] = 31; // Julho
		dias[1][3] = 31; // Agosto
		
		dias[2][0] = 30; // Setembro
		dias[2][1] = 31; // Outubro
		dias[2][2] = 30; // Novembro
		dias[2][3] = 31; // Dezembro
		int soma = 0;
		for (int i = 0; i < dias.length; i++) { // dias.length pega o número de linhas
			for (int j = 0; j < dias[0].length; j++) { // dias[0].length pega o número de colunas
				System.out.println("Mês - "+meses[soma]);
				System.out.println("Dias - "+dias[i][j]);
				System.out.println("");
				soma++;
			}
		}
	}

}
