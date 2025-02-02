package pila;

public class Main {
    public static void main(String[] args) {
        promedio_contenido();
    }


    //a
    public static void pila_a_otra_inverso(){
        implementacion a =new implementacion();
        implementacion b =new implementacion();

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()){
            b.apilar(a.tope());
            a.desapilar();
        }
        b.imprimir();
    }


    //b
    public static void pila_a_otra_igual(){
        implementacion a =new implementacion();
        implementacion b =new implementacion();
        implementacion c =new implementacion();

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()){
            b.apilar(a.tope());
            a.desapilar();
        }
        b.imprimir();


        c.crear();
        while (!b.vacia()){
            c.apilar(b.tope());
            b.desapilar();
        }
        c.imprimir();
    }

    //c
    public static void invertir_contenido(){
        implementacion a =new implementacion();
        implementacion b =new implementacion();
        implementacion c =new implementacion();

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()){
            b.apilar(a.tope());
            a.desapilar();
        }
        b.imprimir();

        c.crear();
        while (!b.vacia()){
            c.apilar(b.tope());
            b.desapilar();
        }
        c.imprimir();


        while (!c.vacia()){
            a.apilar(c.tope());
            c.desapilar();
        }
        a.imprimir();

    }

    //d
    public static void contar_contenido(){
        implementacion a =new implementacion();
        implementacion b =new implementacion();
        int cont = 0;

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()){
            b.apilar(a.tope());
            cont ++;
            a.desapilar();
        }

        while (!b.vacia()){
            a.apilar(b.tope());
            b.desapilar();
        }
        a.imprimir();

        System.out.println(cont);

    }

    //e
    public static void sumar_contenido() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        int suma = 0;

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()) {
            b.apilar(a.tope());
            suma = suma + a.tope();
            a.desapilar();
        }

        while (!b.vacia()) {
            a.apilar(b.tope());
            b.desapilar();
        }
        a.imprimir();

        System.out.println(suma);
    }

    //f
    public static void promedio_contenido() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        int suma = 0;
        int cont = 0;

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()) {
            b.apilar(a.tope());
            suma = suma + a.tope();
            cont ++;
            a.desapilar();
        }

        while (!b.vacia()) {
            a.apilar(b.tope());
            b.desapilar();
        }
        a.imprimir();

        System.out.println(suma/cont);
    }



}