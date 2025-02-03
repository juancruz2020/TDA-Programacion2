package org.example;

public class implementacion implements interfaz {

    int numeros[];
    int prioridades[];
    int indice;

    public void crear() {
        numeros = new int[100];
        prioridades = new int[100];
        indice = 0;
    }

    public void acolar(int numero, int prioridad){
       numeros[indice] = numero;
       prioridades[indice] = prioridad;
       indice++;

       for (int i = indice ; i > 0 ; i--) {
           if (prioridades[i] > prioridades[i-1]) {
               int aux = prioridades[i-1];
               int aux1 = numeros[i-1];
               prioridades[i-1] = prioridades[i];
               numeros[i-1] = numeros[i];
               numeros[i] = aux1;
               prioridades[i] = aux;
           }
       }
    }
    public void desacolar() {
        for (int i = 0 ; i < indice -1 ; i++) {
            prioridades[i] = prioridades[i+1];
            numeros[i] = numeros[i+1];
        }
        indice --;
    }
    public boolean vacio(){
        if (indice == 0){
            return true;
        }
        return false;
    }
    public int primero(){
        return numeros[0];
    }
    public int prioridad(){
        return prioridades[0];
    }

    public void imprimir(){
        for (int i = 0 ; i < indice  ; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println( " ");
        for (int i = 0 ; i < indice  ; i++){
            System.out.print(prioridades[i] + " ");
        }
    }
}

