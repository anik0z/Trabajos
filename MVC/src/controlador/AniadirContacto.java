package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaAniadir;

public class AniadirContacto implements ActionListener {

	private VentanaAniadir a;
	private Ventana v;
	
	public AniadirContacto(Ventana va){
		v=va;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		a=new VentanaAniadir();
		a.getB1().addActionListener(new EnviarContacto(a));
		a.setVis(true);
	}
	
	public VentanaAniadir getA() {
		return a;
	}
	
	public void setA(VentanaAniadir a) {
		this.a = a;
	}
	
	public void actualizaventana(){
		v.repaint();
	}

}
