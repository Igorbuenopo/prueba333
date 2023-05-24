package Modelo;

public class Alumno extends Persona{
	
	private String numMatricula;
	private String grupo;

	public Alumno(String dni, String nombre, int diaC, int mesC, String numMatricula, String grupo) {
		super(dni, nombre, diaC, mesC);
		this.numMatricula = numMatricula;
		this.grupo = grupo;
		// TODO Auto-generated constructor stub
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Alumno [numMatricula=" + numMatricula + ", grupo=" + grupo + ", dni=" + dni + ", nombre=" + nombre
				+ ", diaC=" + diaC + ", mesC=" + mesC + "]";
	}
	
	

}
