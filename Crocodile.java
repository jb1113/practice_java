public class Crocodile extends Animal implements PredatorBarkable {
	public String getFood() {
		return "strawberry";
	}

	public void bark() {
		System.out.println("악어");
	}
}
