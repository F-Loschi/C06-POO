import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lanche1 = sc.nextInt();
        int lanche2 = sc.nextInt();
        int lanche3 = sc.nextInt();

        sc.close();

        int total = lanche1 + lanche2 + lanche3;

        float media = (float)total / 3;
        System.out.printf("%.2f", media);
    }
}