# Switch - Java
O Switch é uma estrutura condicional poderosa, a seguir veja como usá-la.

## Sintaxe:
```java
// char, int, byte, short, enum, String são os tipos que a variável pode ter
switch (variavel) {
	case 1: // Caso 'variavel' tenha valor == 1
		System.out.print("Caso 1"); // É printado esse comando
		break;
	case 2: // Caso 'variavel' tenha valor == 2
		System.out.print("Caso 2"); // 
		break;
	case 3: // Caso 'variavel' tenha valor == 3
		System.out.print("Caso 3"); // 
		break;
	default: // Caso o valor da 'variavel' não seja igual a nenhum dos case acima, ele cai no default.
		System.out.print("Nenhum dos casos"); 
}
```

## ATENÇÃO COM O BREAK!!!!
Cuidado para não criar o seu Switch e não adicionar o ``break``. O break faz com que somente o caso equivalente ao valor da variável seja executado.

Por exemplo, considere esse código:

```java
int pedido = 1;
switch (pedido){
	case 1:
		System.out.print("Hamburguer\n");
	case 2:
		System.out.print("Coca-cola\n");
	case 3:
		System.out.print("Sorvete\n");
```

Se rodassemos esse programa, esse seria o resultado na tela:

```terminal
Hamburguer
Coca-cola
Sorvete
```
Pois como não há o break, ele partiria do case que começou e iria descer até acabar o switch. 

