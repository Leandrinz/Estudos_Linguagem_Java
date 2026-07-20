# Arrays - Java
Array é uma estrutura de dados que armazena vários elementos do mesmo tipo em posições indexadas e de tamanho fixo.

A seguir, veja como funciona, sintaxe e como utilizar

## Declaração/Sintaxe:
```Java
tipo nome_variavel[] = new tipo[tamanho];
```

Exemplo -> Criação de Array de inteiro
```Java
int numero[] = new int[3];
```

Os tipos possíveis são:
- byte
- short
- int
- long
- float
- double
- char
- boolean
- String

Quando inicializados, todos os espaços contém esses respectivos valores:

```Java
// inicio vazio de cada tipo
		// byte, short, int, long, float e double 0
		// char '\u0000' ' '
		// boolean false
		// String null
```

## Indexação/Acesso por índice:
Considere que temos uma array ``numeros[3]`` e queremos acessar o índice 1 e colocar o valor 4 lá

A solução seria:

```Java
numeros[1] = 4; -> Acessamos a array no índice 1 e atribuímos o valor 4 dentro
```

Agora surge a pergunta -> "Se eu tiver um array de 20 posições, como faço pra colocar um determinado valor em TODAS as posições de um jeito fácil?"

E a resposta é: usando o for.

Suponha que temos uma array de 20 posições chamada ``numeros[20]``, e em todos os índices que vão de 0 à 19 (lembre-se que a contagem de índice começa do 0), queremos atribuir o valor '1'.

Solução:

```Java
int numeros[20] = new int[20];

// Atribuindo 1 a todos os índices
for (int i = 0; i < 20; i++){ // Começa no 0 e vai até o 19
	numeros[i] = 1; // Acessa o índice de valor i(que começa do 0 e vai até o 19 a partir da incrementação do for. Se tiver dúvidas, veja a aula de for em 06_EstruturasDeRepetição) e atribui o valor 1
}
```

#### Dica:
Podemos usar no for o comando ``numeros.length``, para pegar o tamanho da array. 

Ficaria assim:

```Java
int numeros[20] = new int[20];

// Atribuindo 1 a todos os índices
for (int i = 0; i < numeros.length; i++){ // Começa no 0 e vai até o 19
	numeros[i] = 1; 
}
```

Isso ajuda caso o tamanho da array mude em algum momento do desenvolvimento do programa, e ficamos livres de alterações no for.


## Iniciar array com valores:
Podemos também iniciar nossa array já com os valores.

Exemplo:

```Java
int numeros[] = {1,2,3,4,5} // Criamos uma array de inteiros com tamanho 5
```

## Foreach:
Um for mais simples que percorre toda a array

Exemplo:

```Java
int[] numeros2 = {1,2,3,4,5};

for (int num : numeros2){
	System.out.println(num);
}
```

Saída no terminal:

```terminal
1
2
3
4
5
```