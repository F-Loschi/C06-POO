public class Conta {
    //Atributos
    int saldo, limite;
    float numeroConta;
    String titular;

    //Métodos
    public void sacar(int quantia) {
        saldo -= quantia;
    }
    public void depositar(int quantia) {
        limite += quantia;
    }

}