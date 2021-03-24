public class Dog extends Animal {
	public void sleep() {
		System.out.println(this.name + " zzZ");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("miho");
		System.out.println(dog.name);
		dog.sleep();
	}
}
