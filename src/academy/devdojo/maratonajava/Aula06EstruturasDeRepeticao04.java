package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao04 {
	// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
	// Condição valorParcela >= 1000
	public static void main(String[] args) {
		int valorCarro = 70000;
		for (int parcela = 1; parcela <= valorCarro; parcela++) {
			double valorParcela = valorCarro / parcela;
			if (valorParcela >= 1000) {
				System.out.println("Parcela "+parcela+ " R$ "+valorParcela);
			}
			else {
				break;
			}
			System.out.println("Fora do if, mas dentro do for "+parcela);
		}

	}

}
