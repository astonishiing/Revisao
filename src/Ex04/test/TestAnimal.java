package Ex04.test;

import Ex04.domain.Mamifero;
import Ex04.domain.Peixei;

public class TestAnimal {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150f, 4, "Amarelo", "Terra", 2f, "Gramineas");
        Peixei tubarao = new Peixei("Tubarao", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas");
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180f, 4, "Vermelho", "Terra", 0.5f, "Mel");

        camelo.imprime();
        System.out.println("------------");
        tubarao.imprime();
        System.out.println("------------");
        ursocanada.imprime();
    }
}
