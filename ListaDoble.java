import javax.swing.JOptionPane;

import src.Node;

public class ListaDoble {
	int size = 0; // variable para establecer el tamaño de la lista
    int posicion = 0; // variable para establecer la posición del elemento
    int n; // variable para el iterador
	// Creamos dos punteros de tipo NodoDoble.
	private NodoDoble inicio,fin;
	// Creamos el constructor por defecto, clase ListaDoble, con el puntero inicio apuntando a null y
	// el puntero fin apuntando a null.
	public ListaDoble () {
		inicio=null;
		fin=null;
	}
	// Método para saber si la lista está vacía. Si inicio es igual a null entonces retorna true.
	public boolean EstVacia () {
		return inicio==null;
	}
	// Método para agregar nodos al final. Si la lista no está vacía, el nuevo nodo (fin) apunta a 
	// inicio que es el anterior y a null que es el siguiente, de acuerdo a la estructura del NodoDoble.
	// entonces fin de anterior de siguiente apunta a fin (fin.anterior.siguiente=fin).
	// Si la lista está vacía entonces inicio=fin=al nuevo nodo g. 
	public void AgregarAlFinal (String g) {
		if (!EstVacia()) {
			fin=new NodoDoble(g,null,fin);
			fin.anterior.siguiente=fin;
		}else {
			inicio=fin=new NodoDoble(g);
		}
	}
	// Método para agregar nodos al principio. Si la lista no está vacía el nuevo nodo (inicio) apunta a 
	// inicio que es siguiente y a null que es el anterior, de acuerdo a la estructura del NodoDoble.
	// entonces inicio de siguiente de anterior apunta a inicio (inicio.siguiente.anterior=inicio).
	// Si la lista está vacía entonces inicio=fin=al nuevo nodo g. 
	public void AgregarAlInicio (String g) {
		if (!EstVacia()) {
			inicio=new NodoDoble(g,inicio,null);
			inicio.siguiente.anterior=inicio;
		}else {
			inicio=fin=new NodoDoble(g);
		}
	}	
	//Método para mostrar la lista de inicio a fin.
	public void MostrarListaInicioFin() {
		if (!EstVacia()) {
			String Datos="<=>";
			NodoDoble auxiliar = inicio;
			while (auxiliar!=null) {
				Datos=Datos+"["+auxiliar.Grado+"]<=>";
				auxiliar=auxiliar.siguiente;
			}
			JOptionPane.showMessageDialog(null,Datos,"Mostrando lista de inicio a fin",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	//Método para mostrar la lista de fin a inicio.
	public void MostrarListaFinInicio() {
		if (!EstVacia()) {
			String Datos="<=>";
			NodoDoble auxiliar = fin;
			while (auxiliar!=null) {
				Datos=Datos+"["+auxiliar.Grado+"]<=>";
				auxiliar=auxiliar.anterior;
			}
			JOptionPane.showMessageDialog(null,Datos,"Mostrando lista de fin a inicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	//Método para iterar la lista e imprimir 
	public void ImprimirLista(){
        for (NodoDoble i = inicio; i != null; i = i.getNextElement()) {
            System.out.printf("\n %s ", i.MostrarLista());
            size++;
        }
        System.out.println("\n");
    }
	// Imprimimos el tamaño de la lista
	public void TamañoLista(){
        System.out.printf("El tamaño de la lista es: %d \n",size);
    }
	//Método que imprime el nodo de una posición determinada
	public void ImprimirElemento(){
        String texto =JOptionPane.showInputDialog("Qué posición de la lista quieres imprimir?");
        int n = Integer.parseInt(texto);
        for (NodoDoble i = inicio; i != null; i = i.getNextElement()) {
            posicion++;
            if(posicion == n){
                System.out.printf("\n %s ", i.MostrarLista());
            }
        }
        System.out.println("\n");
    }
	// Método que valida un elemento de la lista
    public void ValidaGrado(){
        String texto =JOptionPane.showInputDialog("Qué elemento (grado universitario) quieres validar para saber si está en la lista?");
        for (NodoDoble i = inicio; i != null; i = i.getNextElement()) {
            String Grado = i.MostrarLista();
            if(Grado.equals(texto)){
                System.out.printf("Este elemento SI está en la lista \n");
            }
        }
        System.out.println();
    }
    // Método que extrae un elemento de una posición seleccionada
    public Object ExtraePosicion(int n) {
        Object out = null;
        NodoDoble iterator = inicio;

        for (int i = 1; i < n; i++) {
            if (iterator.getNextElement().getNextElement() == null)
                break;
                iterator = iterator.getNextElement();
            }
            out = iterator.getNextElement().ObtenGrado();
            iterator.setNextElement(iterator.getNextElement().getNextElement());
        return out;
    }
    // Método que extrae un elemento por el nombre indicado
    public Object ExtraeGrado(String Grado) {
        Object out = null;
        String GradoExtraer =JOptionPane.showInputDialog("Qué elemento (grado universitario) quieres extraer de la lista?");
        for (NodoDoble i = inicio; i != null; i = i.getNextElement()) {
            String Grado = i.MostrarLista();
            if(Grado.equals(GradoExtraer)){
                NodoDoble n = i.getPreElement();
                n.setNextElement(n.getNextElement().getNextElement());
            }
        }
        return out;
    }
}
