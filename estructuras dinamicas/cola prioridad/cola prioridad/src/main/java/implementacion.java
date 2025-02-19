public class implementacion implements interfaz{

    class nodo{
        int info;
        int prioridad;
        nodo sig;
    }

    nodo nodoprioridad;

    public void crear(){
        nodoprioridad = null;

    }
    public void acolar(int prioridad, int numero){
        nodo aux = new nodo();
        aux.prioridad = prioridad;
        aux.info = numero;

        if (nodoprioridad == null || nodoprioridad.prioridad < aux.prioridad){
            nodoprioridad.sig = aux;
            nodoprioridad = aux;
        }
        else {
            nodo nuevo = new nodo();
            nuevo = nodoprioridad;

            while (nuevo != null && nuevo.prioridad < aux.prioridad){
                nuevo = nuevo.sig;
            }
            aux.sig = nuevo.sig;
            nuevo.sig = aux;
        }
    }
    public void desacolar(){
        nodoprioridad = nodoprioridad.sig;

    }
    public int primero(){
        return nodoprioridad.info;
    }
    public boolean vacio(){
        return nodoprioridad == null;
    }
    public int prioridad(){
        return nodoprioridad.prioridad;
    }

}
