package strategy;

public class MutedQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Muted Quack");
	}
}
