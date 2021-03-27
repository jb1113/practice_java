public class Bouncer {
//	public void barkAnimal(Animal animal) {
//		if (animal instanceof Tiger) {
//			System.out.println("호랑이");
//		} else if (animal instanceof Lion) {
//			System.out.println("사자");
//		} else if (animal instanceof Crocodile) {
//			System.out.println("악어");
//		} else if (animal instanceof Leopard) {
//			System.out.println("표범");
//		}
//	}

	public void barkAnimal(Barkable animal) {
		animal.bark();
	}

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard();

		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		bouncer.barkAnimal(crocodile);
		bouncer.barkAnimal(leopard);
	}
}
