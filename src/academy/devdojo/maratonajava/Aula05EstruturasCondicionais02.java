package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // ---- Aula 21 (ELSE IF) ----
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria Juvenil
        // idade >= 18 categoria profissional
        int idade = 17;
        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria adulto");
        }
        else{
            System.out.println("Categoria adulto");
        }
    }
}
