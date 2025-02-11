# Aula 3
## Switch - Case
* Mesma coisa de C++, você entra uma expressão ou uma string e testa pra ver se resulta em algum dos casos do seu switch
* Não esquecer do break em todos os cases, senão ele roda todos os casos possíveis
* Default não é obrigatório, mas é bom ter
## While e Do-While:
* Mesma coisa de C++
* While testa algo para depois rodar o loop
* Do-While realiza alguma coisa pelo menos uma vez e depois testa ele pra saber se continua no loop
* A diferença básica é que o Do-While roda pelo menos uma vez, o While pode não rodar nenhuma
## For:
* Mesma coisa do C++
* Condições dentro do parênteses são as mesmas
* Você pode controlar esse loop colocando um ***Break*** para quebrar o loop
* Existe também o ***Continue***, que faz o que o nome diz, ele continua, mas a ideia dele é skipar um alguma coisa, por exemplo:
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Pula o número 5
            }
            System.out.println("Número: " + i);
        }
    }
}
```
## Escopo de Variável:
A ideia de sempre, escopo local, escopo global, etc. Só toma cuidado com o que você tá declarando e onde você está declarando.
## Função Random
É o que o nome diz, gera um numero aleatório -1 do que o informado na linha de código, por exemplo:
```java
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int x = rand.nextInt(11); // Garante um número entre 0 e 10
        System.out.println("Chuta um número entre 0 e 10");
        int y = sc.nextInt();
        
        while(y != x) {
            System.out.println("Errou, tenta de novo");
            y = sc.nextInt();
        }
        
        System.out.println("Parabéns, acertou!!");
        sc.close();
    }
}
```
Esse código gera um número aleatório de 0 à 10, pois o número informado na função foi 11
