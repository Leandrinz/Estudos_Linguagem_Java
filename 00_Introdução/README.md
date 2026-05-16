# Instalando o Java
Olá, daremos início ao estudo da linguagem de programação Java. Nesta aula, vamos aprender a como instalar a linguagem e a melhor configuração possível para conseguirmos trabalhar sem dor de cabeça. Bons estudos!!!

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
No terminal do seu computador digite:
```terminal
java --version
```
Se aparecer algo parecido com isto: ![alt text](image-2.png)
Deu tudo certo!!!


# 2) Instalando a IDE IntelliJ:
Para melhor experiência, iremos utilizar a IntelliJ como nossa principal IDE (mas você ainda pode optar pelo Vscode)

## 2.1 Download do instalador:
Vá para a página oficial da Jetbrains por esse link -> [Link](https://www.jetbrains.com/pt-br/idea/download/?section=windows)
Você será levado para esta página:
![img.png](img.png)

Selecione seu sistema operacional (Windows, Linux ou macOS) e em seguida clique em baixar

O instalador será baixado: 

![img_2.png](img_2.png)

Após isso, clique nele e você chegará até essa parte: 
![img_3.png](img_3.png)

O que marcar:

[X] IntelliJ IDEA (em Create Desktop Shortcut): Cria o ícone na sua área de trabalho para abrir fácil.

[X] Add "bin" folder to the PATH (em Update PATH Variable): Esse é obrigatório. Ele permite que o Windows reconheça os comandos do IntelliJ em qualquer terminal (como o prompt de comando ou Git Bash).

[X] Add "Open Folder as Project" (em Update Context Menu): Extremamente útil. Quando você tiver uma pasta com códigos no seu computador, basta clicar nela com o botão direito e escolher essa opção para abrir direto no IntelliJ.

[X] .java e [X] .kt (em Create Associations): Faz com que arquivos isolados de Java e Kotlin abram direto no IntelliJ por padrão quando você der dois cliques neles. (Se for usar Gradle futuramente, pode marcar .gradle e .kts também).

Depois de tudo isso, finalize clicando em "Install":

![img_4.png](img_4.png)

# 3) Seu primeiro código em Java:
Agora que já temos tudo instalado, crie um arquivo chamado "OlaDevVasco.java" e nele copie:
```Java
public class OlaDevVasco {
    public static void main(String[] args){
        System.out.println("Teste KA-ME-HA-ME-HAAAAAAAAAAAAAAAAAAAAA");
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