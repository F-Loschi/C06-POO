public class Zumbi {
    double vida;
    String nome;

    double mostrarVida(){
        return vida;
    }
    boolean transfereVida(Zumbi zumbiOriginal, Zumbi zumbiAlvo, double quantia){
        if(zumbiOriginal.vida < quantia){
            return false;
        }
        else{
            zumbiAlvo.vida += quantia;
            zumbiOriginal.vida -= quantia;
        }
        return true;
    }

}