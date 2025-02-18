public class Main {
    public static void main(String[] args) {
        implementacion a = new implementacion();
         a.crear();
         a.agregar(2);
         a.agregar(3);
         a.imprimir();
         a.eliminar(2);
         System.out.println(a.pertenece(2));
    }
}