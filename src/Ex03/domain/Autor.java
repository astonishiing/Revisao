package Ex03.domain;

public class Autor {
    private String nomeCompleto;
    private String biografiaAutor;
    private int anoNascimento;
    private Livro objLivro;

    public Autor(){

    }
    public Autor(String nomeCompleto, String biografiaAutor, int anoNascimento){
        this.nomeCompleto = nomeCompleto;
        this.biografiaAutor = biografiaAutor;
        this.anoNascimento = anoNascimento;
    }

    public void imprime(){
        System.out.println(this.nomeCompleto);
        System.out.println(this.biografiaAutor);
        System.out.println(this.anoNascimento);

        if(objLivro != null){
            System.out.println(this.objLivro.getNomeLivro());
        }

    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public String getBiografiaAutor() {
        return biografiaAutor;
    }

    public void setBiografiaAutor(String biografiaAutor) {
        this.biografiaAutor = biografiaAutor;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }
}
