public class Main {
    public static void main(String[] args) {
        Zumbi z = new Zumbi();

        z.vida = 221.12;
        System.out.println(z.mostrarVida());
        z.transfereVida(z,230);
        System.out.println(z.mostrarVida());
    }
}