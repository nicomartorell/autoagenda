package prueba;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<BloqueAsignable> datos = new ArrayList<BloqueAsignable>();
		datos.add(new BloqueAsignable("Pedrito", "A", "Matematica", "2"));
		datos.add(new BloqueAsignable("Claudia", "A", "Fisica", "2"));
		datos.add(new BloqueAsignable("Eduardo", "A", "Lengua", "2"));
		datos.add(new BloqueAsignable("Pedrito", "B", "Biologia", "1"));
		datos.add(new BloqueAsignable("Claudia", "B", "Quimica", "3"));
		datos.add(new BloqueAsignable("Eduardo", "B", "Sociales", "2"));
		datos.add(new BloqueAsignable("Pedrito", "C", "Biologia", "3"));
		datos.add(new BloqueAsignable("Claudia", "C", "Quimica", "1"));
		datos.add(new BloqueAsignable("Eduardo", "C", "Sociales", "2"));
		
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
