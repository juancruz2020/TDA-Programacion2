public class implementacion implements interfaz {

    class nodo{
        int info;
        nodo siguiente;
    }

    nodo primero;

    public void crear(){
        primero = null;
    }
    public void apilar(int numero){
        nodo aux = new nodo();
        aux.info = numero;
        aux.siguiente = primero;
        primero = aux;
    }
    public void desapilar(){
        primero = primero.siguiente;
    }
    public boolean vacio(){
        if (primero == null){
            return true;
        }
        return false;
    }
    public int primero(){
        return primero.info;
    }
}
