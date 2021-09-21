package proyecto;

import java.util.ArrayList;

public class Estudiante {
	String nombre;
	int edad;
	int creditos;
	int codigo;
	ArrayList<Asignatura> asignaturas;
	
	public Estudiante(String nombre, int edad, int creditos, int codigo, ArrayList<Asignatura> asignaturas) {
		this.nombre = nombre;
		this.edad = edad;
		this.creditos = creditos;
		this.codigo = codigo;
		this.asignaturas = asignaturas;
	}
	
	public void agregarAsignatura(Asignatura materia) {
		asignaturas.add(materia);
	}
	public void eliminarAsignatura(Asignatura materia) {
		for(int  i = 0;  i < asignaturas.size(); i++) {
			if(asignaturas.get(i).getCodigo() == materia.getCodigo()) {
				this.asignaturas.remove(i);
				return;
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getCreditos() {
		return creditos;
	}

	public int getCodigo() {
		return codigo;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}
}
