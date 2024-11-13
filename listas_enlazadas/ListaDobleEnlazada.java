
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package listas_enlazadas;

public class ListaDobleEnlazada {
    private NodoDoble cabeza;

    public ListaDobleEnlazada() {
        this.cabeza = null;
    }

    public void agregarAlFinal(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoDoble temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp;
        }
    }

    public void imprimirDesdeElPrincipio() {
        NodoDoble temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public void imprimirDesdeElFinal() {
        NodoDoble temp = cabeza;
        while (temp != null && temp.siguiente != null) {
            temp = temp.siguiente;
        }
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.anterior;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();

        listaDoble.agregarAlFinal(1);
        listaDoble.agregarAlFinal(2);
        listaDoble.agregarAlFinal(3);

        System.out.println("Desde el principio:");
        listaDoble.imprimirDesdeElPrincipio();

        System.out.println("Desde el final:");
        listaDoble.imprimirDesdeElFinal();
    }
}
