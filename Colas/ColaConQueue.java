
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Colas;

import java.util.LinkedList;
import java.util.Queue;

public class ColaConQueue {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Encolar elementos
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);

        // Imprimir la cola
        System.out.println("Cola actual: " + cola);

        // Desencolar un elemento
        int elementoDesencolado = cola.poll();
        System.out.println("Elemento desencolado: " + elementoDesencolado);

        // Imprimir la cola después de desencolar
        System.out.println("Cola después de desencolar: " + cola);

        // Obtener el frente de la cola sin eliminarlo
        int frente = cola.peek();
        System.out.println("Frente de la cola: " + frente);

        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola está vacía? " + estaVacia);
    }
}

