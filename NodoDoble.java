import src.Node;

public class NodoDoble {

	public String Grado;
	NodoDoble siguiente, anterior;
	// Constructor nodo - cuando aun no hay ningún nodo creado. Es un nodo doble cuyos punteros
	// siguiente y anterior apuntan a null.
	public NodoDoble(String g){
		this(g,null,null);
	}
	// Constructor nodo - cuando ya hay elementos creados.
	public NodoDoble(String g, NodoDoble s,NodoDoble a) {
		Grado=g;
		siguiente=s;
		anterior=a;
	}
	//Este método obtiene el grado
	public String ObtenGrado(){
        return Grado;
    }
	//este método obtiene el siguiente elemento de la lista.
	public NodoDoble getNextElement(){
        return siguiente;
    }
	//este método establece el siguiente elemento en la lista.
	public void setNextElement(NodoDoble siguiente){
        this.siguiente = siguiente;
    }
	//este método obtiene el elemento anterior de la lista.
    public NodoDoble getPreElement(){
        return anterior;
    }
  //este método establece el elemento anterior de la lista.
    public void setPreElement(NodoDoble anterior){
        this.anterior = anterior;
    }
    public String MostrarLista() {
        return Grado;
    }
}
