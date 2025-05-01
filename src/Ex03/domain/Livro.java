package Ex03.domain;

public class Livro {
    private String nomeLivro;
    private Autor[] autores;

    public Livro(){

    }
    public Livro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }

    public void imprimeLivrosAutores(){
        System.out.println(this.nomeLivro);
        if(autores != null){
            for (Autor autor : autores) {
                System.out.println(autor.getNomeCompleto());
            }
        }
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
}
