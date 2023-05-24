package Modelo;

public abstract class Persona {
	
	protected String dni;
	protected String nombre;
	protected int diaC;
	protected int mesC;
	
	public Persona(String dni, String nombre, int diaC, int mesC) {
		this.dni = dni;
		this.nombre = nombre;
		this.diaC = diaC;
		this.mesC = mesC;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiaC() {
		return diaC;
	}

	public void setDiaC(int diaC) {
		this.diaC = diaC;
	}

	public int getMesC() {
		return mesC;
	}

	public void setMesC(int mesC) {
		this.mesC = mesC;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", diaC=" + diaC + ", mesC=" + mesC + "]";
	}
	
	
	
}
