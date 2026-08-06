# Introdução de Métodos - POO Java
Métodos são funções definidas dentro de uma classe que representam os comportamentos de um objeto. Eles executam ações ou manipulam os atributos da classe, podendo receber parâmetros e retornar valores.

## Sintaxe:

Temos a classe `Calculadora`:

```Java
public class Calculadora {
	
	public void somaDoisNumeros() {
		System.out.println(10+10);
	}
	
}
```

Nesta classe temos um método chamado `somaDoisNumeros`. Onde ele vai printar na tela a soma de 10 + 10, ou seja -> 20.

Em todo método teremos:
- modificador de acesso -> `public` no exemplo que demos
- o tipo de retorno -> `void` no exemplo, já que ele não retorna nada
- nome do método -> `somaDoisNumeros` no exemplo

E por último, o código do método. Que irá determinar o que ele vai fazer. No caso do exemplo, é apenas a linha:

```Java
System.out.println(10+10);
```

Em geral, a sintaxe dos métodos são:

```Java
modificadorDeAcesso retorno nomeDoMetodo {
	bloco de instrução
}
```

## Chamando/Usando o método:
Agora iremos fazer uso do método que criamos. 

Para isso, criamos o nosso objeto:

```Java
Calculadora calculadora = new Calculadora();
```

E chamamos o método dessa forma:

```Java
calculadora.somaDoisNumeros(); // Note o uso dos parênteses
```

Exemplo completo `CalculadoraTest01`:

```Java
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(); // Criamos o objeto chamado "calculadora", da mesma forma que fizemos nas outras aulas
		
		calculadora.somaDoisNumeros(); // chamamos o método, onde vai printar o número 20 na tela
		
	}

}

```

Saída no terminal:

```terminal
20
```

