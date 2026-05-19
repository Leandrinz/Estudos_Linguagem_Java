# CASTING - Java

Casting é a conversão de um tipo de dado para outro.

## Casting Implícito

Acontece automaticamente quando um tipo menor é convertido para um maior.

### Exemplo

```java
int numero = 10;
double valor = numero;

System.out.println(valor);
```

### Saída

```text
10.0
```

O `int` foi convertido automaticamente para `double`.

---

## Casting Explícito

Acontece quando você força a conversão manualmente.

### Exemplo

```java
double valor = 10.8;
int numero = (int) valor;

System.out.println(numero);
```

### Saída

```text
10
```

O valor decimal foi perdido porque `int` não guarda casas decimais.

---

## Resumo

- Implícito: automático
- Explícito: manual usando `(tipo)`
- Pode haver perda de informação no casting explícito