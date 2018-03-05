package prueba;

import java.util.ArrayList;

public class Materia {
	
	private String nombre;
	private ArrayList<Profesor> profesor;
	private int duracion;
	
	public Materia (String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Profesor> getProfesor() {
		return profesor;
	}

	public void setProfesor(ArrayList<Profesor> profesor) {
		this.profesor = profesor;
	}

	public int getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", profesor=" + profesor + ", duracion=" + duracion + "]";
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
