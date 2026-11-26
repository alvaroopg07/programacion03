package unidad03.ejercicios.ejercicioFinal;

public class Producto {

	private Long id;
	private String nombre;
	private Double precio;
	private Integer stock;

	public void Producto() {

	}

	public void Producto(Long id, String nombre, Double precio, Integer stock) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Long getId() {
		if (id != null || id > 0) {

		}
		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getNombre() {
		if (nombre != null || !nombre.isBlank() || nombre.length() > 1) {

		}
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		if (precio !=null || precio >0.0) {
			
		}
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		if (stock== null) {
			
		}
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
