package controlador;

import vista.Ventana;
import vista.VentanaAniadir;

public class Controller {

	private Ventana v;
	private VentanaAniadir va;
	
	public Controller(){
		v=new Ventana();
		v.setVisible(true);
		v.getBoton().addActionListener(new AniadirContacto(v));
	}

	public static void main(String[] args){
		Controller c=new Controller();
	}

}
