package ejercicios;
import java.util.Scanner;
public class ejercicio02 {
	
	public static void main(String[] args) {
		Student[] computerScience = new Student[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < computerScience.length; i++) {
			System.out.println("Ingrese nombre");
			String nombre  = sc.nextLine();
			System.out.println("Ingrese  sexo(Masculino/Femenino)");
			String genero  = sc.nextLine();
			System.out.println("Ingrese Cui");
			String cui  = sc.nextLine();
			System.out.println("Ingrese edad");
			int edad  = sc.nextInt();
			computerScience[i] = new Student(nombre,genero,cui,edad);
		}
		System.out.println("Mostrando estudiantes");
		for (int i = 0; i < computerScience.length; i++) {
			System.out.println("Estudiante Numero "+(i+1)+"\n");
			System.out.println("Nombre: "+computerScience[i].getName()+"\n");
			System.out.println("Genero: "+computerScience[i].getGender()+"\n");
			System.out.println("Cui: "+computerScience[i].getCui()+"\n");
			System.out.println("Edad: "+computerScience[i].getAge()+"\n");
		}
		
	}

}
