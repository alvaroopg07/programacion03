package unidad03.ejercicios.ejercicioFinal;

public class Producto {

	private Long id;
	private String nombre;
	private Double precio;
	private Integer stock;

	public Producto() {

	}

	public Producto(Long id, String nombre, Double precio, Integer stock) {
		setId(id);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("El id no puede ser null ni menor o igual que 0.");
		}
		this.id = id;
	}

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().length() < 2) {
			throw new IllegalArgumentException(
					"El nombre no puede ser null, estar vacío ni tener menos de 2 caracteres.");
		}
		this.nombre = nombre;
	}

	public Double getPrecio() {

		return precio;
	}

	public void setPrecio(Double precio) {
		if (precio == null || precio <= 0.0) {
			throw new IllegalArgumentException("El precio no puede ser null ni menor o igual que 0.0.");
		}
		this.precio = precio;
	}

	public Integer getStock() {

		return stock;
	}

	public void setStock(Integer stock) {
		if (stock != null && stock < 0) {
			throw new IllegalArgumentException("El stock no puede ser negativo.");
		}
		this.stock = stock;
	}

}
