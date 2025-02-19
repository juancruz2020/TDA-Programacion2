public class impleementacion implements interfaz{

    class nodo{
        int info;
        nodo sig;
    }

    nodo primero;
    nodo ultimo;

    public void crear(){
        primero = null;
        ultimo = null;

    }
    public void acolar(int x){
        nodo aux = new nodo;
        aux.info = x;
        aux.sig = null;

        if (ultimo != null){
            ultimo.sig = aux;
        }
        ultimo = aux;

        if (ultimo == null){
            primero = ultimo;
        }

    }
    public void desacolar(){
        primero = primero.sig;

        if (primero == null){
            ultimo = null;
        }

    }
    public int tope(){
        return primero.info;
    }
    public boolean vacio(){
        return primero == null;
    }
}
