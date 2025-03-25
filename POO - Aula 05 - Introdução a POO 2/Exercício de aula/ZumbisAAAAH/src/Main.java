public class Main {
    public static void main(String[] args) {
        //Criando dois zumbis
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        //Transferindo vida do 1 pra ele msm, ou seja, aumentando a vida dele
        z1.vida = 221.12;
        System.out.println(z1.mostrarVida());
        z1.transfereVida(z1,230);
        System.out.println(z1.mostrarVida());

        //Fazendo o mesmo com o 2
        z2.vida = 321.123;
        System.out.println(z2.mostrarVida());
        z2.transfereVida(z2,230);
        System.out.println(z2.mostrarVida());

        //Fazendo os dois apontarem para o msm endereço de memória
        z1=z2;

        //Agora mostrando que a vida dos dois é a mesma e se eu mexer em um, eu mexo no outro
        System.out.println(z1.mostrarVida());
        System.out.println(z2.mostrarVida());
        z1.transfereVida(z1,230);
        System.out.println(z1.mostrarVida());
        System.out.println(z2.mostrarVida());
    }
}