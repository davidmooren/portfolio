package beans;

public enum IceCream {
	MINI(2), SUPER(3), MEGA(5);

	private final int bolas;

	private IceCream(int bolas) {
		this.bolas = bolas;
	}

	public int getBolas() {
		return bolas;
	}
}
