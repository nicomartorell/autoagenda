package prueba;

public class Bloque {
	
	private boolean disponible;
	private Profesor p;
	private Materia m;
	
	public Bloque() {
		disponible = true;
	}
	
	public void asignar(BloqueAsignable b) {
		p = b.getP();
		m = b.getM();
		disponible = false;
	}
	
	public boolean estaDisponible() {
		return disponible;
	}

	public Profesor getP() {
		return p;
	}

	public Materia getM() {
		return m;
	}
}
