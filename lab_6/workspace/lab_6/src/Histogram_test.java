import java.util.Scanner;

class Histogram_test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Set image size: n (#rows) m (#kolumns)");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Obraz obraz_1 = new Obraz(n, m);

		// obraz_1.calculate_histogram();
		// obraz_1.print_histogram();

		// 1.
		// Thread1[] threads1 = new Thread1[94];
		//
		// for (int k = 0; k < 94; k++) {
		// threads1[k] = new Thread1((char)(k + 33), obraz_1);
		// threads1[k].start();
		// }
		//
		// for (int k = 0; k < 94; k++) {
		// try {
		// threads1[k].join();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }

		// 2.

		System.out.println("Set number of threads");
		int num_threads = scanner.nextInt();

		Thread2[] threads2 = new Thread2[num_threads];

		for (int i = 0; i < num_threads; i++) {
			char start = (char) (i * 94 / num_threads);
			int numOfChars = ((i + 1) * 94 / num_threads < 94 ? 94 / num_threads
					: 94 - i * 94 / num_threads);
			System.out.println(String.format(
					"i = %d, start = %d, numofchars = %d", i, (int) start,
					numOfChars));
			// threads2[i] = new Thread2(i, start, numOfChars, obraz_1);
			// threads2[i].start();
		}

		// for (int i = 0; i < num_threads; i++) {
		// try {
		// threads2[i].join();
		// } catch (InterruptedException e) {
		// }
		// }

	}
}