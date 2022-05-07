
public class Cliente {
	private String nombreCliente;
	private int montoCliente;

	public Cliente(String nombre) {
		nombreCliente=nombre;
		montoCliente=0;
	}
	
	public void Depositar(int montoAdepositar) {
		montoCliente=montoCliente+montoAdepositar;
	}
	
	public void Extraer(int montoAExtraer) {
		montoCliente=montoCliente-montoAExtraer;
	}
	
	public int RetornarMonto() {
		return montoCliente;
	}
	
	public void imprimir() {
        System.out.println(nombreCliente+" tiene depositado la suma de "+montoCliente);
    }
}
