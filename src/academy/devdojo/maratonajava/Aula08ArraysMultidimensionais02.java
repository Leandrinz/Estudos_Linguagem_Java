package academy.devdojo.maratonajava;

public class Aula08ArraysMultidimensionais02 {

	public static void main(String[] args) {
		int[][] arrayInt = new int[3][]; // Podemos iniciar ela dando apenas o número de linhas
		
		// Outras formas de iniciar
		
		// Iniciando com valores 
		
		int[][] arrayInt2 = {{1,2},{1,2,3}, {1,2,3,4}};
		
		// Sem iniciar com os valores
		arrayInt[0] = new int[2]; // A posição 0 faz referência a um array de 2 posições
		arrayInt[1] = new int[3]; // A posição 1 faz referência a um array de 3 posições
		arrayInt[2] = new int[6]; // A posição 1 faz referência a um array de 3 posições
		
		// Iniciando com os valores em cada posição
		arrayInt[0] = new int[] {1,2};
		arrayInt[1] = new int[] {1,2,3};
		arrayInt[2] = new int[] {1,2,3,4,5,6};
		
		// Usando um array pronto
		int [] arraySub = {3,2,1};
		arrayInt[1] = arraySub;
		
		for (int[] arrayBase : arrayInt2) {
			for(int num : arrayBase) {
				System.out.println(num);
			}
		}

	}

}
