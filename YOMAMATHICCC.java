import java.util.Scanner;

public class YOMAMATHICCC {

	public static void main (String args[]) {

		Scanner Andy = new Scanner(System.in);

		int yourTotalPoints = 0;
		int yourPoints;
		String a = "Defied, automatically not a qt";

		System.out.println("Instructions: Please press 1 or 2, 1 = yes 2 = no! for each question, based off your answers you will be deemed a qt or not a qt");
		System.out.println("Given the instructions are you confident enough to procceed? Hint confidence is key!");
		yourPoints = Andy.nextInt();
			if (yourPoints == 1) {
				System.out.println("-1, haha yeah confidence is key, but I'm actually here to destory it");
				yourTotalPoints--;
			} else if (yourPoints == 2) {
				System.out.println("+1, I can't destroy your confidence if there is none present atm so +1");
				yourTotalPoints++;
			} else if (yourPoints >= 3) {
				System.out.println(a);
			} else if (yourPoints <= 0) {
				System.out.println(a);
			}

		System.out.println("");

			if (yourTotalPoints >= 1) {

				System.out.println("You're a qt");

			} else {

				System.out.println("You're not a qt");

			}

	}

}
