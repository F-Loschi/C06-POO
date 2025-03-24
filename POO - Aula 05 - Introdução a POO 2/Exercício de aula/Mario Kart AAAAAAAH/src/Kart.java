public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    void pular(){
        System.out.println("Aperte seus cintos, pois "+piloto.nome+", está pulando!");
    }
    void soltarTurbo(){
        System.out.println("Ow dá frente, cuidado que o "+nome+" tá chegando com o turbo!");
    }
    void fazerDrift(){
        System.out.println("I wonder if you know, how they live in Tokyo, if you seen it, then you mean it then you know you have to go. Fast and Furious! Drift, drift, drift!");
    }
    public Kart(){
        motor = new Motor();
    }
}
