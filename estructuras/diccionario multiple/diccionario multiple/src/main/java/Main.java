public class Main {
    public static void main(String[] args) {
        implementacion a = new implementacion();

        a.crear();
        a.agregar(2, 3);
        a.agregar(2,4);
        a.agregar(3,4);

        a.eliminar(2);

        implementacionCONJ conj = a.recuperar_claves();
        conj.imprimir();

        implementacionCONJ conj2 = a.recuperar_valores(2);
        conj2.imprimir();



    }
}