# OPERADORES RELACIONAIS - JAVA
Operadores Relacionais são ferramentas que utilizamos para comparar dois valores de **Mesmo** tipo. Onde só retornam valores booleanos (true ou false).

A seguir, veremos seus principais operadores relacionais.

## 1) Tipos:

#### 1.1) Menor que (<):
Compara se A é menor que B (A < B)

Exemplo:
```Java
int a = 10;
int b = 20;

boolean aMenorQueb = a < b; // Retorna true, pois 10 é menor que 20
boolean bMenorQuea = b < a; // Retorna false, pois 20 NÃO é menor que 10
```

#### 1.2) Maior que (>):
Compara se A é maior que B (A > B)

Exemplo:
```Java
int a = 10;
int b = 20;

boolean aMaiorQueb = a > b; // Retorna false, pois 10 NÃO é maior que 20
boolean bMaiorQuea = b > a; // Retorna true, pois 20 é maior que 10
```

#### 1.3) Menor ou igual que (<=):
Compara se A é menor ou igual a B (A <= B)

Exemplo:
```Java
int a = 10;
int b = 11;
int c = 10;

boolean aMenorOuIgualQueb = a <= b; // Retorna true, pois 10 é menor que 11
boolean aMenorOuIgualQuec = a <= c; // Retorna true, pois 10 é igual a 10
boolean bMenorOuIgualQuea = b <= a; // Retorna false, pois 11 não é menor, nem igual a 10
```

#### 1.4) Maior ou igual que (>=):
Compara se A é maior ou igual a B (A >= B)

Exemplo:
```Java
int a = 20;
int b = 10;
int c = 30;

boolean aMaiorOuIgualQueb = a >= b; // Retorna true, pois 20 é maior que 10
boolean aMaiorOuIgualQuec = a >= c; // Retorna false, pois 20 não é maior e nem igual a 30
boolean bMaiorOuIgualQuea = b >= a; // Retorna false, pois 10 não é maior e nem igual a 20
```

#### 1.5) Igual á (==):
Compara se A é igual à B

Exemplo:
```Java
int a = 10;
int b = 10;

boolean aIgualb = a == b; // Retorna true, pois 10 é igual 10
```

#### 1.6) Diferente que (!=):
Compara se A é diferente que B

Exemplo:
```Java
int a = 10;
int b = 11;

boolean aDiferenteQueb = a != b; // Retorna true, pois 10 é diferente que 11
```