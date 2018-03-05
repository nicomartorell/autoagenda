package prueba;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantCursos = 3;
		int cantBloques = 6; // bloques por día
		int cantMaterias = 5; // redundante? si ya tengo cantBloqueMateria puedo usar .length de esa variable
		int cantBloqueMateria[] = { 3, 6, 3, 3, 3 }; // cantidad de bloques asignado a cada materia
		// por ahora se toma numeros que puedan dividirse para la cantidad de cursos

		Materia materias[] = new Materia[4]; //no debería ser 5? usamos cantMaterias acá
		materias[0] = new Materia("A");
		materias[1] = new Materia("B");
		materias[2] = new Materia("C");
		materias[3] = new Materia("D");
		materias[4] = new Materia("E");

		int cantBloqueMateriaPorCurso[] = calcularCantBloqueMateriaPorCurso(cantBloqueMateria, cantCursos);
		// cantidad de bloques asignado a cada materia por curso
		System.out.println(cantBloqueMateriaPorCurso); //quiero ver qué pasa con esto
		
		Grilla grilla[][] = new Grilla[cantBloques][cantCursos]; // esto está muy bien
		grilla = inicializarGrilla(); //estaría bueno que este método sea de la clase Grilla

		// Todavia no se contemplan los profesores

		if (cantCursos * cantBloques >= sumarBloques(cantBloqueMateria)) {
			Grilla mejorGrilla[][] = procesarGrilla(grilla, materias);
			mostrarGrilla(mejorGrilla);
		} else {
			System.out.println("La suma de los bloques es mayor a la disponible en la grilla");
		}

	}

	private static Grilla[][] inicializarGrilla() {
		Grilla grilla[][] = { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null };
		return grilla;
	}

	private static Grilla[][] mostrarGrilla(Grilla[][] mejorGrilla) {
		for (int i = 0; i < mejorGrilla.length; i++) {
			System.out.print("|");
			for (int j = 0; j < mejorGrilla[j].length; j++) {
				System.out.print(mejorGrilla[i][j]);
			}
			System.out.println("|");
		}
		return mejorGrilla;
	}

	private static Grilla[][] procesarGrilla(Grilla grilla[][], Materia materias[]) {
		Grilla mejorGrilla[][] = inicializarGrilla();
		int i = 0;
		int j = 0;
		// aca va la manija
		while (i < mejorGrilla.length) {
			i++;
			while (j < mejorGrilla[i].length) {
				j++;
			}
		}
		return mejorGrilla;
	}

	private static int[] calcularCantBloqueMateriaPorCurso(int[] cantBloqueMateria, int cantCursos) {
		int cantBloqueMateriaPorCurso[] = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < cantBloqueMateria.length; i++) {
			cantBloqueMateriaPorCurso[i] = cantBloqueMateria[i] / cantCursos;
		}
		return cantBloqueMateriaPorCurso;
	}

	private static int sumarBloques(int cantBloqueMaterias[]) {
		int suma = 0;
		for (int i = 0; i < cantBloqueMaterias.length; i++) {
			suma += cantBloqueMaterias[i];
		}
		return suma;
	}

}
