# Threads
- Usamos threads para poder executar duas ou mais coisas ao mesmo tempo.
- Para criarmos uma thread primeiro criamos uma instância da classe que queremos que seja rodada em paralelo. Após isso, criamos uma instância da classe Thread e passamos como referência a instância que criamos previamente.
- Para rodar, basta usarmos o método ".start()" na instância da thread.
- Outro meio de fazermos isso é implementarmos a interface Runnable na classe e sobrescrever o método "run()".
- Podemos também herdar da classe Thread, que já implementa a interface Runnable, e sobrescrever o método "run()" novamente.
- A diferença em herdar em implementar está no que nos será passado, uma vez que ao herdarmos, herdaremos tanto todos os métodos quanto os atributos e ao implementar, podemos apenas sobrescrever os métodos.
  - ***Como não fazemos uso do polimorfismo aqui, não nos é tão interessante herdar, então é sempre preferível implementar a herdar.***
- ***As ordens sempre serão aleatórias, independente de quem é dado o ".run()" primeiro, o que significa que não podemos afirmar nem quem começa nem quem termina primeiro.***
