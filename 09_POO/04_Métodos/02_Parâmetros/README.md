# Parâmetros - Java POO
Parâmetros de métodos são variáveis declaradas na assinatura do método que recebem valores na sua chamada.
Eles permitem que o método utilize dados externos para executar sua função.

## Sintaxe:

```Java
public void nomeMetodo(tipo variavel1, tipo variavel2){
}
```

O número de parâmetros são ilimitados, você que vai decidir a quantidade. Mas lembre-se de usar eles na hora da execução.

Temos como exemplo o método `multiplicaDoisNumeros`:

```Java
public void multiplicaDoisNumeros(int num1, int num2){
	System.out.println(num1 * num2);
}
```

`num1` e `num2` são os parâmetros do nosso método, pertencendo ao tipo inteiro.

O método pega esses dois valores e vai printar na tela o resultado da multiplicação deles.

## Usando os parâmetros:
Para usar, basta criar o objeto:

```Java
Calculadora calculadora = new Calculadora();
```

E agora chamar o método com os parâmetros que desejar. Por exemplo, eu quero a multiplicação de 10 e 2, que vai dar 20.

```Java
calculadora.multiplicaDoisNumeros(10,2); // Eu chamo o método e dentro dos parênteses passo os números que desejo.
```

Exemplo completo `CalculadoraTest01`:

```Java
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(); // Criamos o objeto chamado "calculadora", da mesma forma que fizemos nas outras aulas
		
		calculadora.multiplicaDoisNumeros(10, 2);
	}

}

```

Saída no terminal:

```Java
20
```