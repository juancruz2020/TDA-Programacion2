public class implementacion implements interfaz {

    class elemento {
        int clave;
        int valor;
    }

    elemento[] elementos;
    int cant;

    public void crear() {
        elementos = new elemento[100];
        cant = 0;
    }

    public void agregar(int clave, int valor) {
        if (existe(clave) != -1) {
            elementos[existe(clave)].valor = valor;
        } else {
            elementos[cant] = new elemento();
            elementos[cant].clave = clave;
            elementos[cant].valor = valor;
            cant++;
        }

    }

    public void eliminar(int clave) {
        int index = existe(clave);
        if (index != -1) {
            elementos[index].clave = elementos[cant - 1].clave;
            elementos[index].valor = elementos[cant - 1].valor;
            cant--;
        }
    }


    public void eliminarValor(int valor) {
        if (existevalor(valor) != -1) {
            elementos[existevalor(valor)].clave = elementos[cant - 1].clave;
            elementos[existevalor(valor)].valor = elementos[cant - 1].valor;
            cant --;
        }
    }

    public implementacionCONJ recuperar() {
        implementacionCONJ a = new implementacionCONJ();
        a.crear();
        int i = 0;

        for (; i < cant; i++) {
            a.agregar(elementos[i].clave);
        }

        return a;

    }

    public int existe(int clave1) {
        int i = 0;

        for (; i < cant; i++) {
            if (elementos[i].clave == clave1) {
                return i;
            }
        }
        return -1;
    }

    public int existevalor(int valor) {
        int i = 0;

        for (; i < cant; i++) {
            if (elementos[i].valor == valor) {
                return i;
            }
        }
        return -1;
    }

    public void imprimir() {
        System.out.println("claves");
        int i = 0;
        for (; i < cant; i++) {
            System.out.print(elementos[i].clave + " ");
        }
        System.out.println("");
        System.out.println("valores");
        i = 0;
        for (; i < cant; i++) {
            System.out.print(elementos[i].valor + " ");
        }
    }
}
