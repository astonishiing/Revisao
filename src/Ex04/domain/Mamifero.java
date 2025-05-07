package Ex04.domain;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Os alimentados do mamifero são: " + this.alimento);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
