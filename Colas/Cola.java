
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Colas;

public class Cola {
    private NodoCola frente;
    private NodoCola fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public void encolar(int dato) {
        NodoCola nuevoNodo = new NodoCola(dato);
        if (estaVacia()){
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        int datoDesencolado = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return datoDesencolado;
    }

    public int frente() {
        if (estaVacia()) 
            throw new IllegalStateException("La cola está vacía");

        return frente.dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void imprimirCola() {
        NodoCola temp = frente;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println("Cola actual:");
        cola.imprimirCola();
        
        System.out.println("Desencolando: " + cola.desencolar());
        System.out.println("Frente de la cola después de desencolar: " + cola.frente());
        System.out.println("Cola después de desencolar: ");
        cola.imprimirCola();
    }
}

