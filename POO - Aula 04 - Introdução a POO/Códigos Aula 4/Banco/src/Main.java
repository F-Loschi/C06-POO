public class Main {
    public static void main(String[] args) {
        Conta C123 = new Conta();
        Conta C1234 = new Conta();
        Conta C12342 = new Conta();

        C123.saldo = 100;
        C1234.saldo = 5200;
        C12342.saldo = 8900;

        C123.titular = "Pedro";
        C12342.titular = "Maria";
        C1234.titular = "Joao";

        System.out.println("Saldo de " + C123.titular + " é " + C123.saldo);
        System.out.println("Saldo de " + C1234.titular + " é " + C1234.saldo);
        System.out.println("Saldo de " + C12342.titular + " é " + C12342.saldo);
    }
}
