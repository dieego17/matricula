package matricula;

import java.util.LinkedList;
import java.util.Scanner;

public class Matricula {

	private LinkedList<Alumno> preinscritos;
	private LinkedList<Alumno> matriculados;
	
	
	public Matricula() {
		this.preinscritos=new LinkedList<>();
		this.matriculados=new LinkedList<>();
	}


	public LinkedList<Alumno> getPreinscritos() {
		return preinscritos;
	}
	public void setPreinscritos(LinkedList<Alumno> preinscritos) {
		this.preinscritos = preinscritos;
	}
	public LinkedList<Alumno> getMatriculados() {
		return matriculados;
	}
	public void setMatriculados(LinkedList<Alumno> matriculados) {
		this.matriculados = matriculados;
	}
	
	
	public static void main(String[] args) {
		
		Matricula m=new Matricula();
		m.getPreinscritos().add(new Alumno("123", "1111H", "marta@gmail.es", "Marta"));
		m.getPreinscritos().add(new Alumno("124", "2222T", "patricia@gmail.es", "Patricia"));
		m.getPreinscritos().add(new Alumno("125", "3333R", "oscar@gmail.es", "Oscar"));
		
		Scanner teclado=new Scanner(System.in);
		
		int opcion=0;
		
		do {
			m.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				m.matricularAlumnos();
				break;
			case 2:
				System.out.println("DNI");
				String dni=teclado.next();
				m.borrarAlumno(dni);
				break;
			case 3:
				m.mostrarUltimo();
				break;
			case 4:
				m.mostrarMatriculados();
				break;
			}
			
		}while(opcion!=5);
	}
	
	private void borrarAlumno(String dni) {
//		for(Alumno a: this.getMatriculados())
//			if(a.getDni().equals(dni))
//				this.getMatriculados().remove(a);
		
		for(int i=0; i<this.getMatriculados().size(); i++) {
			if(this.getMatriculados().get(i).getDni().equals(dni));
			this.getMatriculados().remove(i);
		}
	}


	private void mostrarUltimo() {
		System.out.println(this.getMatriculados().getLast());
	}


	private void matricularAlumnos() {
		if(this.getPreinscritos().size()>0)
			this.getMatriculados().addLast(this.getPreinscritos().removeFirst());
	}


	private void mostrarMatriculados() {
		for(Alumno a: this.getMatriculados()) {
			System.out.println(a.getDni()+" "+a.getNombre());
		}
		
	}

	public void menu() {
		System.out.println("1. Matricular alumno");
		System.out.println("2. Borrar alumno con DNI");
		System.out.println("3. Mostrar último alumno matriculado");
		System.out.println("4. Mostrar alumnos matriculados");
		System.out.println("5. Salir");
		System.out.println("Elige una opción");
	}
}









