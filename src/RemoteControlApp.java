import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		// User Story 1
		Scanner kb = new Scanner(System.in);
		String initInput;
		System.out.println("To begin, turn on the remote control: ");
		initInput = kb.next().toUpperCase();
		

		// User Story 2
		while (!initInput.equals("ON")) {
			System.out.println("To begin, turn on the remote control: ");
			initInput = kb.next();
		}
		turnON();

		// User Story 4
		boolean keepGoing = true;
		do {
			System.out.println("Please enter buttons 1 - 9, or OFF");
			String userInput = kb.next();

			switch (userInput.toUpperCase()) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				pressButton();
				break;
			case "OFF":
				turningOff();
				keepGoing = false;
				break;
			default:
				System.out.println("Command not recognized");
				break;
			}
		} while (keepGoing);

		kb.close();
	}

	// User Story 3
	public static void turnON() {
		// This method should only print "TURNING ON"
		System.out.println("TURNING ON");

	}

	public static void pressButton() {
		// This method should only print "BOOP"
		System.out.println("BOOP");
	}

	// User Story 5
	public static void turningOff() {
		System.out.println("TURNING OFF");
	}
}
