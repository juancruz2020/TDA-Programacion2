public class implementacion implements interfaz {

    class nodo{
        int valor;
        int clave;
        nodo sig;
    }

    nodo diccionario;

    public void crear (){
        diccionario = null;
    }
    public void agregar (int clave, int numero){
        nodo n = existe(clave);
        if(n == null){
            nodo aux = new nodo();
            aux.clave = clave;
            aux.valor = numero;
            aux.sig = diccionario;
            diccionario = aux;
        }
        else {
            n.valor = numero;
        }

    }
    public void eliminar (int clave){
        if(diccionario == null){
            return;
        }
        if (diccionario.clave == clave){
            diccionario = diccionario.sig;
        }
        if(diccionario != null) {
            nodo aux = diccionario;

            while(aux.sig.clave != clave){
                aux = aux.sig;
            }
            aux.sig = aux.sig.sig;
        }
    }

    public int recuperar_valor (int clave){
        nodo n = existe(clave);
        if(n == null){
            return -1;
        }
        else {
            return n.valor;
        }
    }
    public implementacionCONJ claves (){
        nodo aux = diccionario;

        implementacionCONJ n = new implementacionCONJ();
        n.crear();

        while (aux != null){
            n.agregar(aux.clave);
            aux = aux.sig;
        }
        return n;
    }

    public nodo existe (int clave){
        nodo aux = new nodo();
        aux = diccionario;
        while (aux != null && aux.valor != clave){
            aux = aux.sig;
        }
        return aux;
    }
}
