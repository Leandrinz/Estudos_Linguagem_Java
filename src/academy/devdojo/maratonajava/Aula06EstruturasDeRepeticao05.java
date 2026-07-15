package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao05 {
	// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
	// Condição valorParcela >= 1000
	public static void main(String[] args) {
		double valorTotal = 30000;
		for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
			double valorparcela = valorTotal / parcela;
			if (valorparcela < 1000) {
				continue; // Pulamos pra próxima iteração
			}
			else {
				System.out.println("Parcela "+ parcela + " R$ " + valorparcela);
			}
		}

	}

}
