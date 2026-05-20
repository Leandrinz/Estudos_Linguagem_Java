package academy.devdojo.maratonajava;

public class Aula04_Operadores {
    public static void main() {
        // ---- Aula 15 ----
        // Operadores aritméticos: + - / * %
        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        System.out.println(numero1+numero2);// Soma
        System.out.println(soma);

        int divisao = numero2 / numero1; // Divisão
        System.out.println(divisao);

        int subtracao = numero2 - numero1; // Subtração
        System.out.println(subtracao);

        int multiplicacao = numero2 * numero1; // Multiplicação
        System.out.println(multiplicacao);

        // % (Resto de divisão)
        int resto = 20 % 2;
        System.out.println(resto);


        // ---- Aula 16 (Operadores Relacionais) ----

        // Operadores relacionais: < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);

        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println(isDezIgualQueVinte);

        boolean isDezIgualDez = 10 == 10;
        System.out.println(isDezIgualDez);

        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezDiferenteVinte);


        // ---- Aula 17 (Operadores Lógicos) ----

        // Operadores Lógicos: && (AND), || (OR), ! (NOT)

        // && (AND)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta); // false
        System.out.println(isDentroDaLeiMenorQueTrinta); // false

        // || (OU)
        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // ---- Aula 19 (Operadores Atribuição) ----

        // Operadores de atribuição: = += -= /= %=
        double bonus = 1000;
        bonus += 1000; // 2000
        bonus -= 1000; // 1000
        bonus *= 2; // 2000
        bonus /= 2; // 1000
        bonus %= 2; // 0
        // Podemos usar o ++
        int cont = 0;
        cont++; // Incrementamos 1
        cont--; // Diminuímos 1
        System.out.println(bonus);
    }
}
