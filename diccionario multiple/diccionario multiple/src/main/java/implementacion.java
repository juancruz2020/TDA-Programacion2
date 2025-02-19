public class implementacion implements interfaz{

    class Elemento{
        int clave;
        int valores[];
        int cantidad;
    }

    Elemento[] elemento;
    int indice;

    public void crear(){
        elemento = new Elemento[100];
        indice = 0;
    }
    public void agregar(int clave, int valor){
        int ubi = existe_clave(clave);
        if (ubi == -1){
            elemento[indice] = new Elemento();
            elemento[indice].clave = clave;
            elemento[indice].valores = new int[100];
            elemento[indice].cantidad = 0;
            elemento[indice].valores[elemento[indice].cantidad] = valor;
            elemento[indice].cantidad ++;
            indice ++;
        }
        else{
            elemento[ubi].valores[elemento[ubi].cantidad] = valor;
            elemento[ubi].cantidad ++;
        }


    }
    public void eliminar(int clave){
        int ubi = existe_clave(clave);
        if (ubi != -1){
            elemento[ubi] = elemento[indice-1];
            indice--;
        }
        else{
            System.out.println("la clave no existe");
        }

    }
    public void eliminar_valor(int clave, int valor){
        int ubi = existe_clave(clave);
        if (ubi != -1){
            for (int i = 0; i < elemento[ubi].cantidad; i++){
                if (elemento[ubi].valores[i] == valor){
                    elemento[ubi].valores[i] = elemento[ubi].valores[elemento[ubi].cantidad];
                    elemento[ubi].cantidad --;
                }
            }
        }
        else{
            System.out.println("la clave no existe");
        }

    }
    public implementacionCONJ recuperar_valores(int clave){
        implementacionCONJ a = new implementacionCONJ();
        a.crear();
        int ubi = existe_clave(clave);
        if (ubi != -1){
            for (int i = 0; i < elemento[ubi].cantidad; i++){
                a.agregar(elemento[ubi].valores[i]);
            }
        }
        return a;

    }
    public implementacionCONJ recuperar_claves(){
        implementacionCONJ a = new implementacionCONJ();
        a.crear();
        for (int i = 0; i < indice; i++){
            a.agregar(elemento[i].clave);
        }
        return a;
    }

    public int existe_clave(int clave){
        for (int i = 0; i < indice; i++){
            if (elemento[i].clave == clave){
                return i;
            }
        }
        return -1;
    }

}
