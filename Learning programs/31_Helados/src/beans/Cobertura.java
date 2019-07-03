package beans;

public enum Cobertura {

	FRESA("fresa"), NATA("nata con nueces"), CHOCOLATE("Chocolate con pepitas de chocolate y un fondant de chocolate");

	private final String cobertura;

	private Cobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getCobertura() {
		return cobertura;
	}

}
