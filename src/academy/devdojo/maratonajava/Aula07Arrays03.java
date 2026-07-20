package academy.devdojo.maratonajava;

public class Aula07Arrays03 {

	public static void main(String[] args) {
		// inicio vazio de cada tipo
				// byte, short, int, long, float e double 0
				// char '\u0000' ' '
				// boolean false
				// String null
		
		String[] nomes = new String[4];
		nomes[0] = "Vasco";
		nomes[1] = "Messi";
		nomes[2] = "Barcelona";
		nomes[3] = "Yamal";
		
		for (int i = 0; i < nomes.length; i++) { //nomes.length dá o tamanho da array
			System.out.println(nomes[i]);
		}
		
		/// Se temos:
		/// String[] nomes = new String[3]; -> Temos nossos 3 espaços
		/// Porem, se fizermos:
		/// nomes = new String[3]; -> Criamos um novo array de 3 espaços, e o antigo é LIMPADO e perdido

	}

}
