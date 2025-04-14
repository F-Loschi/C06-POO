# Classe Abstrata

* Usada quando não faz sentido ou não é necessário criar instâncias diretamente da classe, apenas de suas subclasses.
* Basicamente, é uma forma de declarar uma superclasse.
* Ao declarar uma classe como abstrata, o compilador do Java não permite criar instâncias dela, além de restringir algumas funcionalidades específicas.
* Ela é usada como referência para possibilitar o polimorfismo.
* Nem toda superclasse precisa ser abstrata. Em casos de herança em camadas, pode ser necessário instanciar a classe superior para compor a classe inferior, mesmo que essa inferior também atue como superclasse de outra.

## Métodos Abstratos

* Classes abstratas podem conter métodos abstratos, que são definidos apenas por sua assinatura na superclasse.
* Esses métodos não possuem implementação na superclasse, apenas a assinatura é declarada.
  * E como os usamos então?
  * Implementando-os (sobrescrevendo) nas subclasses.
  * Esse recurso força o uso do `@Override`, garantindo que os métodos sejam obrigatoriamente implementados nas subclasses.
* ***Nem todos os métodos de uma classe abstrata são abstratos, mas os métodos abstratos só são usados em classes abstratas.***
