package prueba;

import java.util.ArrayList;


public class Escuela {
	
	private ArrayList<BloqueAsignable> datos; //datos para crear una grilla
	private ArrayList<Grilla> grillas;
	
	public Escuela(ArrayList<BloqueAsignable> datos) {
		this.datos = datos;
	}				
	
	//antes de calcular deberiamos controlar los datos ingresados
	
	public void calcular(BloqueAsignable bloqueA) {
		if(bloqueA == null) { // caso base
			//contarPuntos();
			//guardarAgenda();
			return;
		}
		
		for(Bloque b: bloqueA.getC().bloques) {
			if(b.estaDisponible()) {
				b.asignar(bloqueA); //quizás se puede mandar menos info
				calcular(siguiente(bloqueA)); // caso recursivo
			}
		}
		
		return;
	}
	
	public BloqueAsignable siguiente(BloqueAsignable b) {
		return datos.get(datos.indexOf(b) + 1);
	}
	
}
