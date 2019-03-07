package modelo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.table.DefaultTableModel;


public class Modelo {

	private DefaultTableModel modelo;
	private static Modelo instance = null;
	
	private Modelo(){
		String[] columnas={"Nombre", "Apellidos", "Email", "Teléfono"};
		Object[][] datos=rellenaDatos();
		modelo = new DefaultTableModel(datos, columnas);
		
	}
	
	public static Modelo getInstance(){
		if(instance==null)
			instance= new Modelo();
		return instance;
	}
	
	public void aniadeFila(Object[] obj){
		modelo.addRow(obj);
		rellenaFichero(obj);
	}
	
	private static void rellenaFichero(Object[] obj){
		String valores="\n"+obj[0]+";"+obj[1]+";"+obj[2]+";"+obj[3];
		
		File f=new File("contactos.txt");
		FileWriter fw;
		try{
			fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(valores);
			bw.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	private int cuentalineas(){
		File f=new File("contactos.txt");
		FileReader fr;
		String linea="";
		int n=0;;
		
		try{
			fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			linea=br.readLine();
			while(linea!=null){
				n++;
				linea=br.readLine();
			}
			br.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		return n;
	}
	
	private Object[][] rellenaDatos(){
		File f=new File("contactos.txt");
		FileReader fr;
		String linea="";
		String[] dLinea;
		int i=0;
		Object[][] tdatos=new Object[cuentalineas()][4];
		
		
		try{
			fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			linea=br.readLine();
			while(linea!=null){
				dLinea=linea.split(";");
				for (int k = 0; k < dLinea.length; k++) {
					tdatos[i][k]=dLinea[k];
				}
				i++;
				linea=br.readLine();
			}
			br.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		return tdatos;
	}
	
	public DefaultTableModel getModelo() {
		return modelo;
	}

}
