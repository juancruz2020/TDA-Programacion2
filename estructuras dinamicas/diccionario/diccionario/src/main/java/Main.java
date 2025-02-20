public class Main {
    public static void main(String[] args) {
        implementacion a =new implementacion();

        a.crear();
        a.agregar(1, 3);
        a.agregar(2, 3);
        a.agregar(1, 3);
        a.eliminar(1);

        a.claves().imprimir();

    }
}