	package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Controlador.Metodos;
import Modelo.Persona;

public class Colegio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HOLA");
		Metodos m = new Metodos();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		ArrayList<Persona> personas = new ArrayList<>();
		m.cargarTXT(personas);
			
		do {
			System.out.println("1. Añadir persona.\r\n"
					+ "2. Mostrar datos\r\n"
					+ "3. Modificar datos de alumno/profesor\r\n"
					+ "4. Eliminar alumno/profesor\r\n"
					+ "5. Felicitar\r\n"
					+ "6. Buscar alumno por grupo\r\n"
					+ "7. Buscar profesores por materia\r\n"
					+ "8. Salir");
			
			String opcionS = sc.nextLine();
			
			boolean error = false;
			do {
				
				try {
					opcion = Integer.valueOf(opcionS);
					
					if(opcion<1 && opcion >8) {
						error = true;
						System.out.println("Numero incorrecto");
					}else {
						error = false;
					}
				}catch(NumberFormatException e) {
					error = true;
					System.out.println("Numero incorrecto");
				}
				
			}while(error);
			
			switch(opcion) {
			case 1:
				
			case 2:
			case 3: 
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			
			
			}
			
			
		}while(opcion != 8);
		
		sc.close();
	}

}
