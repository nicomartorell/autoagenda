package prueba;

import java.util.ArrayList;


public class Escuela {
	
	private ArrayList<BloqueAsignable> matriz;
	
	public Escuela() {
		matriz = new ArrayList<BloqueAsignable>(); //obviamente falta llenar esta matriz, pasar algunas cosas que están en la clase
	}						// Test para acá, pero bueno, esto al menos da una idea de cómo sería esta clase
	
	public void calcular(BloqueAsignable data) {
		if(data.equals(matriz.get(matriz.size()-1))) {
			//contarPuntos();
			//guardarAgenda();
			return;
		}
		
		for(Bloque b: data.getC().bloques) {
			if(b.estaDisponible()) {
				b.asignar(data);
				calcular(siguiente(data));
			}
		}
		
		return;
	}
	
	public BloqueAsignable siguiente(BloqueAsignable b) {
		return matriz.get(matriz.indexOf(b) + 1);
	}
	
}
