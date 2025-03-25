# Introdução a programção orientada a objetos
## Orientado a Objetos:
- Ainda está dentro do paradigma Imperativo, mas estamos agora no Orientado a Objetos ao invés do Estruturado
- O paradigma Imperativo se baseia em você dar ordens(comandos) para um código, onde você diz o que deve ser feito
- O Estruturado se baseia na construção de blocos em que um chama o outro
- O POO é visto como uma evolução do Estruturado, pois apresenta melhor organização dos dados
- Os dados não são globais, mas específicos para cada objeto
- Método é uma função orientada a um objeto e eles não necessariamente conversam entre si
## Classe:
- Tem um nome simples e auto-explicativo
- As variáveis definidas dentro de uma classe representam as características da classe. As váriaveis de uma classe são aquilo que uma classe sabe sobre ela mesma
- Exemplo:
```java
public class Pessoa {
    String nome;
    int idade;

    public void falar() {
        System.out.println("Olá alunos(as) de C06/C206");
    }
}
```
- A classe tem um nome auto-explicativo e suas respectivas características
## Herança:
- Quando uma classe herda as características de uma outra classe, por exemplo:
```java
public class Professor extends Pessoa {
    String nome;

    public void ministrarAula() {
        // ministra aula de POO
    }
}
```
- Uma classe filha herda todos os atributos de uma classe mãe, mas as características de uma classe filha não são acessíveis à uma classe mãe
- Uma característca pode ser definida novamente, seu dado reescreverá o dá classe herdada, o que não causará um problema para rodar, mas é desnecessário
## Associação:
- A classe pode ser usada como um tipo, sendo isso definido como uma Associação. Você associa uma classe a outra, logo, uma classe pode agora conversar com a outra
- Exemplo:
```java
public class Faculdade {
    String nome;
    Professor professor; // Associação

    public void ministrarAulas() {
        professor.ministrarAula(); // Quem ministra aula é o professor
    }
}
```
## Encapsulamento:
- Uso do ***public*** e do ***private***
- Uso de um dos dois modificadores para controle de acesso
- Apenas o **public** pode ser visto por todos,  o **private** só pode ser visto pela classe em que foi definida
## Instância:
- Criar uma classe é apenas uma especificação, a gente ainda não pode usá-la
- Para isso, precisamos instânciar essa classe, ou seja, criar um objeto concreto dessa classe
- "Na vida, não comemos a receita, comemos o bolo, e, mesmo assim, um não é igual ao outro, um pode sair perfeito e o outro queimado."
## Ponteiros: 
- ***Os objetos são, na verdade, ponteiros***
- Logo, o que é guardado pelos ponteiros são endereços de memória
- Assim, se você tentar comparar dois objetos que tem o mesmo valor para todas suas características em um IF para ver se são iguais, isso retornará falso, pois o endereço de memória dos dois são diferentes
- Mas, se caso você atribuir um objeto a outro, ambos agora terão o mesmo endereço de memória, o que, em um IF que compara ambos, retornará verdadeiro, pois agora ambos apontam para o mesmo endereço de memória
  - Assim, caso você atribua um valor para uma das características de um dos objetos, você na verdade estará atribuindo a ambos os objetos, pois ambos apontam para o mesmo endereço de memória  
