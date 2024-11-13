
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package listas_enlazadas;

import java.util.ArrayList;
import java.util.List;

public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
                System.out.println("valor de temp: "+temp.dato);
            }
            temp.siguiente = nuevoNodo;
        }
    }
    
    
 ////////////Buscar    
    
    public boolean buscar(int valor) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == valor) {
                return true; // Se encontró el valor en la lista
            }
            temp = temp.siguiente;
        }
        return false; // El valor no está en la lista
    }
    
//////////// Buscar varios
    
    public List<Integer> buscar_varios_elementos(int valor) {
        List<Integer> posiciones = new ArrayList<>();
        Nodo temp = cabeza;
        int indice = 0;

        while (temp != null) {
            if (temp.dato == valor) {
                posiciones.add(indice);
            }
            temp = temp.siguiente;
            indice++;
        }

        return posiciones;
    } 
    

    public void mostrarLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarAlFinal(40);
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);

        System.out.println("Lista Enlazada:");
        lista.mostrarLista();
    }
}

