package br.ufpb.dcx.ex7;

public class Tambor implements EmissorDeSom {
    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }
    public Tambor(){
        this("", "");
    }
    @Override
    public String emitirSom(){
        return "TUM TUM TUM";
    }
}
