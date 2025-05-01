package Ex03.test;

import Ex03.domain.Autor;
import Ex03.domain.Livro;

public class AutorLivroTest {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Messias", "test02", 3);
        Autor autor2 = new Autor("Araujo", "test", 1);
        Autor autor3 = new Autor("Julio", "Zoas", 4);
        Autor autor4 = new Autor("Luan", "Jonas", 2);
        Autor autor5 = new Autor("test", "dafaq", 5);

        Livro livro1 = new Livro("Machado de assis");
        Livro livro2 = new Livro("Iluminismo");
        Livro livro3 = new Livro("Absolutismo");
        Livro livro4 = new Livro("Hempirico");
        Livro livro5 = new Livro("Socialismo");

        Autor[] autores = {autor1, autor2, autor3, autor4, autor5};
        Livro[] livros = {livro1, livro2, livro3, livro4, livro5};
        autor1.setObjLivro(livros);
        for(Autor autor : autores){
            System.out.println("----- Nomes dos autores -------");
            autor.imprime();
        }



    }
}
