public class implementacionCONJ implements interfazCONJ {

    class nodo{
        int info;
        nodo sig;
    }

    nodo conjunto;

    public void crear(){
        conjunto = null;
    }

    public void agregar(int numero) {
        if (!pertenece(numero)){
            nodo aux = new nodo();
            aux.info = numero;
            aux.sig = conjunto;

            conjunto = aux;
        }

    }
    public int elegir(){
        return (conjunto.info);
    }
    public void sacar(int numero){
        nodo aux = conjunto;

        if (aux.info == numero){
            conjunto = aux.sig;
        }
        else {
            while (aux.sig != null && aux.sig.info != numero){
                aux = aux.sig;
            }
            if (aux.sig.info == numero){
                aux.sig = aux.sig.sig;
            }
        }

    }
    public boolean pertenece(int numero){
        if (conjunto == null){
            return false;
        }
        else {
            nodo n = conjunto;
            while (n.sig != null && n.info != numero){
                n = n.sig;
                }
            if (n.info == numero){
                return true;
            }
            return false;
            }

        }

    public void imprimir(){
        nodo aux = conjunto;
        while (aux != null) {
            System.out.println(aux.info);
            aux = aux.sig;
        }
    }
}

