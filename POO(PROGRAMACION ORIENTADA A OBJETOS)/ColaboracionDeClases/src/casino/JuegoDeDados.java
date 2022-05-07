package casino;

public class JuegoDeDados {
	private Dado dado1,dado2,dado3;

	public JuegoDeDados() {
		dado1=new Dado();
		dado2=new Dado();
		dado3=new Dado();
	}
	
	public void jugar() {
		dado1.tirar();
		dado2.tirar();
		dado3.tirar();
		
		int resp1= dado1.retornarValor();
		int resp2=dado2.retornarValor();
		int resp3=dado3.retornarValor();
		
		if(resp1 == resp2 && resp1==resp3) {
			System.out.println("Gano");
			dado1.imprimir();
			dado2.imprimir();
			dado3.imprimir();
		}else {
			System.out.println("perdio");
			dado1.imprimir();
			dado2.imprimir();
			dado3.imprimir();
		}
	}

	public static void main(String[] args) {
		JuegoDeDados juego1=new JuegoDeDados();
		juego1.jugar();
	}

}
