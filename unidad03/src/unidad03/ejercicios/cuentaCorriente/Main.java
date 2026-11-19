package unidad03.ejercicios.cuentaCorriente;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente c;
		c = new CuentaCorriente("12345678A", "Pepe");

		c.ingreso(1000);
		c.retirar(300);
		c.mostrarInformacion();

		System.out.println("Puedo sacar 700 euros: " + c.retirar(700.00));
		System.out.println("Puedo sacar 500 euros: " + c.retirar(500.00));

	}

}
