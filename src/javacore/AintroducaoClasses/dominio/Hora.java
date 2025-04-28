package javacore.AintroducaoClasses.dominio;

import java.io.Console;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {

    }

    public Hora(int hora, int minutos, int segundos) {
        if (!validarHora(hora, minutos, segundos)) {
            Console console = System.console();
            if (console != null) {
                console.printf("Hora invalida \n");
            } else {
                System.out.println("Hora invalida");
            }
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    private boolean validarHora(int hora, int minutos, int segundos) {
        return (hora >= 0 && hora <= 60) &&
                (minutos >= 0 && minutos <= 60) &&
                (segundos >= 0 && segundos <= 60);
    }

    public boolean equals(Hora h){
        return this.hora == h.hora &&
                this.minutos == h.minutos &&
                this.segundos == h.segundos;
    }

    public boolean anterior(Hora h){
        if(this.hora < h.hora){
            return true;
        }else if (this.hora == h.hora && this.minutos < h.minutos){
            return true;
        } else if(this.hora == h.hora && this.minutos == h.minutos && this.segundos < h.segundos){
            return true;
        }
        return false;
    }

    public boolean posterior(Hora h){
        if(this.hora > h.hora){
            return true;
        } else if(this.hora == h.hora && this.minutos > h.minutos){
            return true;
        } else if (this.hora == h.hora && this.minutos == h.minutos && this.segundos > h.segundos) {
            return true;
        }
        return false;
    }

    public void atualizar(int hora, int minuto, int segundo) {
        if (!validarHora(hora, minuto, segundo)) {
            Console console = System.console();
            if (console != null) {
                console.printf("Erro: Hora inválida.\n");
            } else {
                System.out.println("Erro: Hora inválida.");
            }
        } else {
            this.hora = hora;
            this.minutos = minuto;
            this.segundos = segundo;
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 60) {
            this.hora = hora;
        } else {
            Console console = System.console();
            if (console != null) {
                console.printf("Hora invalida \n");
            } else {
                System.out.println("Hora invalida");
            }
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 60) {
            this.segundos = segundos;
        } else {
            Console console = System.console();
            if (console != null) {
                console.printf("Segundos invalidos \n");
            } else {
                System.out.println("Segundos invalidos");
            }
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 60) {
            this.minutos = minutos;
        } else {
            Console console = System.console();
            if (console != null) {
                console.printf("Minutos invalidos \n ");
            } else {
                System.out.println("Minutos invalidos \n");
            }
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHora() {
        return hora;
    }

    public int getSegundos() {
        return segundos;
    }
}
