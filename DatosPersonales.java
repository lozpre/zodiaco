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
				
				System.out.println("acuario");
				
			}else{
				
				System.out.println("capricornio");
		
			}
			break;

		case 2:
			//febrero
			if (dia >=19) {
				
				System.out.println("piscis");
				
			}else{
				
				System.out.println("acuario");
				
			}
			break;
		
		case 3:
			//marzo
			if (dia >=21) {
				
				System.out.println("aries");
				
			}else{
				
				System.out.println("piscis");
				
			}
			break;

		case 4:
			//abril
			if (dia >=21) {
				
				System.out.println("tauro");
				
			}else{
				
				System.out.println("aries");
				
			}
			break;

		case 5:
			//mayo
			if (dia >=21) {
				
				System.out.println("geminis");
				
			}else{
				
				System.out.println("tauro");
				
			}
			break;
			
		case 6:
			//junio
			if (dia >=21) {
				
				System.out.println("cancer");
				
			}else{
				
				System.out.println("geminis");
				
			}
			break;

		case 7:
			//julio
			if (dia >=21) {
				
				System.out.println("leo");
				
			}else{
				
				System.out.println("cancer");
				
			}
			break;
			
		case 8:
			//agosto
			if (dia >=22) {
				
				System.out.println("virgo");
				
			}else{
				
				System.out.println("leo");
				
			}
			break;

		case 9:
			//septiembre
			if (dia >=23) {
				
				System.out.println("libra");
				
			}else{
				
				System.out.println("virgo");
				
			}
			break;
		
		case 10:
			//octubre
			if (dia >=23) {
				
				System.out.println("escorpion");
				
			}else{
				
				System.out.println("libra");
				
			}
			break;
		
		case 11:
			//noviembre
			if (dia >=23) {
				
				System.out.println("sagitario");
				
			}else{
				
				System.out.println("escorpion");
				
			}
			break;
		
		case 12:
			//diciembre
			if (dia >=21) {
				
				System.out.println("capricornio");
				
			}else{
				
				System.out.println("sagitario");
				
			}
			break;
		
		}


}

	public static void main(String[] args) {
			
		

	}

}
