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



}
