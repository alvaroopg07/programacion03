package unidad03.ejercicios.cuentaCorriente;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private Double saldo;

	public CuentaCorriente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = 0.0;
	}

	public boolean retirar(double retirada) {
		boolean operacionPosible;
		if (this.saldo >= retirada) {
			this.saldo = this.saldo - retirada;
			operacionPosible = true;
		} else {
			System.out.println("No hay dinero suficiente");
			operacionPosible = false;
		}
		return (operacionPosible);

	}

	public void ingreso(double ingreso) {
		this.saldo += ingreso;
	}

	public void mostrarInformacion() {
		System.out.printf("Nombre: %s\n", this.nombre);
		System.out.printf("Dni: %s\n", this.dni);
		System.out.printf("Saldo: %.2f euros\n", this.saldo);
	}

}
