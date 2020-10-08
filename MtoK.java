public class MtoK {
	public static void main(String[] args) {
		final double aux = 1.609; 
		System.out.println(
			"Miles        Kilometers");
		for (int i = 1; i <= 10; i++) {
			System.out.printf(
				"%-12d% -10.2f\n", i, (i * aux));
		}
	}
}