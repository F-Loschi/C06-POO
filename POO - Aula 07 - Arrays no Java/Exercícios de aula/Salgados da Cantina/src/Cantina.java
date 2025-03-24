public class Cantina {
    String nome;
    Salgado []s = new Salgado[3];
    void addSalgado(Salgado novoSalgado) {
        for(int i=0;i<3;i++){
            if(s[i]==null){
                s[i]=novoSalgado;
                break;
            }
        }
    }
    void mostraIfo(){
        for(int i = 0; i < 3; i++){
            System.out.println(s[i].nome);

        }
    }
}
