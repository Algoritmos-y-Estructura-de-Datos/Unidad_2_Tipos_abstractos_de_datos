
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package ListaEnteros;

public class Lista {
	private NodoLista primero;
	public Lista(){
			 primero = null;
	}
	
	private int leerEntero(){
		return 10;
	}
	
	public Lista crearLista(){
	int x;
	primero = null;
	do {
			 x = leerEntero();
			 if (x != -1)
			 {
				 primero = new NodoLista(x,primero);
			 }
	}while (x != -1);
	return this;
	}
}
