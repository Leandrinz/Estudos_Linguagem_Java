# OPERADORES LÓGICOS - JAVA
No Java, os operadores lógicos combinam ou invertem expressões booleanas para construir condições complexas. Eles servem como a base para o controle de fluxo do programa, avaliando se um conjunto de regras é verdadeiro (true) ou falso (false).

A seguir, veremos seus 3 operadores.

### 1) && (AND):
Retorna true apenas se todas as condições forem verdadeiras.

Exemplo:
```Java
boolean condição1 = true;
boolean condição2 = true;
boolean condição3 = false;

boolean ehVerdade = condição1 && condição2; // Retorna true, pois ambas são verdadeiras
boolean ehFalso = condição1 && condição3; // Retorna false, pois só um é verdadeiro
```

### 2) || (OR):
Retorna true se pelo menos uma das condições for verdadeira.

Exemplo:
```Java
boolean condição1 = true;
boolean condição2 = false;
boolean condição3 = false;

boolean ehVerdade = condição1 || condição3; // Retorna true, pois um deles é verdadeiro
boolean ehFalso = condição2 || condição3; // Retorna false, pois todas são falsas
```

### 3) ! (NOT):
Inverte o valor da condição (o que é true vira false e vice-versa).

Exemplo:
```Java
boolean condição1 = true;
boolean condição2 = false;

boolean ehFalso = !condição1; // Retorna false, pois inverteu o true do "condição1" pra false
boolean ehVerdade = !condição2; // Retorna true, pois inverteu o false do "condição2" pra true
```

#### Observação:
Podemos usar esses operadores lógicos em conjunto com os relacionais

Por exemplo:
```Java
int dinheiroFisico = 20;
int dinheiroNoCartao = 1;
int almoço = 2;

// Vamos verificar se temos dinheiro suficiente para pagar o almoço
boolean consigoAlmoçar = dinheiroFisico >= almoço || dinheiroNoCartao >= almoço; // Retorna true, ou seja, temos dinheiro suficiente para pagar o almoço. Por mais que não tenhamos dinheiro suficiente no cartão, ainda temos dinheiro físico suficiente, logo pela propriedade do || (OR), poderemos almoçar em paz!!!
```

#### TABELA VERDADE:
Essa tabela nos guia para quando não sabermos quando tal análise vai retorna true ou false, aproveite!!!

### Operadores `&&` (AND) e `||` (OR)

| Condição A | Condição B | A && B (AND) | A \|\| B (OR) |
| :---: | :---: |:------------:|:-------------:|
| `true` | `true` |  **`true`**  |  **`true`**   |
| `true` | `false` |   `false`    |  **`true`**   |
| `false` | `true` |   `false`    |  **`true`**   |
| `false` | `false` |   `false`    |    `false`    |

---

### Operador `!` (NOT)

| Condição A |  !A (NOT)  |
| :---: |:----------:|
| `true` |  `false`   |
| `false` | **`true`** |
