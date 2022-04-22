import java.util.Scanner;

public class Ejercicio3 {
	private Scanner teclado;
	private float[] cursoA;
	private float[] cursoB;
	
	public void cargaDeNotasAlSistema() {
		teclado=new Scanner(System.in);
		cursoA=new float[5];
		cursoB=new float[5];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<5;i++) {
			System.out.print("¿Cual fue la nota del alumno # "+(i+1)+" del curso A? =");
			cursoA[i]=teclado.nextInt();
		}
		System.out.println(" ");
		for(int i=0;i<5;i++) {
			System.out.print("¿Cual fue la nota del alumno # "+(i+1)+" del curso B? =");
			cursoB[i]=teclado.nextInt();
		}
	}
	
	public void calcularCursoConPromedioMasAlto() {
		float promedioCursoA;
		float promedioCursoB;
		float sumatoriaNotas=0;
		for(int i=0;i<5;i++) {
			sumatoriaNotas+=cursoA[i];
		}
		promedioCursoA=sumatoriaNotas/5;
		sumatoriaNotas=0;
		for(int i=0;i<5;i++) {
			sumatoriaNotas+=cursoB[i];
		}
		promedioCursoB=sumatoriaNotas/5;
		System.out.println(" ");
		if(promedioCursoA==promedioCursoB) {
			System.out.print("Ambos Cursos Obtubieron el mismo promedio= "+promedioCursoA);
		}else if(promedioCursoA>promedioCursoB) {
			System.out.print("El curso A obtubo un promedio mas alto = "+promedioCursoA);
		}else {
			System.out.print("El curso B obtubo un promedio mas alto = "+promedioCursoB);
		}
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
	}

	public static void main(String[] args) {
		Ejercicio3 test=new Ejercicio3();
		test.cargaDeNotasAlSistema();
		test.calcularCursoConPromedioMasAlto();
	}

}
