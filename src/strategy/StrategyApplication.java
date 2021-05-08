package strategy;

public class StrategyApplication {

	public static void main(String[] args) {
		System.out.println("Running StrategyApplication");
		Duck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new Quack());
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.performFly();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehavior(new FlyNoWay());
		rubberDuck.setQuackBehavior(new MutedQuack());
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();
	}
}
