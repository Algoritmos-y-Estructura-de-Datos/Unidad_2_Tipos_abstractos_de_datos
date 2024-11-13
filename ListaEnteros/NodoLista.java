
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package ListaEnteros;
public class NodoLista{						
int dato;		
NodoLista enlace;
public NodoLista(int x){
		 dato = x;
		 enlace = null;
}

public NodoLista(int x, NodoLista n){
		 dato = x;
		 enlace = n;
}

public int getDato(){
		 return dato;
}

public NodoLista getEnlace(){
		 return enlace;
}

public void setEnlace(NodoLista enlace){
		 this.enlace = enlace;
}

}
