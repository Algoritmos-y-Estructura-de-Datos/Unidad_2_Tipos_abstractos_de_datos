
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Colas;

import java.util.PriorityQueue;

public class ColaDePrioridades {
    public static void main(String[] args) {
        // Crear una cola de prioridades (mínima)
        PriorityQueue<Integer> colaPrioridades = new PriorityQueue<>();

        // Encolar elementos con prioridades
        colaPrioridades.add(5);  // Prioridad 3
        colaPrioridades.add(1);  // Prioridad 1
        colaPrioridades.add(7);  // Prioridad 2
        colaPrioridades.add(3);  // Prioridad 2

        System.out.println("Desencolando: " + colaPrioridades);

    }
}


