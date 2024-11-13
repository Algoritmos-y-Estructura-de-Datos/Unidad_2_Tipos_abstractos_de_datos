
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Pilas;

import java.util.Deque;
import java.util.LinkedList;

public class PilaConDeque {
    public static void main(String[] args) {
        Deque<Integer> pila = new LinkedList<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Pila actual: " + pila);

        int elementoDesapilado = pila.pop();
        System.out.println("Elemento desapilado: " + elementoDesapilado);

        // Imprimir la pila después de desapilar
        System.out.println("Pila después de desapilar: " + pila);

        // Obtener la cima de la pila
        int cima = pila.peek();
        System.out.println("Cima de la pila: " + cima);

        // Verificar si la pila está vacía
        boolean estaVacia = pila.isEmpty();
        System.out.println("¿La pila está vacía? " + estaVacia);
    }
}


