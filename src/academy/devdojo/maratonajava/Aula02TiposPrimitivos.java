package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // ---- AULA 10 ----
        // int, double, float, char, byte, short, long, boolean
        // Exemplo: tipo nomeComposto(primeiro o tipo, depois o nome COMEÇANDO COM MINÚSCULO
        int idade;
        int age = 10; // É assim que iniciamos
        System.out.println(age); // É assim que printamos o valor, sem aspas duplas
        System.out.println("\nA idade é "+age+" anos\n"); // Outra forma de printar (existem outras maneiras, mas vamos ver mais pra frente)

        // ---- AULA 11 ----
        double salarioDouble = 2000;
        float salarioFloat = 3000;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiroBool = true;
        boolean falseBool = false;
        char caractere = 10;

        // ---- AULA 13 ----
        String nome = "Vasco";
        System.out.println("O maior clube do mundo é o "+nome);
    }
}
