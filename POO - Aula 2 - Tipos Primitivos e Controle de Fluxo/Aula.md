# Tipos primitivos e controle de fluxo
## Comentários:
Igual C++, tanto em // quanto /* */
## Declarando e usando variáveis
* Igual C++, se declara colocando o tipo primeiro, depois o nome e é possível fazer atribuição junto da declaração ou fazer posteriormente.
* Temos boolean, byte, short, int, long, float, double e char.
* Para cadeia de caracteres, o Java possui a classe String, que é considerado um tipo primitivo, mesmo sendo uma classe.
## Casting e promoções
* Java é fortemente tipado, então, se você fizer uma divisão que resulta em vírgula e atribuir à uma float, ele realiza como um int e o resultado é promovido a float, mas esse resultado quebrado não aparecerá como um resultado quebrado.
* Outra questão causada por ser fortemente tipada, se ambos os lados de uma atribuição não tiverem o mesmo tipo, o Java não compila
* Para isso, temos **o casting e a promoção**. A ideia do casting é colocar entre parenteses primeiro o tipo que você quer que a váriavel se converta, como ```java
double pi = 3.14;
int numero2 = (int) pi;```

* Temos também a promoção, que é atribuir uma váriavel menor a uma maior, mas essa é menos usada.
## Entrada de dados:
Para entrar dados, usamos o pacote java.util.Scanner
```java
// Declara o scanner
Scanner valorTeclado = new Scanner(System.in);

// Lê um inteiro digitado
int meuInteiro = valorTeclado.nextInt();

// Lê um float digitado
float meuFloat = valorTeclado.nextFloat();

// Lê uma cadeia de caracteres digitadas
String meuNome = valorTeclado.nextLine();

//Depois precisamos fechar o scanner
Scanner.close();
```
## If e else
Mesma coisa de C++
