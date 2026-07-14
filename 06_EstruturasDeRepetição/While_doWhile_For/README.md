# Estruturas de Repetição - while, do while, for
Estruturas de repetição são comandos que executam um bloco de código várias vezes, enquanto uma condição for verdadeira ou por um número definido de repetições.

A seguir, você verá as 3 estruturas de repetições existentes e como usá-las


## while
Usamos o ``while`` quando não sabemos a quantidade de vezes que o código irá rodar
#### Sintaxe
```Java	
int count = 1;
while (count < 10) {
	System.out.print(count); // É executado enquanto a variável 'count' for menor que 10
	count += 1; // Incrementa 1 a variável (se não houver incremento, haverá loop, pois a variável 'count' sempre será 1
}
```


## do while (Executa pelo menos uma vez)
Usamos o ``do while`` quando queremos que o código seja executado pelo menos uma vez, independente se a condição é verdadeira
#### Sintaxe
```java
do { 
	System.out.print("dentro do do-while");
} while (count < 10);
```
	
		
## for (mais usado)
Usamos quando sabemos quantas vezes nosso código deverá rodar
#### Sintaxe
```java
for (int inicio = 0; inicio < 10; inicio++){ // inicio; condição de parada; incremento
	System.out.println("For "+inicio); // Código que será executado
}
```