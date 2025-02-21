public class Main {
    public static void main(String[] args) {
        implementacion a = new implementacion();

        a.crear();

        a.agregar(4, 2);

        a.agregar(3, 2);
        a.agregar(1, 2);
        a.agregar(2, 2);
        a.agregar(1, 3);


        a.eliminar(1,3);

        a.claves().imprimir();

        //System.out.println (a.recuperar_valor(4).sig.valor);


    }
}