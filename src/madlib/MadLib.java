package madlib;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a Number");
		System.out.println("1:Short Story");
		System.out.println("2:Long Story");
		String storyType = sc.nextLine();

		switch (storyType) {
		case "1":
			storyMethod();
			break;
		case "2":
			longStoryMethod();

			break;
		default:
			System.err.println("Enter 1 or 2.");
			System.out.println(" ");
		}
	}

	public static void storyMethod() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a noun: ");
		String noun = sc.nextLine();

		System.out.print("Enter an adjective: ");
		String adjective = sc.nextLine();

		System.out.print("Enter a plural noun: ");
		String nounPlural = sc.nextLine();

		System.out.print("Enter a verb: ");
		String verb = sc.nextLine();

		System.out.println("I've got to " + verb + " not to worry... ");
		System.out.println(
				"Thankfully, it was only looking for its " + noun + " and see " + adjective + " " + nounPlural + ". ");
	}

	public static void longStoryMethod() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a noun: ");
		String noun = sc.nextLine();

		System.out.print("Enter a adjective: ");
		String adjective = sc.nextLine();

		System.out.print("Enter a plural noun: ");
		String nounPlural = sc.nextLine();

		System.out.print("Enter a verb: ");
		String verb = sc.nextLine();

		System.out.println("You go to a " + noun + " and see " + adjective + " " + nounPlural + ". ");
		System.out.println("It decides to " + verb + " them... ");
		System.out.println("They were awakened by " + noun + " and go on a " + adjective + " " + nounPlural + ". ");
		System.out.println("I've got to " + verb + " not to worry... ");
		System.out.println(
				"Thankfully, it was only looking for its " + noun + " and see " + adjective + " " + nounPlural + ". ");
		System.out.println("You decide to " + verb + " and the it left.");
	}
}
