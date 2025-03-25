import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre sua nota 1: ");
        n1 = sc.nextInt();
        System.out.println("Entre sua nota 2: ");
        n2 = sc.nextInt();
        float nfa=0;
        float npa = (float)(n1 + n2) / 2;
        if(npa>=60){
            System.out.println("Aprovado com sucesso!");
        }
        else if(npa<60 && npa>=30){
            System.out.println("Entre sua nota 3: ");
            n3 = sc.nextInt();
            nfa = (npa+(float)n3)/2;
            if(nfa>=50){
                System.out.println("Aprovado com sucesso!");
            }
            else{
                System.out.println("Reprovado com sucesso!");
            }
        }
        else{
            System.out.println("Reprovado com sucesso!");
        }
        sc.close();
    }
}