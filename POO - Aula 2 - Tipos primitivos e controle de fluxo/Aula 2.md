# Tipos primitivos e controle de fluxo
## Fortemente tipada:
Java é uma linguagem fortemente tipada, que significa que devemos obrigatóriamente declarar o tipo da variável quando a declaramos.
## Variáveis:
* As declarações são iguais a C++
* A atribuição pode ser feita juntamente da declaração da variável ou feita após a declaração
* Os tipos são: boolean, byte, short, int, long, float, double, char
* Para representar cadeia de caracteres, podemos representar com a classe especial String, que pode ser usada como um tipo primitivo
  * Temos ainda métodos para manipulação de string, como: .length(), .toUpperCase(), .equalsIgnoreCase(), .startsWith(), .replace();
## Casting e promoção
* Como Java é uma linguagem fortemente tipada, em uma igualdade, não podemos ter do lado esquerdo um tipo de variável que é menor do que a que está no lado esquerdo, como tentar atribuir uma double para uma variável float
  * Caso isso ocorra, o código não compilará
  * Outro caso que pode ocorrer, caso tenhamos uma operação entre int e int e essa operação for atribuída a uma float, a operação será feita como um int e seu resultado será guardado como float, mas caso o resultado fosse um resultado quebrado, a parte fracionaria será perdida
* Para resolver esses problemas, podemos usar o ***Casting*** e a ***Promoção***:
  * ***Casting***:
    * A ideia do casting é colocar o tipo que você quer que o valor se torne antes da variável, assim a atribuição ou a operação será feita com o tipo que foi atribuido nos parenteses
    * ```java
      public class CastingExample {
      public static void main(String[] args) {
        // Casting implícito (widening)
        int numInt = 10;
        double numDouble = numInt; // Converte automaticamente de int para double
        System.out.println("Casting implícito: " + numDouble);

        // Casting explícito (narrowing)
        double valor = 9.7;
        int valorInt = (int) valor; // Converte de double para int (perde a parte decimal)
        System.out.println("Casting explícito: " + valorInt);
        }
      }

  * ***Promoção***:
    * A ideia da promoção é a de promover uma variável, ou seja, atribuir o seu valor a uma variável maior
    * ```java
      public class TypePromotionExample {
      public static void main(String[] args) {
        // Exemplo de promoção de tipos em expressões aritméticas
        byte a = 10;
        byte b = 20;
        
        // 'a' e 'b' são promovidos automaticamente para int antes da soma
        int resultado = a + b; 
        System.out.println("Resultado da promoção: " + resultado);

        // Exemplo com ponto flutuante
        int numInt = 5;
        float numFloat = 4.5f;
        
        // 'numInt' é promovido para float antes da multiplicação
        float resultadoFloat = numInt * numFloat; 
        System.out.println("Resultado da promoção com float: " + resultadoFloat);
        }
      }
    * Apesar de menos usada, ela ainda existe
## Entrada de dados:
Para realizar a entrada de dados no Java, usamos o pacote java.util.Scanner, no qual devemos primeiro declarar o Scanner e após sua utilização devemos fecha-lo, para que não ocorra o vazamento de dados
```java
// Declara o scanner
Scanner valorTeclado = new Scanner(System.in);

// Lê um inteiro digitado
int meuInteiro = valorTeclado.nextInt();

// Lê um float digitado
float meuFloat = valorTeclado.nextFloat();

// Lê uma cadeia de caracteres digitadas
String meuNome = valorTeclado.nextLine();

//Fechando o Scanner
valorTeclado.close()
```
## If-Else
A estrutura é similar a em C++, tanto em declaração quanto em utilidade
