# Interface

## O que é uma Interface?
- Uma **interface** é como um **contrato** que define um conjunto de métodos que uma classe **deve obrigatoriamente implementar**.
- Funciona como um **manual de instruções** para outras classes.
- Todas as classes que **implementam uma interface devem fornecer uma implementação para todos os métodos** definidos.

---

## Diferença entre Interface e Classe Abstrata

| Característica               |  Interface                              |  Classe Abstrata                       |
|-----------------------------|-------------------------------------------|------------------------------------------|
| Métodos                     | Apenas assinaturas (até Java 7)           | Pode ter métodos implementados e abstratos |
| Atributos                   | Constantes (`public static final`)        | Pode ter atributos normais               |
| Modificadores de acesso     | Todos os métodos são públicos             | Pode ter vários modificadores (`private`, `protected`, etc.) |
| Herança múltipla            | Sim, pode implementar várias            | Não, só pode estender uma             |
| Uso                         | Contrato de métodos                       | Base com lógica compartilhada            |

>  *Dica:* pense na classe abstrata como uma **interface bombada**, com mais recursos e responsabilidades.

---

##  Por que usar Interfaces?
- Porque **não é possível herdar mais de uma classe**, mas **é possível implementar várias interfaces**!
