package decorator;

public class DecoratorApplication {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + ": $"+ beverage.cost());

		Beverage beverage1 = new HouseBlend();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Soy(beverage1);
		beverage1 = new Latte(beverage1);

		System.out.println(beverage1.getDescription()+ ": $"+ beverage1.cost());
	}
}
