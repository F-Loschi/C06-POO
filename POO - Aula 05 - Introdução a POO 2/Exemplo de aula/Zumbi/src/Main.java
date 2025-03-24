public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.careca = true;
        z1.dano=710;
        z1.vida=510;
        z1.vivo = true;
        z1.nome="Robesvaldo, o forte";

        z2.careca = false;
        z2.dano=210;
        z2.vivo=true;
        z2.vida=510;
        z2.nome="Cleiton, o fraco";

        z1.causarDano(z2,510);
    }
}