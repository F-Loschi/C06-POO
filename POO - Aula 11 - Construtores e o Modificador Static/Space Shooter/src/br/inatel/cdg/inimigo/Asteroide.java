package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }
    public void destruir(){
        System.out.println("É o fim dos bons.");
    }
    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
    public String getNome() {
        return nome;
    }
}
