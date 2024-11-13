

// Implentado por: Vinicio Changoluisa
// Diciembre 2023



package Arboles;


public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoArbol insertarRec(NodoArbol raiz, int valor) {
        if (raiz == null) {
            raiz = new NodoArbol(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    // Método para realizar un recorrido inorden (izquierda, raíz, derecha)
    public void inorden() {
        inordenRec(raiz);
    }

    private void inordenRec(NodoArbol raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertar elementos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Realizar un recorrido inorden
        System.out.println("Recorrido Inorden del Árbol:");
        arbol.inorden();
    }
}
