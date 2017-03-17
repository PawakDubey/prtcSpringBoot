
public class Test {
	public static void main(String args[]) {
		for (int i = 0; i < 100; i++) {
			String rndmId = Integer.toString((int) (Math.random() * 10));
			System.out.println("Random id used" + rndmId);
		}
	}

}
