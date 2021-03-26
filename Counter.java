class Updater {
	public void update(Counter counter) {
		counter.count++;
	}
}

public class Counter {
	int count = 0;

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println("before update: " + counter.count);
		Updater updater = new Updater();
		updater.update(counter);
		System.out.println("after update: " + counter.count);
	}
}
