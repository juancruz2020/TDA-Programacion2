public class implementacion {

    int a[];
    int indice;

    public void crear(){
        a = new int[100];
        indice = 0;
    }
    public void acolar(int numero){
        a[indice] = numero;
        indice ++;
    }
    public void desacolar(){
        for (int i = 0; i < indice - 1; i ++){
            a[i] = a[i+1];
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
        return a[0];
    }
    public void imprimir(){
        for (int i = 0; i < indice; i++){
            System.out.println(a[i]);
        }
        System.out.println("");
    }

}
