# Estruturas de Repetição - Continue
Ao contrário do ``break``, ao usarmos o ``continue``, o restante do código da iteração atual é ignorado, e o laço passa para a próxima iteração.

## Sintaxe:
```Java
continue;
```

## Exemplo:
Temos um for que vai de 1 à 15, mas só queremos que apareça os maiores ou igual a 10.

```Java
for (int i = 1; i <= 15; i++){
	if (i < 10){
		continue; // Pula para o próximo valor de i, sem executar o código abaixo
	}
	System.out.println(i); // Só é executado quando o i é maior ou igual a 10, graças ao continue
}

```