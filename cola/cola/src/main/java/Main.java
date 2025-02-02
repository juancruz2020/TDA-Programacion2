public class Main {
    public static void main(String[] args) {
        pasar_a_otra();
    }

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
}