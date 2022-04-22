import java.util.Scanner;

public class PruebaVector3 {
	private Scanner teclado;
	private float[] turnoMañana;
	private float[] turnoTarde;
	
	public void ingresoDeSueldosDeEmpleadosDeLaJornadaEnLaMañana(){
		teclado=new Scanner(System.in);
		turnoMañana=new float[4];
		System.out.println("--------------");
		System.out.println("**BIENVENIDO**");
		System.out.println("--------------");
		System.out.println(" ");
		for(int i=0;i<4;i++) {
			System.out.print("Ingresa el sueldo del empleado # "+(i+1)+" del turno de la mañana= ");
			turnoMañana[i]=teclado.nextFloat();
		}
	}
	
	public void ingresoDeSueldosDeEmpleadosDeLaJornadaEnLaTarde(){
		teclado=new Scanner(System.in);
		turnoTarde=new float[4];
		System.out.println(" ");
		for(int i=0;i<4;i++) {
			System.out.print("Ingresa el sueldo del empleado # "+(i+1)+" del turno de la tarde= ");
			turnoTarde[i]=teclado.nextFloat();
		}
	}
	
	public void calcularGastos() {
		float gastosTurnoMañana = 0;
		float gastosTurnoTarde = 0;
		for(int i=0;i<4;i++) {
			gastosTurnoMañana+=turnoMañana[i];
			gastosTurnoTarde+=turnoTarde[i];
		}
		System.out.println(" ");
		System.out.println("El total de gastos del turno de la mañana es $ "+gastosTurnoMañana);
		System.out.println("El total de gastos del turno de la tarde es $ "+gastosTurnoTarde);
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("**FELIZ DIA**");
		System.out.println("-------------");
		
	}

	public static void main(String[] args) {
		PruebaVector3 test=new PruebaVector3();
		test.ingresoDeSueldosDeEmpleadosDeLaJornadaEnLaMañana();
		test.ingresoDeSueldosDeEmpleadosDeLaJornadaEnLaTarde();
		test.calcularGastos();
	}
	

}
