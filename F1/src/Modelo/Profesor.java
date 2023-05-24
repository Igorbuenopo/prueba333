package Modelo;

import java.util.ArrayList;

public class Profesor extends Persona{
	
	private ArrayList<Clase> clases;

	public Profesor(String dni, String nombre, int diaC, int mesC, ArrayList<Clase> clases) {
		super(dni, nombre, diaC, mesC);
		this.clases = clases;
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Clase> getClases() {
		return clases;
	}

	public void setClases(ArrayList<Clase> clases) {
		this.clases = clases;
	}

	@Override
	public String toString() {
		return "Profesor [clases=" + clases + ", dni=" + dni + ", nombre=" + nombre + ", diaC=" + diaC + ", mesC="
				+ mesC + "]";
	}
	
	

}
