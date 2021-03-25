public class HouseDog extends Dog {
	public HouseDog(String name) {
		this.setName(name);
	}

	public HouseDog(int type) {
		if (type == 1) {
			this.setName("miho");
		} else if (type == 2) {
			this.setName("maru");
		} else if (type == 3) {
			this.setName("hodu");
		}
	}

	public void sleep() {
		System.out.println(this.name + " zzZ in house");
	}

	public void sleep(int hour) {
		System.out.println(this.name + " zzZ in house for " + hour + " hours");
	}
	
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("maru");
		houseDog.sleep();
		houseDog.sleep(10);

		HouseDog houseDogTwo = new HouseDog(3);
		System.out.println(houseDogTwo.name);
	}
}
