
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Pilas;


public class Pila {
    private NodoPila cima;

    public Pila() {
        this.cima = null;
    }

    public void apilar(int dato) {
        NodoPila nuevoNodo = new NodoPila(dato);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
    }

    public int desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }

        int datoDesapilado = cima.dato;
        cima = cima.siguiente;
        return datoDesapilado;
    }

    public int cima() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }

        return cima.dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void imprimirPila() {
        NodoPila temp = cima;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        System.out.println("Pila actual:");
        pila.imprimirPila();

        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Pila actual:");
        pila.imprimirPila();
        System.out.println("Cima de la pila después de desapilar: " + pila.cima());
    }
}
