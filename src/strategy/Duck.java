package strategy;

public abstract class Duck {

	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;

	protected abstract void display();

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void performQuack() {
		this.quackBehavior.quack();
	}

	public void performFly() {
		this.flyBehavior.fly();
	}
}
