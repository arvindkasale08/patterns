package decorator;

public class Latte extends CondimentDecorator {

	public Latte(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Latte";
	}

	@Override
	public double cost() {
		return beverage.cost() + .50;
	}
}
