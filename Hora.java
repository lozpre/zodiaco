package practica002;

public class Hora { 
	//Crear variables y declararlas como privadas

	private int Horas;
	private int Minutos;
	private int Segundos;
	
	//Crear get y set 

	public int getHoras() {
		return Horas;
	}
	public void setHoras(int horas) {
		this.Horas = horas;
	}
	public int getMinutos() {
		return Minutos;
	}
	public void setMinutos(int minutos) {
		this.Minutos = minutos;
	}
	public int getSegundos() {
		return Segundos;
	}
	public void setSegundos(int segundos) {
		this.Segundos = segundos;
	}
	public Hora(int horas, int minutos, int segundos) {
		this.Horas = horas;
		this.Minutos = minutos;
		this.Segundos = segundos;
	}

	//El método toString nos permite mostrar la información completa de un objeto,
	// es decir, el valor de sus atributos.

	//crear un metodo toString
	
	public String toString() {
		return "[" + Horas +"hr:"+ "" + Minutos + "min:"+""
				+ Segundos +"ss"+ "]";
	}
	

}
