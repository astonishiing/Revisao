package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.dominio.Hora;

public class HoraTeste {
    public static void main(String[] args) {
        Hora hora1 = new Hora(10, 30, 15);
        Hora hora2 = new Hora(12, 20, 10);

        System.out.println("Hora 1: " + hora1.getHora() + ":" + hora1.getMinutos() + ":" + hora1.getSegundos());
        System.out.println("Hora 2: " + hora2.getHora() + ":" + hora2.getMinutos() + ":" + hora2.getSegundos());

        if (hora1.anterior(hora2)) {
            System.out.println("Hora 1 é anterior à Hora 2.");
        } else {
            System.out.println("Hora 1 não é anterior à Hora 2.");
        }

        if (hora1.posterior(hora2)) {
            System.out.println("Hora 1 é posterior à Hora 2.");
        } else {
            System.out.println("Hora 1 não é posterior à Hora 2.");
        }

        if (hora1.equals(hora2)) {
            System.out.println("Hora 1 e Hora 2 são iguais.");
        } else {
            System.out.println("Hora 1 e Hora 2 são diferentes.");
        }

        hora1.atualizar(12, 20, 10);
        System.out.println("Hora 1 atualizada: " + hora1.getHora() + ":" + hora1.getMinutos() + ":" + hora1.getSegundos());

        if (hora1.equals(hora2)) {
            System.out.println("Agora Hora 1 e Hora 2 são iguais!");
        } else {
            System.out.println("Hora 1 e Hora 2 ainda são diferentes.");
        }
    }
}
