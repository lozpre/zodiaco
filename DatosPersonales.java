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


		switch (mes) {
		case 1:
			//enero
			if (dia >=20) {
				
				System.out.println("ACUARIO");
				
			}else{
				
				System.out.println("CAPRICORNIO");
		
			}
			break;

		case 2:
			//febrero
			if (dia >=19) {
				
				System.out.println("PICIS");
				
			}else{
				
				System.out.println("ACUARIO");
				
			}
			break;
		
		case 3:
			//marzo
			if (dia >=21) {
				
				System.out.println("ARIES");
				
			}else{
				
				System.out.println("PICIS");
				
			}
			break;

		case 4:
			//abril
			if (dia >=21) {
				
				System.out.println("TAURO");
				
			}else{
				
				System.out.println("ARIES");
				
			}
			break;

		case 5:
			//mayo
			if (dia >=21) {
				
				System.out.println("GEMINIS");
				
			}else{
				
				System.out.println("TAURO");
				
			}
			break;
			
		case 6:
			//junio
			if (dia >=21) {
				
				System.out.println("CANCER");
				
			}else{
				
				System.out.println("GEMINIS");
				
			}
			break;

		case 7:
			//julio
			if (dia >=21) {
				
				System.out.println("LEO");
				
			}else{
				
				System.out.println("CANCER");
				
			}
			break;
			
		case 8:
			//agosto
			if (dia >=22) {
				
				System.out.println("VIRGO");
				
			}else{
				
				System.out.println("LEO");
				
			}
			break;

		case 9:
			//septiembre
			if (dia >=23) {
				
				System.out.println("LIBRA");
				
			}else{
				
				System.out.println("VIRGO");
				
			}
			break;
		
		case 10:
			//octubre
			if (dia >=23) {
				
				System.out.println("ESCORPION");
				
			}else{
				
				System.out.println("LIBRA");
				
			}
			break;
		
		case 11:
			//noviembre
			if (dia >=23) {
				
				System.out.println("SAGITARIO");
				
			}else{
				
				System.out.println("ESCORPION");
				
			}
			break;
		
		case 12:
			//diciembre
			if (dia >=21) {
				
				System.out.println("CAPRICORNIO");
				
			}else{
				
				System.out.println("SAGITARIO");
				
			}
			break;
		
		}


}

	public static void main(String[] args) {
				
		DatosPersonales d = new DatosPersonales();
		d.datos();
		
	}

}
