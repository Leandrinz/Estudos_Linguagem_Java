# Break
Break é usado para sairmos de um laço de repetição

### Sintaxe
Em um laço de repetição qualquer, podemos usar o ``break`` para sair do laço.

Exemplo: Usando um for, saia do laço quando o valor de i chegar em 10

```java
for (int i = 1; i <= 10000000; i++){
	System.out.print(i);
	if (i == 10){ // Condição
		break; // Sai do laço quando i chega em 10
	}
}