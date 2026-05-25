package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main() {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 5000 pra caridade";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        // (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
