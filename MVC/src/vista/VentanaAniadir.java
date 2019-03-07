package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaAniadir {

	JTextField nombre, ape, email, tel;
	JLabel l1, l2, l3, l4;
	JButton b1;
	private JFrame f;
	
	public VentanaAniadir(){
		f=new JFrame("Nuevo Contacto");
		JPanel prin=new JPanel();
		f.setVisible(true);
		f.setSize(200, 200);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f.add(prin);
		prin.setLayout(new GridLayout(5, 1));
		
		nombre=new JTextField(10);
		ape=new JTextField(10);
		email=new JTextField(10);
		tel=new JTextField(10);
		
		l1=new JLabel("Nombre:");
		l2=new JLabel("Apellido:");
		l3=new JLabel("Email:");
		l4=new JLabel("Telefono:");
		b1=new JButton("Enviar");
		JPanel p1, p2, p3, p4;
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,2));
		p1.add(l1);
		p1.add(nombre);
		p2=new JPanel();
		p2.setLayout(new GridLayout(1,2));
		p2.add(l2);
		p2.add(ape);
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(l3);
		p3.add(email);
		p4=new JPanel();
		p4.setLayout(new GridLayout(1,2));
		p4.add(l4);
		p4.add(tel);
		prin.add(p1);
		prin.add(p2);
		prin.add(p3);
		prin.add(p4);
		prin.add(b1);

	}

	public void setVis(boolean y){
		f.setVisible(y);
	}
	
	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JTextField getApe() {
		return ape;
	}

	public void setApe(JTextField ape) {
		this.ape = ape;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getTel() {
		return tel;
	}

	public void setTel(JTextField tel) {
		this.tel = tel;
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}
	
}
