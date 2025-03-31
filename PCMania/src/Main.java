import computador.Computador;
import computador.HardwareBasico;
import computador.MemoriaUSB;
import computador.SistemaOperacional;

import java.util.Scanner;

/*
POR FAVOR, LEIA



Nome: Felipe Silva Loschi
Mátricula: 601
Curso: GES


Vou padronizar o espaço do HD como em GB
Vou usar thread.sleep para dar uma imersão



 */
public class Main {
    public static void main(String[] args) {
        boolean terminou = false;//Variável para rodar o menu
        Scanner sc = new Scanner(System.in);
        String n;//Você é o nome da pessoa
        long m;//Você é o CPF

        //Setando os sistemas operacionais
        SistemaOperacional SO1 = new SistemaOperacional();
        SO1.nome = "Linux Ubuntu";
        SO1.tipo = 32;
        SistemaOperacional SO2 = new SistemaOperacional();
        SO2.nome = "Windows 8";
        SO2.tipo = 64;
        SistemaOperacional SO3 = new SistemaOperacional();
        SO3.nome = "Windows 10";
        SO3.tipo = 64;

        //Setando os hardwares do 1° computador
        HardwareBasico []H1 = new HardwareBasico[3];
        for (int i = 0; i < H1.length; i++) {
            H1[i] = new HardwareBasico();
        }
        H1[0].nome = "Pentium Core i3";
        H1[0].capacidade =2200;
        H1[0].tipo = 1;
        H1[1].nome = "Memoria Ram";
        H1[1].capacidade = 8;
        H1[1].tipo = 2;
        H1[2].nome = "HD";
        H1[2].capacidade = 500;
        H1[2].tipo = 3;

        //Setando os hardwares do 2° computador
        HardwareBasico [] H2 = new HardwareBasico[3];
        for (int i = 0; i < H2.length; i++) {
            H2[i] = new HardwareBasico();
        }
        H2[0].nome="Pentium Core i5";
        H2[0].capacidade=3370;
        H2[0].tipo = 1;
        H2[1].nome="Memoria Ram";
        H2[1].capacidade=16;
        H2[1].tipo = 2;
        H2[2].nome="HD";
        H2[2].capacidade = 1000;
        H2[2].tipo = 3;

        //Setando os hardwares do 3° computador
        HardwareBasico []H3 = new HardwareBasico[3];
        for (int i = 0; i < H3.length; i++) {
            H3[i] = new HardwareBasico();
        }
        H3[0].nome = "Pentium Core i7";
        H3[0].capacidade = 4500;
        H3[0].tipo = 1;
        H3[1].nome = "Memoria Ram";
        H3[1].capacidade = 32;
        H3[1].tipo = 2;
        H3[2].nome = "HD";
        H3[2].capacidade = 2000;
        H3[2].tipo = 3;


        Cliente cliente = new Cliente();
        
        //Setando as memórias
        MemoriaUSB M1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB M2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB M3 = new MemoriaUSB("HD Externo", 1000);
        
        //Adicionando os computadores
        Computador PC1 = new Computador(H1,SO1);
        PC1.memoriaUSB = M1;
        PC1.marca = "Apple";
        PC1.preco = 601;
        Computador PC2 = new Computador(H2,SO2);
        PC2.memoriaUSB = M2;
        PC2.marca = "Samsung";
        PC2.preco = 1835;
        Computador PC3 = new Computador(H3,SO3);
        PC3.memoriaUSB = M3;
        PC3.marca = "Dell";
        PC3.preco = 6279;

        //Mostrando o menu inicial
        System.out.println("=====================================");
        System.out.println("      BEM-VINDO À PC MANIA!         ");
        System.out.println("=====================================");
        //Entrando as infos do cliente
        System.out.println("Digite seu nome: ");
        n = sc.nextLine();
        System.out.println("Digite seu cpf: ");
        m = sc.nextLong();

        while(!terminou) {
            int op;//Para o switch
            int oppc;//Para eu saber qual opção da promoção ele escolheu
            //Esses souts ficam fora, pois vão aparecer toda vez que uma opção terminar
            System.out.println("Escolha uma das promoções abaixo");
            System.out.println("1 - Mostrar promoções");
            System.out.println("2 - Coloque uma opção no seu carrinho");
            System.out.println("3 - Mostrar seu carrinho");
            System.out.println("0 - Finalizar compra");
            System.out.println("=====================================");
            //Escolhendo a opção
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Promoção 1: ");
                    PC1.mostraInfo();
                    //Vou dar essa pausa de 5 segundos entre as opções para a pessoa poder ler
                    try {
                        Thread.sleep(5000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Promoção 2: ");
                    PC2.mostraInfo();
                    try {
                        Thread.sleep(5000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Promoção 3: ");
                    PC3.mostraInfo();
                    try {
                        Thread.sleep(5000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Digite o número do item que deseja comprar: ");
                    oppc = sc.nextInt();/*O oppc vai me falar qual opção a pessoa quer 
                    para eu saber o que colocar no carrinho e adicionar no total dela,
                    tanto em valor quanto em quantidade
                    */
                    if (oppc == 1) {
                        cliente.total += 601;
                        cliente.op1+=1;
                    }
                    else if(oppc == 2) {
                        cliente.total += 1835;
                        cliente.op2+=1;
                    }
                    else if(oppc == 3) {
                        cliente.total += 6279;
                        cliente.op3+=1;
                    }
                    else{
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Somando sua compra: ");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Você colocou no seu carrinho os seguintes itens: ");
                    System.out.println(cliente.op1+"x Computador(es) da Promoção 1");
                    System.out.println(cliente.op2+"x Computador(es) da Promoção 2");
                    System.out.println(cliente.op3+"x Computador(es) da Promoção 3");
                    System.out.println("Totalizando: ");
                    System.out.println("clic clic clic(barulho da calculadora)");
                    try {
                        Thread.sleep(3500); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("R$"+cliente.total+",00");
                    break;
                case 0:
                    System.out.println("Fechando sua compra: ");
                    System.out.println("clic clic clic(barulho do teclado)");
                    try {
                        Thread.sleep(3500); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ficou um total de R$"+cliente.total+",00. O pagamento será feito de que forma?");
                    System.out.println("O pagamento está sendo feito, por favor espere");
                    try {
                        Thread.sleep(800); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("===============================================");
                    try {
                        Thread.sleep(1600); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("             Tela de loading                   ");
                    try {
                        Thread.sleep(2200); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println();
                    try {
                        Thread.sleep(2200); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("O primeiro bug de computador foi um inseto de verdade! ");
                    System.out.println("Em 1947, engenheiros encontraram uma mariposa presa dentro do computador Harvard Mark II, causando uma falha");
                    System.out.println("Eles registraram o incidente como bug no diário de manutenção, popularizando o termo para erros de software.");
                    try {
                        Thread.sleep(6000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("===============================================");
                    System.out.println("Compra confirmada!");
                    System.out.println("Agradecemos por escolher a PCMania, volte sempre!");
                    terminou = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                }
        }



    }
}