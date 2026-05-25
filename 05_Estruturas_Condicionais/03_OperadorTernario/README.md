# OPERADOR TERNÁRIO - JAVA
No Java temos o operador ternário, identificado com o símbolo (?), e podemos utilizá-lo para atribuir 2 valores diferentes, dependendo se uma condição é verdadeira ou falsa

## Sintaxe:
```Java
tipo variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
```
Caso a condição seja verdadeira, a variável irá receber valorSeVerdadeiro. Mas, se a condição for falsa, a variável recebe o valorSeFalso

### Exemplo:
```Java
int idade = 17;
String situacao = (idade >= 18) ? "Maior de idade" : "Menor de idade"; 
// Como idade NÃO é maior ou igual que 18, a variável String receberá o valor "Menor de idade"
```

### Observações:
Não é recomendado usar quando temos mais de 2 possíveis valores possíveis. No caso utilizariamos o ```else if```.