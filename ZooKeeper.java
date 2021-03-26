public class ZooKeeper {
//	public void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}

//	public void feed(Lion lion) {
//		System.out.println("feed banana");
//	}

//	public void feed(Crocodile crocodile) {
//		System.out.println("feed strawberry");
//	}

//	public void feed(Leopard leopard) {
//		System.out.println("feed orange");
//	}

	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard();
		zooKeeper.feed(crocodile);
		zooKeeper.feed(leopard);
	}
}
