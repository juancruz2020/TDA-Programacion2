import java.util.Random;

public class implementacion implements interfaz {

    int conjunto[];
    int cant;

    public void crear() {
        conjunto = new int[100];
        cant = 0;
    }

    public void agregar(int numero) {
        conjunto[cant] = numero;
        cant++;
    }

    public void eliminar(int numero) {
        for (int i = 0; i < cant; i++) {
            if (conjunto[i] == numero) {
                conjunto[i] = conjunto[cant - 1];
                cant--;
            }
        }
    }

    public int elegir() {
        Random r = new Random();
        return conjunto[r.nextInt(cant)];
    }

    public boolean pertenece (int numero){
        for (int i = 0; i < cant; i++) {
            if (conjunto[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean vacio () {
        if (cant == 0) {
            return true;
        }
        return false;
    }

    public void imprimir(){
        for (int i = 0; i < cant; i++) {
            System.out.print(conjunto[i] + " ");
        }
    }

}
