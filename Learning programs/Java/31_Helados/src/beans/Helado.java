package beans;

public class Helado {
	private IceCream tipo;
	private Cobertura topping;
	private String nombre;

	public Helado() {

	}

	public Helado(String nombre, IceCream tipo, Cobertura topping) {
		super();
		this.tipo = tipo;
		this.topping = topping;
		this.nombre = nombre;
	}

	public IceCream getTipo() {
		return tipo;
	}

	public void setTipo(IceCream tipo) {
		this.tipo = tipo;
	}

	public Cobertura getTopping() {
		return topping;
	}

	public void setTopping(Cobertura topping) {
		this.topping = topping;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Helado[ \n   Nombre: ");
		builder.append(nombre);
		builder.append("\n   Num. de bolas: ");
		builder.append(tipo.getBolas());
		builder.append("\n   Topping: ");
		builder.append(topping.getCobertura());
		builder.append("\n]");
		return builder.toString();
	}

}
