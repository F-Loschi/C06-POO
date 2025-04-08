# Polimorfismo

- **Poli** = muitos  
- **Morfo** = formas  
Ou seja, muitas formas de se fazer algo.

## Override

- Chamado de **sobrescrita**, é quando queremos especializar um método que já existe na superclasse.
- Usa-se `@Override` acima do método sobrescrito.
- Podemos ainda salvar variáveis de uma subclasse em uma superclasse.  
  Ao fazer isso, precisamos ter atenção a alguns comportamentos:
  - Se um método estiver sobrescrito, o que será chamado será o sobrescrito.
  - Se um método **não** estiver sobrescrito, será chamado o da superclasse.
  - Se tentarmos chamar um método **específico** de uma subclasse, **ele não será acessível** diretamente pela referência da superclasse.

### Como chamamos o método da subclasse então?

Usamos o operador `instanceof`. Com ele, testamos se a instância é de um determinado tipo. Se for, usamos um **casting** para acessar os métodos específicos.

### Exemplo em Java:

```java
public static void main(String[] args) {
    Brownie bn = new BrownieNutella("BrownieNutella", 100, "Nutella");
    Brownie bc = new BrownieCafe("BrownieCafe", 75, "CafeEspecial");

    bn.addCarrinhoDeCompras();
    bc.addCarrinhoDeCompras();

    if (bc instanceof BrownieCafe) {
        BrownieCafe browniecafe = (BrownieCafe) bc;
        browniecafe.adicionaMaisCafe();
    }  
}
```
## Por que usamos Polimorfismo?
Para criar estruturas que lidam com abstrações (ou superclasses), tornando o código mais flexível, reutilizável e extensível. Dessa forma, podemos tratar diferentes tipos de objetos de maneira uniforme, explorando o comportamento especializado apenas quando necessário.
