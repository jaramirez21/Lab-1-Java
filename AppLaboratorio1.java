import javax.swing.JOptionPane;

import src.Node;

public class AppLaboratorio1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ListaDoble Titulaciones= new ListaDoble();
	int Option=0;
	String elemento = null;
	int Posicion=0;
	do {
		try {
			Option=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige una opción(1,2...):\n"+
			"1. Agregar un nodo al inicio\n"+"2. Agregar un nodo al final\n"+"3 Mostrar la lista de inicio a fin\n"+
			"4 Mostrar la lista de fin a inicio\n"+"5 Imprimir la lista\n"+"6 Tamaño de la lista\n"
			+"7 Imprime elemento posición seleccionada\n"+"8 Valida un elemento de la lista\n"+"9 Extrae un elemento de una posición\n"+
			"10 Extrae un elemento indicado (Denominación grado)\n"
			+"11 Salir\n","Menú de opciones",JOptionPane.INFORMATION_MESSAGE));
			
			
			switch (Option){
			
				case 1:
					elemento=JOptionPane.showInputDialog(null,"Ingresa el elemento del nodo","Agregando nodo al final",JOptionPane.INFORMATION_MESSAGE);
					Titulaciones.AgregarAlFinal(elemento);
					break;
				case 2:
					elemento=JOptionPane.showInputDialog(null,"Ingresa el elemento del nodo","Agregando nodo al inicio",JOptionPane.INFORMATION_MESSAGE);
					Titulaciones.AgregarAlInicio(elemento);
					break;
				case 3:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.MostrarListaInicioFin();
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;
				case 4:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.MostrarListaFinInicio();
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;
				case 5:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.ImprimirLista();
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;
				case 6:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.TamañoLista();
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;	
				case 7:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.ImprimirElemento();
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;	
				case 8:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.ValidaGrado();
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;	
				case 9:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.ExtraePosicion(Posicion);
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;	
				case 10:
					if (!Titulaciones.EstVacia()) {
						Titulaciones.ExtraeGrado(elemento);
					}else {
						JOptionPane.showMessageDialog(null,"No hay nodos en la lista","Lista vacía",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;		
				case 11:
					JOptionPane.showMessageDialog(null,"Aplicación finalizada","FIN",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"La opción no está en el menú","Incorrecto",JOptionPane.INFORMATION_MESSAGE);
			}	
		}catch (NumberFormatException n) {
			JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
		}
	} while (Option!=11); 
		
	}
}
