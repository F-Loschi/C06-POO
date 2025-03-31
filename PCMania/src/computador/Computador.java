package computador;

public class Computador {
    public String marca;
    public float preco;
    public HardwareBasico []hardware;
    public SistemaOperacional SO;
    public MemoriaUSB memoriaUSB;

    public Computador(HardwareBasico[] h, SistemaOperacional SO) {
        this.hardware = new HardwareBasico[3];
        hardware = h;

        this.SO = new SistemaOperacional();
        this.SO = SO;
    }

    public void mostraInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Preco: "+preco);
        for(HardwareBasico h : hardware){
            if(h.tipo==1) {
                System.out.println(h.nome);
                System.out.println(h.capacidade + " Mhz");
            }
            else if(h.tipo==2) {
                System.out.println(h.nome);
                System.out.println(h.capacidade + " Gb de Memória RAM");
            }
            else if(h.tipo==3) {
                System.out.println(h.nome +" de "+ h.capacidade + "GB");
            }
        }
        System.out.println(SO.nome + "("+SO.tipo+" bits)");
        System.out.println("Acompanha "+memoriaUSB.nome+" de "+SO.tipo+"Gb");
    }
}
