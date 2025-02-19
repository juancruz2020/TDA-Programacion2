public class Main {
    public static void main(String[] args) {
        cardinalidad();
    }

    //3.1

    public static void diferencia_simetrica(){
        implementacion a = new implementacion();
        a.crear();
        a.agregar(2);
        a.agregar(3);
        a.agregar(4);

        implementacion b = new implementacion();
        b.crear();
        b.agregar(2);
        b.agregar(3);
        b.agregar(5);

        while (!b.vacio()){
            int x = b.elegir();
            a.agregar(x);
            b.eliminar(x);
        }
        a.imprimir();
    }

    //3.2

    public static void iguales(){
        implementacion a = new implementacion();
        a.crear();
        a.agregar(2);
        a.agregar(3);
        a.agregar(4);

        implementacion b = new implementacion();
        b.crear();
        b.agregar(2);
        b.agregar(3);
        b.agregar(5);

        implementacion c = new implementacion();
        c.crear();

        int cont1 = 0;

        while (!a.vacio()){
            int x = a.elegir();
            c.agregar(x);
            a.eliminar(x);
            cont1++;
        }

        int cont2 = 0;

        while (!b.vacio()){
            int x = b.elegir();
            a.agregar(x);
            b.eliminar(x);
            cont2 ++;
        }

        if (cont1 == cont2){
            while(!a.vacio()) {
                int x = a.elegir();
                c.agregar(x);
                a.eliminar(x);
            }
            int cont3 = 0;
            while (!c.vacio()) {
                int x = c.elegir();
                a.agregar(x);
                cont3 ++;
                c.eliminar(x);
            }
            if (cont3 == cont1 ){
                System.out.println("conjuntos iguales");
            }
            else{
                System.out.println("conjuntos diferentes");
            }
        }
    }

    public static void cardinalidad(){
        implementacion a = new implementacion();
        a.crear();
        a.agregar(2);
        a.agregar(3);
        a.agregar(4);

        implementacion b = new implementacion();
        b.crear();

        int cont = 0;

        while (!a.vacio()){
            int x = a.elegir();
            b.agregar(x);
            a.eliminar(x);
            cont ++;
        }
        System.out.println(cont);
    }

    //3.4 y 3.5 conbinados con pilas y colas

}