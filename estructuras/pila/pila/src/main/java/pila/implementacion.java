package pila;

public class implementacion implements interfaz {


	int pila[];
	int indice;
	
    public void crear(){
    	pila = new int[100];
    	indice = 0;
    }

    
    public void apilar(int numero) {
    	pila[indice] = numero;
    	indice ++;
    }


    public void desapilar(){

    	for (int i = 1; i < indice; i++) {
    		pila[i-1] = pila[i];
    	}
    	indice --;
    	
    }
    
    public boolean vacia(){
    	return (indice == 0);

    }
    
    public int tope(){
    	return pila[0];
    }

    public void imprimir (){
        for (int i = 0; i < indice; i++) {
            System.out.println(pila[i]);
        }
        System.out.println("");
    }
}
