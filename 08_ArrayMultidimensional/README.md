# Array Multidimensional
Um array multidimensional é um array de arrays usado para representar dados em múltiplas dimensões (como uma matriz).

A seguir veremos seu funcionamento, sintaxe e como usar


## Declaração:
Para declarar, seguimos o padrão abaixo:

```Java
tipo[][] variavel_nome = new tipo[3][4]; // O 3 representa o número de linhas, e o 4 o número de colunas
```
O tipo são os mesmos possíveis em uma array normal (verifique o arquivo '07_Arrays' para ver quais são)

## Funcionamento:
Quando temos uma variável que é uma array multidimensional, por exemplo essa abaixo:

```Java
int[][] dias = new int[2][2];
```
Temos mais ou menos isso:

![Exemplo](./Print1.png)

Criamos 2 espaços com índices que vão de 0 à 1, onde cada um desses espaços tem 2 blocos atribuídos a eles, onde esses blocos vão do índice 0 à 1.

## Indexação/Acesso por índice:
Para acessarmos um espaço diretamente fazemos:

```Java
dias[0][1] = 28;
```

O que mudou:

