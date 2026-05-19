# CONVENÇÕES DE VARIÁVEIS - JAVA

### O que são Variáveis:
Uma variável é como uma caixa com um nome específico na memória do computador
usada para guardar alguma informação. O conteúdo dessa caixa pode ser lido,
utilizado ou alterado a qualquer momento enquanto o programa estiver rodando.

## 1) Tipos de Variáveis:
No Java, temos alguns tipos existentes de variáveis:
#### 1.1) Inteiros:
Armazenam números inteiros

Exemplo:
```Java
int idade = 10;
```

#### 1.2) double:
Armazenam números com casas decimais (pontos flutuantes) com dupla precisão

Exemplo:
```Java
double altura = 1.75;
```

#### 1.3) Float:
Armazenam números decimais com menor precisão de casas decimais e ocupam metade do espaço na memória em comparação ao ```double```. No Java é obrigatório colocar a letra ```f``` ou ```F``` no final do valor.

Exemplo:
```Java
float altura = 1.75f;
```

#### 1.4) Caracteres:
Armazenam um único caractere Unicode (letras, números, símbolos ou espaços). No Java, o valor deve ser colocado obrigatoriamente entre **aspas simples**

Exemplo:
```Java
char inicial = 'L';
```

#### 1.5) Inteiros de Pequeno Porte (Bytes):
Armazenam números inteiros muito pequenos, economizando o máximo de memória possível. Ocupam apenas 8 bits e aceitam valores que vão estritamente de **-128 até 127**

Exemplo:
```Java
byte mes = 12;
```

#### 1.6) Inteiros de curto Porte(Short):
Armazenam números inteiros maiores que um **byte**, mas ainda menores que um **int**. Ocupam 16 bits na memória e aceitam valores na faixa de **-32.768 até 32.767**.

Exemplo:
```Java
short aloLetivo = 2026;
```

#### 1.7) Inteiros de Grande Porte (Long):
Armazenam números inteiros muito grandes, que ultrapassam o limite de capacidade do **int**. Ocupam 64 bits na memória e aceitm valores na faixa de -9 x 10^18 até 9 x 10^18. No Java, é recomentado colocar a letra ```L``` no final do valor para indicar que o número é desse tipo.

Exemplo:
```Java
long populacaoMundial = 8000000000L;
```

#### 1.8) Valores lógicos(Booleanos):
Armazenam estados lógicos de verdadeiro ou falso. São fundamentais para tomadas de decisão e controle de fluxo no código, aceitando apenas dois valores possíveis: ```true``` ou ```false```.

Exemplo: 
```Java
boolean matriculado = true;
```

## 2) Como declarar uma variável:
A forma geral é:
```Java
tipo nomeDaVariavel;
// O nome da variável começa com MINÚSCULO, e se for composto, os outros nomes que não forem o inicial devem inciar com maíusculo
```

Exemplo:
```Java
int idadeDeLeandro;
```

## 3) Iniciando uma variável:
Para atribuirmos um valor a variável, usamos o operador de atribuição ```=```

Exemplo:
```Java
int idadeDeLeandro = 19;
```

## 4) Como printar uma variável:
Existem algumas maneiras de se mostrar o valor guardado em uma variável

Exemplo 1:
```Java
int age = 10;
System.out.print(age); // Vai mostrar 10
```

Exemplo 2 (em uma frase):
```Java
int age = 19;
System.out.print("Olá, eu tenho "+age+" anos"); // Vai mostrar "Olá, eu tenho 19 anos"
```