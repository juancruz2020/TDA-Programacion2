package org.example;

public class Main {
    public static void main(String[] args) {

        identicas();
    }


    //a
    public static void convinar(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        a.crear();
        a.acolar(12, 1);
        a.acolar(11, 4);
        a.acolar(10, 3);

        b.crear();
        b.acolar(12, 3);
        b.acolar(11, 2);
        b.acolar(10, 5);

        while(!b.vacio()){
            int primero = b.primero();
            int prioridad = b.prioridad();

            b.desacolar();

            a.acolar(primero, prioridad);
        }
        a.imprimir();
    }

    //b
    public static void identicas(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        a.crear();
        a.acolar(12, 1);
        a.acolar(11, 3);
        a.acolar(10, 3);

        b.crear();
        b.acolar(12, 1);
        b.acolar(11, 3);
        b.acolar(10, 3);

        boolean identicas = true;

        while (!b.vacio() && !a.vacio()){
            if (a.primero() == b.primero() && a.prioridad() == b.prioridad()){
                b.desacolar();
                a.desacolar();
            }
            else {
                identicas = false;
                b.desacolar();
                a.desacolar();
            }
        }

        if (identicas){
            System.out.println("la cola es identica");
        }
        else {
            System.out.println("la cola no es identica");
        }
    }
}