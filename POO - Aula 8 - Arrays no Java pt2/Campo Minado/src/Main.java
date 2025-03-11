import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 0;
        int x = rand.nextInt(2);//Gera um aleatório entre 0 e 1
        int y = rand.nextInt(2);//Gera um aleatório entre 0 e 1

        Campos campos = new Campos();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                campos.campo[i][j] = new Campos();
            }
        }

        campos.campo[x][y].bomba = true;

        do{
            System.out.println("Digite o valor de x: ");
            int p = sc.nextInt();
            while(p!=0 && p!=1) {
                System.out.println("Valor invalido");
                p = sc.nextInt();
            }
            System.out.println("Digite o valor de y: ");
            int q = sc.nextInt();
            while(q!=0 && q!=1) {
                System.out.println("Valor invalido");
                q = sc.nextInt();
            }
            if(campos.campo[p][q].bomba){
                System.out.println("Explosão tchacabum, com a dança do verão");
                System.out.println("Perdeu!");
                break;
            }
            else{
                System.out.println("Se salvou, vamo de novo");
                campos.campo[p][q].visitado = true;
            }
            tentativas++;
        }while(!campos.campo[x][y].visitado && tentativas<3);
        if(tentativas==3){
            System.out.println("Tu ganhou");
        }
        sc.close();
    }
}