package pila;

public class implementacion implements interfaz {

    int a[];
    int indice;

    public void crear(){
        a = new int[100];
        indice = 0;
    }
    public void apilar(int numero) {
        for (int i = indice -1; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = numero;
        indice ++;
    }

    public void desapilar(){
        if (!vacia()) {
           for (int i = 1; i <= indice; i++) {
               a[i - 1] = a[i];
           }
           indice --;
        }
        else{
            System.out.println("la lista esta vacia");
        }
    }
    public boolean vacia(){
        if (indice == 0) {
            return true;
        }
        return false;
    }
    public int tope(){
        return a[0];
    }

    public void imprimir (){
        for (int i = 0; i < indice; i++) {
            System.out.println(a[i]);
        }
        System.out.println("");
    }
}
