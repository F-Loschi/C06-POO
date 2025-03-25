public class Personagem {
    String nome;
    int vida;
    Arma arma;

    void usarArma() {
        System.out.println(nome + " está atacando com " + arma.nome + " e causando " + arma.poder + " de dano");
        arma.resistencia -= 2;
    }
    void tomarDano(){
        vida -= 5;
    }
}
