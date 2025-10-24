import java.util.*;

public class Guesser {
	public static void main(String[] args) {
		boolean keepGoing = true;
		String response;
		while(keepGoing) {
			response = menu();
			if(response.equals("0")) {
				keepGoing = false;
			} else if(response.equals("1")) {
				humanGuesser();
			} else if(response.equals("2")) {
				computerGuesser();
			} else {
				System.out.println("Please enter 0, 1, or 2...");
			} // end if
		} // end while
	} // end main
	
	public static String menu() {
		System.out.print("0) Exit \n1) Human Guesser \n2) Computer Guesser \n\nPlease enter 0-2: ");
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		return response;
	} // end menu

	public static void humanGuesser() {
		int correct = (int) (Math.random() * 100) + 1;
		boolean keepGoing = true;
		int turns = 0;
		while(keepGoing) {
			turns++;
			System.out.print(turns + ") Please enter a number: ");
			Scanner input = new Scanner(System.in);
			String guessString = input.nextLine();
			int guess = Integer.parseInt(guessString);
			if(guess>correct) {
				System.out.println("Too high...");
			} else if (guess<correct) {
				System.out.println("Too low...");
			} else {
				System.out.println("You got it!");
				keepGoing = false;
			} // end if
		} // end while
	} // end humanGuesser
	
	public static int getMean(int lower, int upper) {
		int mean = (int) (lower + upper)/2;
		return mean;
	} // end getMean

	public static void computerGuesser() {
		int upper = 100;
		int lower = 1;
		int guess = getMean(lower, upper);
		int turns = 0;
		String status = "";
		boolean keepGoing = true;
		while(keepGoing) {
			turns++;
			System.out.println(turns + ") I guess " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
			Scanner input = new Scanner(System.in);
			status = input.nextLine();
			if(status.equals("H")) {
				upper=guess;
				guess = getMean(lower, upper);
			} else if(status.equals("L")) {
				lower=guess;
				guess = getMean(lower, upper);
			} else if(status.equals("C")) {
				keepGoing = false;
			} else {
				System.out.println("Please enter either H, L, or C...");
				turns--;
			} // end if
		} // end while
	} // end computerGuesser
} // end Guesser
