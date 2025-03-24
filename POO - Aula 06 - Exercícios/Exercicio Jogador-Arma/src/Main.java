public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma("Anaklumus", 150, 50);
        Arma arma2 = new Arma("BackBitter", 180, 60);
        Jogador jogador1 = new Jogador("Jorge", arma1, 320, 150);
        Jogador jogador2 = new Jogador("Henrique", arma2, 350, 150);

        jogador1.mostrarDetalhes();
        jogador2.mostrarDetalhes();

        while (jogador1.vida > 0 && jogador2.vida > 0) {
            if (jogador1.vida>0){
                jogador1.atacar(jogador2);
            }
            if (jogador2.vida>0){
                jogador2.atacar(jogador1);
            }
        }

        System.out.println("Fim da batalha!");
    }
}
