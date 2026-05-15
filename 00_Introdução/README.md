# Instalando o Java
Olá, daremos início ao estudo da linguagem de programação Java. Nesta aula, vamos aprender a como instalar a linguagem e a melhor configuração possível (no Vscode) para conseguirmos trabalhar sem dor de cabeça. Bons estudos!!!

# 1) Onde baixar?
Acesse: https://adoptium.net/

Você entrará nesta página: ![alt text](image.png)

Clique em "Baixar Temurin"

Após baixar, clique e execute o instalador para começar a instalação do Java.

Você irá chegar nesta parte: ![alt text](image-1.png)

- O que fazer:
  - Clique no ícone do "X" vermelho ao lado de Set or override JAVA_HOME variable.
  - Selecione a opção "Will be installed on local hard drive" (deve ser a primeira da lista que aparecer).
  - Faça o mesmo para a opção de baixo: JavaSoft (Oracle) registry keys.

## Verificar se deu tudo certo:
No terminal do seu computador ou Vscode, digite:
```terminal
java --version
```
Se aparecer algo parecido com isto: ![alt text](image-2.png)
Deu tudo certo!!!

### Algumas dicas no Vscode:
No Vscode, acesse a aba de extensões, e pesquise por "Extension Pack for Java".

Você irá encontrar essa: ![alt text](image-3.png)

Ao encontrar, instale a extensão.

# 2) Seu primeiro código em Java:
Agora que já temos tudo instalado, crie um arquivo chamado "OlaDevVasco.java" e nele copie:
```Java
public class OlaDevVasco {
    public static void main(String[] args){
        System.out.println("KA-ME-HA-ME-HAAAAAAAAAAAAAAAAAAAAA");
    }
}
```

No terminal digite:
```terminal
javac OlaDevVasco.java
```
Isso vai gerar um arquivo chamado "OlaDevVasco.class". Esse é o arquivo que o computador entende

E agora digite:
```terminal
java OlaDevVasco
```

No seu terminal aparecerá:

![alt text](image-4.png)

Agora sim, estamos prontos para o nosso estudo de Java. Acompanhe as próximas aulas e Bons estudos!!!