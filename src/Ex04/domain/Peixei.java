package Ex04.domain;

public class Peixei extends Animal {
    private String caracteristicas;

    public Peixei(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristicas){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristicas = caracteristicas;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Caracteristicas do peixe" + this.caracteristicas);
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
