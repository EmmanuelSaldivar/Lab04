package ejercicios;
import java.util.Scanner;
public class ejercicio03 {
	public static void mayorMenor(Student[] computerScience) {
		int menor=computerScience[0].getAge();
		int indiceMayor=0;
		int indiceMenor=0;
	
		int mayor=computerScience[0].getAge();
		for (int i = 0; i < computerScience.length; i++) {
			if(computerScience[i].getAge()<=menor) {
				menor=computerScience[i].getAge();
				indiceMenor=i;
			}
			
			if(computerScience[i].getAge()>=mayor) {
				mayor=computerScience[i].getAge();
				indiceMayor=i;
			}
		}
		
		System.out.println("Estudiante mayor es "+computerScience[indiceMayor].getName()+"\n");
		System.out.println("Edad: "+computerScience[indiceMayor].getAge()+"\n");
		System.out.println("Estudiante mayor es "+computerScience[indiceMenor].getName()+"\n");
		System.out.println("Edad: "+computerScience[indiceMenor].getAge()+"\n");
		
       
    }
	public static void main(String[] args) {
		Student[] computerScience = new Student[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < computerScience.length; i++) {
			System.out.println("Ingrese nombre");
			String nombre  = sc.nextLine();
			System.out.println("Ingrese edad");
			int edad  = sc.nextInt();
			computerScience[i] = new Student(nombre,edad);
		}
		System.out.println("Mostrando estudiantes");
		mayorMenor(computerScience);
		
	}

}