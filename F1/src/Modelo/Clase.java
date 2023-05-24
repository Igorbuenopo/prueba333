package Modelo;

public class Clase {
	
	private String materia;
	private String grupo;
	
	public Clase(String materia, String grupo) {
		super();
		this.materia = materia;
		this.grupo = grupo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Clase [materia=" + materia + ", grupo=" + grupo + "]";
	}
	
	

}
