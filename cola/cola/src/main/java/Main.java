public class Main {
    public static void main(String[] args) {
        repetidos();
    }


    //a
    public static void pasar_a_otra(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        a.crear();
        a.acolar(1);
        a.acolar(2);
        a.acolar(3);

        a.imprimir();

        b.crear();
        while (!a.vacio()){
            b.acolar(a.primero());
            a.desacolar();
        }
        b.imprimir();
    }

    //b, c
    public static void invertir_contenido(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        int cont = 0;

        a.crear();
        a.acolar(1);
        a.acolar(2);
        a.acolar(3);

        b.crear();

        while (!a.vacio()){
            int desacolado = a.primero();
            a.desacolar();
            b.acolar(desacolado);
            cont++;
        }

        int cont2 = 0;
        int lista[] = new int[cont];

        while (!b.vacio()){
            int desacolado = b.primero();
            b.desacolar();
            lista[cont2] = desacolado;
            cont2++;
        }

        while (cont2 != 0){
            a.acolar(lista[cont2-1]);
            cont2 = cont2-1;
        }

        a.imprimir();
    }

    //d
    public static void coinciden_ultimo(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        a.crear();
        a.acolar(1);
        a.acolar(2);
        a.acolar(3);

        b.crear();
        b.acolar(2);
        b.acolar(3);
        b.acolar(4);

        int valor=-1; int valor2=-2;

        while (!a.vacio()){
            int primero = a.primero();
            a.desacolar();
            if (a.vacio()==true){
                valor = primero;
            }
        }

        while (!b.vacio()){
            int primero = b.primero();
            b.desacolar();
            if (b.vacio()==true){
                valor2 = primero;
            }
        }

        if (valor == valor2){
            System.out.print("los valores son iguales");
        }
        else{
            System.out.print("los valores son diferentes");
        }
    }

    //e
    public static void capicua(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        a.crear();
        a.acolar(1);
        a.acolar(2);
        a.acolar(2);
        a.acolar(1);

        b.crear();

        int largo = 0;
        boolean capicua = true;

        while (!a.vacio()){
            int primero = a.primero();
            a.desacolar();
            b.acolar(primero);
            largo++;
        }

        int lista[] = new int[largo];
        int cont = 0;

        while (!b.vacio()){
            int primero = b.primero();
            b.desacolar();
            lista[cont] = primero;
            cont++;
        }

        int i=0;

        while (i != cont){
            if (lista[i] == lista[largo-1]){
            }
            else {
                capicua = false;
            }
            i++;
            largo = largo - 1;
        }
        if (capicua){
            System.out.println("capicua");
        }
        else {
            System.out.println("no capicua");
        }
    }

    //e
    public static void esta_invertida(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();

        int cont = 0;

        a.crear();
        a.acolar(1);
        a.acolar(2);
        a.acolar(3);

        b.crear();

        c.crear();
        c.acolar(3);
        c.acolar(2);
        c.acolar(1);

        while (!a.vacio()){
            int desacolado = a.primero();
            a.desacolar();
            b.acolar(desacolado);
            cont++;
        }

        int cont2 = 0;
        int lista[] = new int[cont];

        while (!b.vacio()){
            int desacolado = b.primero();
            b.desacolar();
            lista[cont2] = desacolado;
            cont2++;
        }

        while (cont2 != 0){
            a.acolar(lista[cont2-1]);
            cont2 = cont2-1;
        }

        boolean iguales = true;
        while (!a.vacio() && !c.vacio()){
            if (a.primero() != c.primero()){
                iguales = false;
            }
            a.desacolar();
            c.desacolar();
        }
        if (iguales){
            System.out.println("iguales");
        }
        else {
            System.out.println("diferentes");
        }
    }

    //tp 2

    //2.1

    //costo

    public static void diferesntes(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();

        c.crear();
        b.crear();
        a.crear();
        a.acolar(1);
        a.acolar(3);
        a.acolar(2);
        a.acolar(3);

        boolean flag = true;

        while (flag) {
            int inicio = a.primero();
            c.acolar(a.primero());
            a.desacolar();
            while (!a.vacio()){
                if (inicio == a.primero()){
                    a.desacolar();
                }
                else{
                    b.acolar(a.primero());
                    a.desacolar();
                }
            }
            flag = false;
            while (!b.vacio()){
                a.acolar(b.primero());
                b.desacolar();
                flag = true;
            }
        }
        c.imprimir();
    }

    //2.2

    //costo

    public static void mitades(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();

        c.crear();
        b.crear();
        a.crear();

        a.acolar(1);
        a.acolar(3);
        a.acolar(2);
        a.acolar(3);

        int largo = 0;

        while (!a.vacio()){
            b.acolar(a.primero());
            a.desacolar();
            largo ++;
        }

        int mitad = largo/2;

        while (largo != mitad){
            a.acolar(b.primero());
            b.desacolar();
            c.acolar(b.primero());
            b.desacolar();
            largo--;
        }

        a.imprimir();
        System.out.println(" ");
        c.imprimir();
    }

    //2.3

    //costo

    public static void repetidos(){
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();
        implementacion d = new implementacion();

        d.crear();
        c.crear();
        b.crear();
        a.crear();
        a.acolar(1);
        a.acolar(3);
        a.acolar(2);
        a.acolar(3);

        boolean flag = true;

        while (flag) {
            int inicio = a.primero();
            c.acolar(a.primero());
            a.desacolar();
            while (!a.vacio()){
                if (inicio == a.primero()){
                    d.acolar(a.primero());
                    a.desacolar();

                }
                else{
                    b.acolar(a.primero());
                    a.desacolar();
                }
            }
            flag = false;
            while (!b.vacio()){
                a.acolar(b.primero());
                b.desacolar();
                flag = true;
            }
        }
        d.imprimir();
    }

}