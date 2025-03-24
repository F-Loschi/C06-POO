public class Zumbi {
    double vida;
    String nome;

    double mostrarVida(){
        return vida;
    }
    void transfereVida(Zumbi zumbiAlvo, double quantia){
        zumbiAlvo.vida += quantia;
    }

}