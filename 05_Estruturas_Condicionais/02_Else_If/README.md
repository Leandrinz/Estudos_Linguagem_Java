# ESTRUTURA CONDICIONAL ELSE IF - JAVA
Dentro das estruturas condicionais, temos o ```else if```, que usamos quando temos mais de 2 possíveis acontecimentos.


##  Sintaxe:
```Java
public static void main(String[] args) {
    if (condicao1){
        // Bloco do if
    } else if (condicao2) { // Repare no else if
        // Bloco do else if
    }
    else{
        // Bloco do else
    }
}
```
Caso a condicão1 no ```if``` não seja satisfeita, ele irá para o ```else if``` e verifica a condicao2, e caso não seja satisfeita, termina no else.

Observação: Caso a condicao1 do ```if``` seja satisfeita, ele irá IGNORAR tanto o ```else if``` e o ```else```

## Exemplo:
Exemplo: Temos que separar jogadores em categorias Infantil, Juvenil e Profissional com base na idade. Usando apenas If e Else. Isso seria ineficaz, então usamos o ```else if```

```Java
public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria Juvenil
        // idade >= 18 categoria profissional
        int idade = 17;
        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria adulto"); // Bloco que será executado (com a idade == 17)
        }
        else{
            System.out.println("Categoria adulto");
        }
    }

```