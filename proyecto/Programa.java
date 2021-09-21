package proyecto;

import java.util.ArrayList;

public class Programa {
	ArrayList<Asignatura> asignaturas;
	ArrayList<Estudiante> estudiantes;
	
	
	public Programa(ArrayList<Asignatura> asignaturas, ArrayList<Estudiante> estudiantes) {
		this.asignaturas = asignaturas;
		this.estudiantes = estudiantes;
	}
	
	public void registrarNuevoEstudiante(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
	}
	
	public void registrarNuevaAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}
	public void agregarEstudianteAUnaAsignatura(Asignatura asignatura, Estudiante estudiante) {
		
	}
	
	public void removerEstudianteDeUnaAsignatura(Asignatura asignatura, Estudiante estudiante) {
		
	}
	
	
	public static void main(String[] args) {
		LogicaServidor servidor = new LogicaServidor();
		
		
	}
}
