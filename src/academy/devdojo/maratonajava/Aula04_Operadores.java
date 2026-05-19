package academy.devdojo.maratonajava;

import java.sql.SQLOutput;

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


    }
}
