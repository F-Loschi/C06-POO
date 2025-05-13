# Exceções e Controle de Erros
- O Java oferece um mecanismo próprio para tratamento de situações excepcionais, chamadas de ***exceções*** por fugiram da regra comum do Java.
- O Java roda o código por pilhas, executando conforme os métodos são chamados, empilhando e desempilhando conforme o processo é feito.
- Se temos um NullPointerException lançado dentro de uma chamada de método, o Java nos mostra o caminho que foi feito até chegar no lançamento dessa exceção, chamando isso de ***stacktrace***(rastro da pilha).
	- Ele é formado pois, uma vez que que o erro é lançado dentro de uma chamada, o Java vai desempilhando as chamadas procurando por alguém que trate esse erro, formando, assim, um rastro.
- Para tratar essas exceções que são lançadas pelo Java, usamos o bloco try-catch que tenta fazer algo já explicitado(try) e está preparado para pegar o erro quando ele for lançado(catch), impedindo que o código seja abortado.
- ***Preste atenção em onde você está colocando o tratamento de exceção, pois isso pode impedir que o código continue conforme você quer, uma vez que ele continua sempre após o bloco de tratamento.***
- Existem exceções ***unchecked***, que são exceções consideradas tão bestas que não são checadas, uma vez que é admitido que elas nunca irão acontecer.
