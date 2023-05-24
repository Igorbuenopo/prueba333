package Controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Excepciones.DNINoValidoException;
import Excepciones.DiaIncorrectoException;
import Excepciones.MesIncorrectoException;
import Modelo.Persona;

public class Metodos {
	
	public boolean validarDNI(String dni) throws DNINoValidoException{
		boolean validado = true;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		if(dni.length() != 9) {
			validado = false;
			throw new DNINoValidoException("El Dni no tiene 9 caractéres");
		}else {
			int numeros = 0;
			try {
				numeros = Integer.valueOf(dni.substring(0,8));
				
			}catch(NumberFormatException e) {
				validado = false;
				throw new DNINoValidoException("Hay más de una letra");
				
			}
			char letra = letras.charAt(numeros%23);
			if(letra  != (dni.charAt(8))) {
				validado = false;
				throw new DNINoValidoException("El DNI no es correcto");
			}
			
		}
		return validado;
	}
	
	public boolean validarMes(int mes) throws MesIncorrectoException {
		boolean validado = true;
		if(mes< 1 || mes>12) {
			validado = false;
			throw new MesIncorrectoException("Mes incorrecto");
		}
		return validado;
	}
	
	public boolean validarDia(int dia, int mes) throws DiaIncorrectoException {
		boolean validado = true;
		
		switch(mes) {
		case 1: 
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 2:
			if(dia< 1 || dia > 29) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 3:
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 4:
			if(dia< 1 || dia > 30) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 5:
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 6:
			if(dia< 1 || dia > 30) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 7:
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 8:
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 9:
			if(dia< 1 || dia > 30) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 10:
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 11:
			if(dia< 1 || dia > 30) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		case 12:
			if(dia< 1 || dia > 31) {
				validado = false;
				throw new DiaIncorrectoException("Dia incorrecto");
			}
		}
		return validado;
		
	}

	public void cargarTXT(ArrayList<Persona> personas) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fic = new FileReader("LoginHistorial/historial.txt");
			BufferedReader buf = new BufferedReader(fic);
			String linea;
			while ((linea = buf.readLine()) != null)
				linea += linea;

			buf.close();
			fic.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
		
	public void subirTXT(ArrayList<Persona> personas) {
		
		try {
			FileWriter fic = new FileWriter("LoginHistorial/historial.txt");
			
			for(int i = 0; i<personas.size(); i++) {
				
			}
			fic.write("");

			fic.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	

}
