import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int x = rand.nextInt(10);
        System.out.println("Chuta um número entre 1 e 10");
        int y = sc.nextInt();
        while(y!=x){
            if(y>x){
                System.out.println("O número é menor que esse");
            }
            else{
                System.out.println("O número é maior que esse");
            }
            y = sc.nextInt();
        }
        System.out.println("Parabéns, acertou!!");
        sc.close();
    }
}
