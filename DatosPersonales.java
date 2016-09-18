import javax.swing.JOptionPane;

public class DatosPersonales {
	
	
public class DatosPersonales {
	
	 String nombre,apellidoPa,apellidoMa;
	 int edad,dia,mes;
	 
	 public void datos(){
		 
		 nombre = JOptionPane.showInputDialog("escribe tu nombre");
		 apellidoPa = JOptionPane.showInputDialog("escribe tu apellido paterno");
		 apellidoMa = JOptionPane.showInputDialog("escribe tu apellido materno");
		 
		 edad = Integer.parseInt(JOptionPane.showInputDialog("escribe tu edad"));
		 dia = Integer.parseInt(JOptionPane.showInputDialog("escribe el dia en que naciste"));		 
		 
		 mes = Integer.parseInt(JOptionPane.showInputDialog("que mes naciste? (escribelo en numero)"));

}

	public static void main(String[] args) {
			
		

	}

}
