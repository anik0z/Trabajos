package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.VentanaAniadir;


public class EnviarContacto implements ActionListener{

	private VentanaAniadir v;
	private Modelo m;
	
	public EnviarContacto (VentanaAniadir va){
		v=va;
		this.m=Modelo.getInstance();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object[] row={v.getNombre().getText(),v.getApe().getText(),v.getEmail().getText(),v.getTel().getText()};
		 
		m.aniadeFila(row);
		
		v.getNombre().setText("");
		v.getApe().setText("");
		v.getEmail().setText("");
		v.getTel().setText("");
		v.setVis(false);
	}
	
}
