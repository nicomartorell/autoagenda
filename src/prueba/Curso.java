package prueba;

import java.util.ArrayList;

public class Curso { // se me ocurre que tiene sentido que la clase curso tenga un Array de bloques, y la Grilla tenga un Array de Cursos
			// más que nada porque así escribí la función calcular, pero se puede ver qué es mejor
	ArrayList<Bloque> bloques;
	
	public Curso(int bloques) {
		this.bloques = new ArrayList<Bloque>();
		
		for(int i = 0; i < bloques; i++) {
			this.bloques.add(new Bloque());
		}
	}
}
