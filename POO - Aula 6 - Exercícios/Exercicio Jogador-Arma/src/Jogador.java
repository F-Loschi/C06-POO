public class Jogador {
    String nome;
    Arma arma;
    int energia;
    int vida;

    void atacar(Jogador alvo){
        if(energia>=arma.custoDeEnergia){
            alvo.vida-=arma.dano;
            if(alvo.vida<=0){
                System.out.println(alvo.nome+" morreu");
            }
            energia-=arma.custoDeEnergia;
        }
    }
    void mostrarDetalhes(){
        System.out.println("Meu nome é "+nome);
        System.out.println("Minha arma é a "+arma.nome);
        System.out.println("Tu tá fodido na minha mão, mané!");
    }
    public Jogador(String nome, Arma arma, int vida, int energia){
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }

}
