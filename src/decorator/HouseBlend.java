package decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "Expresso";
	}

	@Override
	public double cost() {
		return 1.89;
	}
}
