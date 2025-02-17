package pila;

public class Main {
    public static void main(String[] args) {
        repetidos();
    }


    //a
    public static void pila_a_otra_inverso() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
        }
        b.imprimir();
    }


    //b
    public static void pila_a_otra_igual() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
        }
        b.imprimir();


        c.crear();
        while (!b.vacia()) {
            c.apilar(b.tope());
            b.desapilar();
        }
        c.imprimir();
    }

    //c
    public static void invertir_contenido() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
        }
        b.imprimir();

        c.crear();
        while (!b.vacia()) {
            c.apilar(b.tope());
            b.desapilar();
        }
        c.imprimir();


        while (!c.vacia()) {
            a.apilar(c.tope());
            c.desapilar();
        }
        a.imprimir();

    }

    //d
    public static void contar_contenido() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        int cont = 0;

        a.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(3);
        a.imprimir();

        b.crear();
        while (!a.vacia()) {
            b.apilar(a.tope());
            cont++;
            a.desapilar();
        }

        while (!b.vacia()) {
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
            cont++;
            a.desapilar();
        }

        while (!b.vacia()) {
            a.apilar(b.tope());
            b.desapilar();
        }
        a.imprimir();

        System.out.println(suma / cont);
    }


    //tp 2
    //1.1

    //costo:

    public static void capicua() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        a.crear();
        b.crear();

        a.apilar(1);
        a.apilar(2);
        a.apilar(2);

        boolean flag = true;
        int inicio;
        int fin = 0;

        while (flag && !a.vacia()) {
            inicio = a.tope();
            a.desapilar();
            if (!a.vacia()) {
                while (!a.vacia()) {
                    fin = a.tope();
                    b.apilar(a.tope());
                    a.desapilar();
                }
                b.desapilar();
                if (inicio != fin) {
                    flag = false;
                }
                while (!b.vacia()) {
                    a.apilar(b.tope());
                    b.desapilar();
                }
            }
        }
        if (flag) {
            System.out.println("capicua");
        } else {
            System.out.println("no capicua");
        }
    }

    //1.2

    //costo

    public static void repetidas() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();

        c.crear();
        b.crear();
        a.crear();

        a.apilar(1);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);
        a.apilar(3);
        a.apilar(2);

        boolean flag = true;

        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
        }

        while (flag) {
            int tope = b.tope();
            b.desapilar();
            c.apilar(tope);
            while (!b.vacia()) {
                if (tope == b.tope()) {
                    b.desapilar();
                } else {
                    a.apilar(b.tope());
                    b.desapilar();
                }
            }
            while (!a.vacia()) {
                b.apilar(a.tope());
                a.desapilar();
            }
            if (b.vacia()) {
                flag = false;

                while (!c.vacia()) {
                    a.apilar(c.tope());
                    c.desapilar();
                }
            }
        }
        a.imprimir();
    }

    //1.3

    //costo

    public static void repartir() {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        a.crear();
        b.crear();
        a.apilar(1);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);
        a.apilar(3);
        a.apilar(2);

        int largo = 0;

        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
            largo++;
        }

        int dividido = largo / 2;

        while (largo != dividido) {
            a.apilar(b.tope());
            b.desapilar();
            dividido++;
        }
        a.imprimir();

        System.out.println(" ");
        System.out.println(" ");

        b.imprimir();
    }

    //1.4

    //costo

    public static void repetidos()

    {
        implementacion a = new implementacion();
        implementacion b = new implementacion();
        implementacion c = new implementacion();
        implementacion d = new implementacion();
        a.crear();
        b.crear();
        c.crear();
        d.crear();

        a.apilar(1);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);

        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
        }


        boolean flag = true;

        while (!a.vacia()) {
            b.apilar(a.tope());
            a.desapilar();
        }

        while (flag) {
            int tope = b.tope();
            b.desapilar();
            c.apilar(tope);
            while (!b.vacia()) {
                if (tope == b.tope()) {
                    d.apilar(b.tope());
                    b.desapilar();

                } else {
                    a.apilar(b.tope());
                    b.desapilar();
                }
            }
            while (!a.vacia()) {
                b.apilar(a.tope());
                a.desapilar();
            }
            if (b.vacia()) {
                flag = false;

                while (!c.vacia()) {
                    a.apilar(c.tope());
                    c.desapilar();
                }
            }
        }
        d.imprimir();
    }

    }
