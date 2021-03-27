public class Leopard extends Animal implements PredatorBarkable {
	public String getFood() {
		return "orange";
	}

	public void bark() {
		System.out.println("표범");
	}
}
