public class implementacion implements interfaz{

    class nodo{
        int valor;
        implementacion izq;
        implementacion der;
    }

    nodo arbol;

    public void crear(){
        arbol = null;
    }
    public int raiz(){
        return arbol.valor;
    }
    public implementacion hijoIZQ(){
        return arbol.izq;
    }
    public implementacion hijoDER(){
        return arbol.der;
    }
    public boolean vacio(){
        return arbol == null;
    }


    public void agregar(int numero){
        if (arbol == null){
            arbol = new nodo();
            arbol.valor = numero;
            arbol.izq = new implementacion();
            arbol.izq.crear();
            arbol.der = new implementacion();
            arbol.der.crear();
        }
        else if(arbol.valor > numero){
            arbol.izq.agregar(numero);
        }
        else {
            arbol.der.agregar(numero);
        }

    }


    public void eliminar(int numero) {

        if (arbol != null) {
            if (arbol.valor == numero) {
                arbol = null;
            } else {
                if (!arbol.izq.vacio()) {
                    arbol.valor = mayor(arbol.izq);
                    arbol.izq.eliminar(arbol.valor);
                } else {
                    arbol.valor = menor(arbol.der);
                    arbol.der.eliminar(arbol.valor);
                }
            }
        } else {
            if (arbol.valor < numero) {
                arbol.der.eliminar(numero);
            } else {
                arbol.izq.eliminar(numero);
            }
        }
    }


    public int mayor(interfaz a){
        if (a.hijoDER().vacio()){
            return a.raiz();
        }
        return mayor(a.hijoDER());
    }
    public int menor (interfaz a){
        if (a.hijoIZQ().vacio()){
            return a.raiz();
        }
        else{
            return menor(a.hijoIZQ());
        }
    }
}
