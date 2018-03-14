package prueba;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		* El problema acá es que estamos pasandole a BloqueAsignable un montón de Strings cuando en realidad
		* toma como parámetros objetos (Profesor, Curso, Materia y un int)
		* En todo caso antes de crear esta lista, habría que crear una lista de profesores, otra de cursos,
		* Otra de materias y ahi si armar esto.
		*Eso es lo que hice acá abajo:
		*/
		
		// Me parece que sería más eficiente que estos sean sets o mapas, los cambié a un HashMap
		// Eso es porque usualmente queremos ir a agarrar un profesor o un curso según su nombre, no
		// queremos ir pasando uno por uno (eso es lo que vamos a hacer con los bloques asignables)
		
		HashMap<Profesor> profesores = new HashMap<>();
		profesores.put("Pedrito", new Profesor("Pedrito"));
		profesores.put("Claudia", new Profesor("Claudia"));
		profesores.put("Eduardo", new Profesor("Eduardo"));
		
		HashMap<Curso> cursos = new HashMap<>();
		cursos.put("A", ew Curso("A"));
		cursos.put("B", new Curso("B"));
		cursos.put("C", new Curso("C"));
		
		HashMap<Materia> materias = new HashMap<>();
		materias.put("Matemática", new Materia("Matemática"));
		materias.put("Lengua", new Materia("Lengua"));
		materias.put("Biología", new Materia("Biología"));
		
		ArrayList<BloqueAsignable> datos = new ArrayList<BloqueAsignable>();
		/*datos.add(new BloqueAsignable("Pedrito", "A", "Matematica", "2"));
		datos.add(new BloqueAsignable("Claudia", "A", "Fisica", "2"));
		datos.add(new BloqueAsignable("Eduardo", "A", "Lengua", "2"));
		datos.add(new BloqueAsignable("Pedrito", "B", "Biologia", "1"));
		datos.add(new BloqueAsignable("Claudia", "B", "Quimica", "3"));
		datos.add(new BloqueAsignable("Eduardo", "B", "Sociales", "2"));
		datos.add(new BloqueAsignable("Pedrito", "C", "Biologia", "3"));
		datos.add(new BloqueAsignable("Claudia", "C", "Quimica", "1"));
		datos.add(new BloqueAsignable("Eduardo", "C", "Sociales", "2"));*/
		
		datos.add(new BloqueAsignable(profesores.get("Pedrito"), cursos.get("A"), materias.get("Matemática"), 2));
		datos.add(new BloqueAsignable(profesores.get("Pedrito"), cursos.get("B"), materias.get("Matemática"), 1));
		datos.add(new BloqueAsignable(profesores.get("Pedrito"), cursos.get("C"), materias.get("Matemática"), 3));
		
		datos.add(new BloqueAsignable(profesores.get("Claudia"), cursos.get("A"), materias.get("Lengua"), 2));
		datos.add(new BloqueAsignable(profesores.get("Claudia"), cursos.get("B"), materias.get("Lengua"), 3));
		datos.add(new BloqueAsignable(profesores.get("Claudia"), cursos.get("C"), materias.get("Lengua"), 1));
		
		datos.add(new BloqueAsignable(profesores.get("Eduardo"), cursos.get("A"), materias.get("Biología"), 2));
		datos.add(new BloqueAsignable(profesores.get("Eduardo"), cursos.get("B"), materias.get("Biología"), 2));
		datos.add(new BloqueAsignable(profesores.get("Eduardo"), cursos.get("C"), materias.get("Biología"), 2));
		
		Escuela escuela = new Escuela(datos);
		//antes de calcular habria que controlar los datos ingresados
		
		//diria que lo controle la escuela
		
		//antes lo "controlabamos" asi
		
		/*if (cantCursos * cantBloques >= sumarBloques(cantBloqueMateria)) {
			Grilla mejorGrilla[][] = procesarGrilla(grilla, materias);
			mostrarGrilla(mejorGrilla);
		} else {
			System.out.println("La suma de los bloques es mayor a la disponible en la grilla");
		}*/
		
		escuela.calcular(datos.get(0));
		
	}
	
}
