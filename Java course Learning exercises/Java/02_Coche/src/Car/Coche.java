package Car;

public class Coche extends Vehiculo {

	private String Modelo;

	private String Color;

	private boolean PinturaMetalizada;

	private int Matricula;

	private String TipoCoche;

	private int AņoFabricacion;

	private String ModalidadSeguro;

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public boolean getPinturaMetalizada() {
		return PinturaMetalizada;
	}

	public void setPinturaMetalizada(boolean PinturaMetalizada) {
		this.PinturaMetalizada = PinturaMetalizada;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int Matricula) {
		this.Matricula = Matricula;
	}

	@Override
	public String toString() {
		return "Coche [Modelo=" + Modelo + ", Color=" + Color + ", PinturaMetalizada=" + PinturaMetalizada
				+ ", Matricula=" + Matricula + ", TipoCoche=" + TipoCoche + ", AņoFabricacion=" + AņoFabricacion
				+ ", ModalidadSeguro=" + ModalidadSeguro + "]";
	}

	public String toString2() {
		return "Coche [Modelo=" + Modelo + ", Color=" + Color + ", PinturaMetalizada=" + PinturaMetalizada
				+ ", Matricula=" + Matricula + ", TipoCoche=" + TipoCoche + ", AņoFabricacion=" + AņoFabricacion
				+ ", ModalidadSeguro=" + ModalidadSeguro + "]";
	}

	public String getTipoCoche() {
		return TipoCoche;
	}

	public void setTipoCoche(String TipoCoche) {
		this.TipoCoche = TipoCoche;
	}

	public int getAņoFabricacion() {
		return AņoFabricacion;
	}

	public void setAņoFabricacion(int AņoFabricacion) {
		this.AņoFabricacion = AņoFabricacion;
	}

	public String getModalidadSeguro() {
		return ModalidadSeguro;
	}

	public void setModalidadSeguro(String ModalidadSeguro) {
		this.ModalidadSeguro = ModalidadSeguro;
	}

}