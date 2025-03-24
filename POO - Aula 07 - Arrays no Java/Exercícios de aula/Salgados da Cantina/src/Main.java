public class Main {
    public static void main(String[] args) {
        Cantina C =  new Cantina();
        C.nome = "Cantina do Inatel";

        Salgado []S = new Salgado[3];

        S[0] = new Salgado();
        S[1] = new Salgado();
        S[2] = new Salgado();

        S[0].nome = "Salsicha";
        S[1].nome = "Telebacon";
        S[2].nome = "3Queijos";

        for (int i = 0; i < 3; i++) {
            C.addSalgado(S[i]);
        }

        C.mostraIfo();
    }
}