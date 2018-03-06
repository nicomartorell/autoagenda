package prueba;

import java.util.ArrayList;

public class Curso {
	ArrayList<Bloque> bloques;
	
	public Curso(int bloques) {
		this.bloques = new ArrayList<Bloque>();
		
		for(int i = 0; i < bloques; i++) {
			this.bloques.add(new Bloque());
		}
	}
}
