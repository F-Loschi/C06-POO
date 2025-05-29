# Leitura e Escrita de Arquivos
- Primeiro de tudo, para lermos ou escrevermos em um arquivo, precisamos ter um arquivo, caso contrário, uma exceção será lançada pelo Java.
- Ao criarmos um arquivo texto, usamos a ***inteface Path*** que conecta nosso código ao arquivo de texto. Esse caminho pode ser feito passando o nome do arquivo, ***desde que o arquivo esteja na raiz do projeto***, ou passando o caminho para onde o arquivo está localizado.
- Abaixo estamos buscando o arquivo "configuracao.txt" que está na raiz do arquivo:
``` java
Path arquivo = Path.get("configuracao.txt");
```
- Depois de lido o arquivo, o que iremos fazer depende da nossa criatividade. Podemos colocar todas as linhas do arquivo dentro de uma lista com a função "readAllLines();"
- Podemos também escrever no arquivo com a função "Files.writeString()" que possui dois parâmetros, sendo o primeiro o caminho do arquivo e o segundo o que deseja ser escrito
