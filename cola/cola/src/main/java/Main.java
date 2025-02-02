public class Main {
    public static void main(String[] args) {
        esta_invertida();
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
}