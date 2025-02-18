public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        p1.nome = "Mario, o do Armário";
        p1.vilao = false;
        p2.nome = "Bowser, o sequestrador";
        p2.vilao = true;

        k1.nome = "El Fuego";
        k1.piloto = p1;
        k1.motor.cilindradas = "Rapidasso";
        k1.motor.velocidadeMaxima = 350;
        k2.nome = "El Rayo";
        k2.piloto = p2;
        k2.motor.cilindradas = "Rapidão";
        k2.motor.velocidadeMaxima = 310;

        p2.soltaSuperPoder();
        k1.pular();
        p1.soltaSuperPoder();
        k2.fazerDrift();
        System.out.println(p1.nome+" diz 'Agora eu se consagro'");
        k1.soltarTurbo();
        System.out.println("Meu carrão " +k1.nome+" de "+k1.motor.cilindradas +" é pica demais mané" );
        System.out.println("Mario wins! Flawless victory.");
    }
}