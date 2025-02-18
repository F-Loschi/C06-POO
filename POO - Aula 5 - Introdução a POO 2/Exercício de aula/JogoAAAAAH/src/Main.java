public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma();
        arma1.resistencia = 310;
        arma1.descricao = "Espada usada por Percy Jackson";
        arma1.nome = "Anaklusmos";
        arma1.poder = 50;

        Arma arma2 = new Arma();
        arma2.resistencia = 720;
        arma2.descricao = "Espada usada por Luke Castellan";
        arma2.nome = "Backbiter";
        arma2.poder = 45;


        Personagem personagem1 = new Personagem();
        personagem1.nome = "Percy Jackson";
        personagem1.arma = arma1;
        personagem1.vida = 100;

        Personagem personagem2 = new Personagem();
        personagem2.nome = "Luke Castellan";
        personagem2.arma = arma2;
        personagem2.vida = 90;
    }
}