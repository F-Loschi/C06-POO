import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número de alunos(as): ");
        int n = sc.nextInt();

        switch (n){
            case 10:
                System.out.println("Sala I-16");
            break;
            /*Como o caso 10 e o 20 retornam o mesmo, eu poderia simplesmente apagar td que tem no caso 10
            e deixar só o "case 10:", aí ele entraria no case 20 se for o case 10 e não mudaria nada com
            o case 20 e escreveria menos coisa. Não é o melhor jeito de fazer isso, mas é um jeito.
             */
            case 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-22");
            break;
        }
        sc.close();
    }
}