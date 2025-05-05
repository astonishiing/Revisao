package Ex04.domain;

public abstract class Animal {
    private String nome;
    private float comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(){

    }

    public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numeroPatas=" + numeroPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMedia=" + velocidadeMedia +
                '}';
    }

    //    public void imprime(){
//        System.out.println("A Cor do animal eh: " + this.cor);
//        System.out.println("O Nome do animal eh: " + this.nome);
//        System.out.println("O Comprimento do animal eh: " + this.comprimento);
//        System.out.println("O Numero de patas do animal eh: " + this.numeroPatas);
//        System.out.println("O ambiente em que o animal vive eh: " + this.ambiente);
//        System.out.println("A velocidade média do animal eh: " + this.velocidadeMedia);
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
