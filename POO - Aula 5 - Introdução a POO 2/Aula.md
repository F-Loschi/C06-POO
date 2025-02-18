# Introdução a POO PT.2
## Métodos
* Para usar um método para mexer com os objetos, passamos os objetos como referência para os métodos
## UML(Unified Modeling Language):
* Linguagem visual para especificação, visualização e documentação de software
* É a mesma que foi usada em BD
* Por ele, a gente desenha o que o código precisa fazer, as classes, características e métodos
## Relacionamento entre objetos:
* A comunicação entre classe é comum e um pode conversar com o outro e isso é chamado de ***Associação***
  * Isso significa que um objeto contém ou está conectado com um outro
* ***Agregação***:
  * Significa que existe um objeto todo e um objeto parte
  * Um objeto todo não existe sem um objeto parte
    * "Uma conta no banco não existe sem um cliente"
  * O todo é o que recebe o losângo e a parte é o que envia
  * Em termos de código, isso significa que declaramos uma característica em uma classe importando uma outra classe
    * Por exemplo, definir uma característica Cliente Titular dentro de uma classe Conta
    * ```java
      public class Main {
        public static void main(String[] args) {
          Conta conta = new Conta();
          Cliente cliente = new Cliente();
          conta.titular = cliente;
        }
      }
    * Com isso, a variável "cliente" e "conta.titular" apontam para o mesmo endereço de memória. Assim, ambas variável apontam para cliente e para navegar nisso, basta usar "."
    * ```java
      Conta conta = new Conta();
      Cliente cliente = new Cliente();

      cliente.nome = "Jaum";
      cliente.cpf = "123.123.123";

      conta.titular = cliente;

      System.out.println("Nome do cliente: " + conta.titular.nome);
      System.out.println("CPF do cliente: " + conta.titular.cpf);

      // Mesma saída
      System.out.println("Nome do cliente: " + cliente.nome);
* ***Composição***:
  * Baseado na ideia de todo e parte, mas aqui, não há sentido você ter a parte sem ter o todo
  * Por exemplo, não existe você ter um departamento sem ter uma empresa
  * Para isso podemos usar um ***Construtor***, que é criar uma instância dentro da classe, não na main
