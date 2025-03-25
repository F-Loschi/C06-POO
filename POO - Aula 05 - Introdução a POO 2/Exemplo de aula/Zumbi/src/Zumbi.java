public class Zumbi {
    String nome;
    boolean careca;
    int vida;
    int dano;
    boolean vivo;

    void seAlimentar() {
        System.out.println("Zumbi "+ nome + " está fazendo nhumi nhumi......");
    }
    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Dano: " + dano);
        System.out.println("Vida: " + vida);
        System.out.println("É careca? " + careca);
        System.out.println("Vivo? " + vivo);
    }
    void causarDano(Zumbi zumbi1, int danos){
        System.out.println("Dano: " + danos);
        zumbi1.vida -= danos;
        System.out.println("Vida: " + zumbi1.vida);
        if(zumbi1.vida<=0){
            System.out.println("O zumbi " + zumbi1.nome + " morreu!");
            zumbi1.vivo = false;
        }
    }
}
