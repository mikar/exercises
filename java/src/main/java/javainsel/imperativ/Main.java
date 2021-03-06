package javainsel.imperativ;

/*
 * �bungen aus dem Buch "Java ist auch eine Insel"
 * http://tutego.de/javabuch/aufgaben/imperativ.html
 */

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// eingabedialog();
		// muenzmaschine(159);
		// muenzmaschineOriginal(1.59);
		// bedingungsOperator(0);
		// alternativen(1);
		// gradeUngrade(3);
		// switchAnweisung("J");
		// stringWiederholen("*");
		// mathematischesPhaenomen();
		// forSchleifen();
		// geschachtelteSchleifen();
		// denkenStattRechnen();
		// einWuerfelspiel();
		// testDistribution();
		// linie(5);
		// average(10, 53);
		// printFirstPrimes(100);
		TagDesJahres.main(args);
	}

	public static void wertebereiche() {
		System.out.println(1000000 * 1000000);
		System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1
				+ 0.1 - 1.0);
	}

	public static void eingabedialog() {
		String s = javax.swing.JOptionPane
				.showInputDialog("Bitte Zahl eingeben");

		System.out.println(s + " * " + s);
		javax.swing.JOptionPane.showMessageDialog(null,
				Math.pow(Integer.parseInt(s), 2));
		System.exit(0);
	}

	enum Muenze {

		ZWEI_EURO(2.0), EIN_EURO(1.0), FUENFZIG_CENT(0.5), ZWANZIG_CENT(0.2), ZEHN_CENT(
				0.1), FUENF_CENT(0.05), ZWEI_CENT(0.02), EIN_CENT(0.01);

		private double value;

		private Muenze(double value) {
			this.value = value;
		}

		public double getValue() {
			return value;
		}
	}

	public static void muenzmaschine(int value) {
		int[] muenzen = { 200, 100, 50, 20, 10, 5, 2, 1 };
		HashMap<Integer, String> translationMap = new HashMap<Integer, String>() {
			{
				put(200, "zwei Euro");
				put(100, "ein Euro");
				put(50, "fuenfzig Cent");
				put(20, "zwanzig Cent");
				put(10, "zehn Cent");
				put(5, "fuenf Cent");
				put(2, "zwei Cent");
				put(1, "ein Cent");
			}
		};

		int result = 0, count = 0;
		for (int i : muenzen) {
			while (result + i <= value) {
				result += i;
				count += 1;
			}
			System.out.println(count + " mal die " + translationMap.get(i)
					+ " M�nze benutzt.");
			count = 0;
		}
	}

	public static void muenzmaschineOriginal(double d) {

		System.out.println((int) (d / 2) + " x 2 �");
		d %= 2;

		System.out.println((int) (d / 1) + " x 1 �");
		d %= 1;

		System.out.println((int) (d / 0.5) + " x 50 Cent");
		d %= 0.5;

		System.out.println((int) (d / 0.2) + " x 20 Cent");
		d %= 0.2;

		System.out.println((int) (d / 0.1) + " x 10 Cent");
		d %= 0.1;

		System.out.println((int) (d / 0.05) + " x 5 Cent");
		d %= 0.05;

		System.out.println((int) (d / 0.02) + " x 2 Cent");
		d %= 0.02;

		System.out.println((int) (d / 0.01) + " x 1 Cent");
	}

	public static void bedingungsOperator(int anzahlDateien) {
		System.out.printf("Es gibt %d %s.", anzahlDateien,
				anzahlDateien == 1 ? "Datei" : "Dateien");
	}

	public static void alternativen(double d) {
		double ueberraschung = Math.sin(d);

		if (ueberraschung > 0)
			System.out.println("positiv");
		else
			System.out.println("negativ");
		if (ueberraschung > 0 && ueberraschung < 1)
			System.out.println("... und passt");
	}

	public static void gradeUngrade(int n) {
		System.out.println(n % 2 == 0 ? "grade!" : "ungrade!");
	}

	public static void switchAnweisung(String anweisung) {
		switch (anweisung) {
		case "J":
		case "JA":
		case "j":
		case "ja":
			System.out.println("true");
			break;
		case "N":
		case "NEIN":
		case "n":
		case "nein":
			System.out.println("false");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	public static void stringWiederholen(String str) {
		for (int i = 0; i < 30; i++)
			System.out.print(str);
		System.out.println();
	}

	public static void mathematischesPhaenomen() {
		double t = Math.random();
		while (t != 0) {
			if (t < 1)
				t *= 2;
			else if (t >= 1)
				t -= 1;
			System.out.println(t);
		}
	}

	public static void forSchleifen() {
		for (int i = 1900; i <= 2000; i += 10)
			System.out.println(i);
	}

	public static void geschachtelteSchleifen() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {
			for (int k = 0; k < (6 - i); k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void denkenStattRechnen() {
		for (int x = 0; x < 10; x++) {
			for (int l = 0; l < 10; l++) {
				for (int o = 0; o < 10; o++) {
					for (int t = 0; t < 10; t++) {
						int xol = 100 * x + 10 * o + l;
						int lxx = 100 * l + 10 * x + x;
						int tlt = 100 * t + 10 * l + t;

						if ((xol + lxx) == tlt) {
							if ((l != o) && (l != x) && (l != t) && (o != x)
									&& (o != t) && (x != t))
								System.out.println("Ungleiche Variablen:");

							System.out.println("l = " + l + ", " + "o = " + o
									+ ", " + "x = " + x + ", " + "t = " + t);
						}
					}
				}
			}
		}
	}

	private static int rollDice() {
		return (int) (2 + (12 * Math.random()));
	}

	private static void einWuerfelspiel() {
		int sum = 0;

		for (int i = 0; i < 100000; i++) {
			int number = rollDice();

			switch (number) {
			case 12:
				sum += 150;
				break;
			case 11:
				sum += 100;
				break;
			case 10:
				sum += 50;
				break;
			case 9:
			case 8:
			case 7:
				break;
			default:
				sum -= 50;
			}
		}

		System.out.println("Gewinn: " + sum);
		// testDistribution();
	}

	static void testDistribution() {

		int[] sums = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 10000000; i++) {
			switch (rollDice()) {
			case 2:
				sums[0]++;
				break;
			case 3:
				sums[1]++;
				break;
			case 4:
				sums[2]++;
				break;
			case 5:
				sums[3]++;
				break;
			case 6:
				sums[4]++;
				break;
			case 7:
				sums[5]++;
				break;
			case 8:
				sums[6]++;
				break;
			case 9:
				sums[7]++;
				break;
			case 10:
				sums[8]++;
				break;
			case 11:
				sums[9]++;
				break;
			case 12:
				sums[10]++;
				break;
			}
		}
		System.out.println("Augenzahl 2: " + sums[0]++);
		System.out.println("Augenzahl 3: " + sums[1]++);
		System.out.println("Augenzahl 4: " + sums[2]++);
		System.out.println("Augenzahl 5: " + sums[3]++);
		System.out.println("Augenzahl 6: " + sums[4]++);
		System.out.println("Augenzahl 7: " + sums[5]++);
		System.out.println("Augenzahl 8: " + sums[6]++);
		System.out.println("Augenzahl 9: " + sums[7]++);
		System.out.println("Augenzahl 10: " + sums[8]++);
		System.out.println("Augenzahl 11: " + sums[9]++);
		System.out.println("Augenzahl 12: " + sums[10]++);
	}

	static void linie(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++)
			sb.append("-");

		System.out.println(sb.toString());
	}

	static void average(int a, int b) {
		System.out.println((double) (a + b) / 2);
	}

	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void printFirstPrimes(int noOfPrimes) {
		for (int j = 2, i = 0; i < noOfPrimes; j++) {
			if (isPrime(j)) {
				System.out.print(j + " ");
				i++;
			}

			if (j % 60 == 0)
				System.out.println();
		}
	}

}
