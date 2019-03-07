package vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.Modelo;


public class Ventana extends JFrame {
 
	private Modelo mod;
	private JTable tabla;
	private JButton boton;
	
	public Ventana(){
		//Tratamiento de la ventana
		this.setTitle("Agenda de contactos");
		this.setSize(700, 500);
		
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mod=Modelo.getInstance();
		//Tratamiento tabla:
		tabla=new JTable(mod.getModelo());
		JScrollPane panel=new JScrollPane(tabla);
		this.add(panel,BorderLayout.CENTER);
		
		//Tratamiento boton
		boton=new JButton("Añadir");
		this.add(boton, BorderLayout.PAGE_END);
		
		//boton.addActionListener(this);
	}
	
	public Modelo getMod() {
		return mod;
	}
	
	public void setMod(Modelo mod) {
		this.mod = mod;
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public JButton getBoton() {
		return boton;
	}

	public void setBoton(JButton boton) {
		this.boton = boton;
	}
	

}
