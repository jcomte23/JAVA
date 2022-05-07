
public class Banco {
	private Cliente cliente1,cliente2,cliente3;

	public Banco() {
		cliente1=new Cliente("Juan");
        cliente2=new Cliente("Ana");
        cliente3=new Cliente("Pedro"); 
	}
	
	public void Operar() {
		cliente1.Depositar(200);
		cliente2.Depositar(400);
		cliente3.Depositar(800);
		cliente1.Extraer(200);
	}
	
	public void DepositosTotales() {
		int montoGenerar=cliente1.RetornarMonto()+cliente2.RetornarMonto()+cliente3.RetornarMonto();
		System.out.println ("El total de dinero en el banco es:" + montoGenerar);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	}

	public static void main(String[] args) {
		Banco test=new Banco();
		test.Operar();
		test.DepositosTotales();
	}

}
