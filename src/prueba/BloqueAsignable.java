package prueba;

public class BloqueAsignable { //información de cada espacio de la matriz
	
	private Profesor p; //profesor que da estas horas
	private Curso c; // curso en el que las da
	private Materia m;
	private int bloques; // cantidad de horas que da
	
	public BloqueAsignable(Profesor p, Curso c, Materia m, int bloques) {
		this.p = p;
		this.c = c;
		this.m = m;
		this.bloques = bloques;
	}

	public Materia getM() {
		return m;
	}

	public Profesor getP() {
		return p;
	}

	public Curso getC() {
		return c;
	}

	public int getBloques() {
		return bloques;
	}


}
