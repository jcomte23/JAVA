public class Ejercicio1 {
	private String correo;
	
	public Ejercicio1(String variableCorreo) {
		correo=variableCorreo;
	}
	
	public void ValidarCorreo() {
		System.out.println(" ");
		System.out.println("Metodo indexOf(verifica si un texto esta dentro de otro e indica la posicion)");
		String caracter="@";
		int posi=correo.indexOf(caracter);
        if (posi==-1) {
            System.out.println(correo+" no contiene el caracter @");
        } else {
            System.out.println(correo+" contiene el caracter @ a partir de la posición "+posi);
        }
	}

	public static void main(String[] args) {
		Ejercicio1 test=new Ejercicio1("admin@gmail.com");
		test.ValidarCorreo();
	}

}
