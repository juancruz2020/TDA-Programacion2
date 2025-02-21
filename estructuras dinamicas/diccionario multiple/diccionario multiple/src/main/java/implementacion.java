public class implementacion implements interfaz{

    class nodo{
        int clave;
        nodo_valor sig_valor;
        nodo sig;

    }

    class nodo_valor{
        int valor;
        nodo_valor sig;
    }

    nodo diccionario;

    public void crear (){
        diccionario = null;
    }


    public void agregar (int clave, int numero) {
        nodo n = existe(clave);

        if (n == null){
            n = new nodo();
            n.clave = clave;
            n.sig = diccionario;
            diccionario = n;
        }

        nodo_valor aux = n.sig_valor;

        while (aux!= null && aux.valor != numero){
            aux = aux.sig;
        }

        if (aux != null){
            return;
        }

        else{
            nodo_valor a = new nodo_valor();
            a.valor = numero;
            a.sig = aux;
            aux = a;
        }
    }




    public void eliminar(int clave, int valor) {

        nodo aux = diccionario;

        while (aux != null && aux.clave != clave){
            aux = aux.sig;
        }

        if (aux == null){
            return;
        }
        else{
            nodo_valor anterior = null;
            nodo_valor n = aux.sig_valor;

            while (n != null && n.valor != valor){
                anterior = n;
                n = n.sig;
            }

            if (n == null){
                return;
            }

            else {
                anterior.sig = anterior.sig.sig;
            }
        }

    }




    public nodo_valor recuperar_valor (int clave) {

        nodo aux = diccionario;

        while (aux != null && aux.clave != clave){
            aux = aux.sig;
        }

        if (aux == null){
            return null;
        }
        return aux.sig_valor;
    }


    public implementacionCONJ claves (){
        implementacionCONJ a = new implementacionCONJ();

        nodo aux = diccionario;

        while (aux != null){
            a.agregar(aux.clave);
            aux = aux.sig;
        }

        return a;
    }


    public nodo existe (int clave){
        nodo aux = diccionario;
        while (aux != null && aux.clave != clave){
            aux = aux.sig;
        }
        return aux;
        }
    }
