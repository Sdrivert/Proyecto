package proyecto;

import java.util.ArrayList;

public class Asignatura {
	String nombre;
	String codigo;
	int cupos;
	int creditos;
	ArrayList<String> codigoEstudiantes;
	
	public Asignatura(String nombre, String codigo, int cupos, int creditos, ArrayList<String> codigoEstudiantes){
		this.nombre = nombre;
		this.codigo =  codigo;
		this.cupos = cupos;
		this.creditos = creditos;
		this.codigoEstudiantes = codigoEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getCupos() {
		return cupos;
	}

	public int getCreditos() {
		return creditos;
	}

	
}
