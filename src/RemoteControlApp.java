import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		// User Story 1
		// Gets user's input with kb(Scanner) and then assigns initInput to user's input.
		// added toUpperCase to be more user friendly.
		
		Scanner kb = new Scanner(System.in);
		String initInput;
		System.out.println("To begin, turn on the remote control: ");
		initInput = kb.next().toUpperCase();
		
		// User Story 2
		// if the user does not type in "ON" the while loop will begin
		// asking for the user input again until on is typed by the user.
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
			case "0":
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
		} while (keepGoing); // while keepGoing is true, ask for the user's input
		
		// This closes the Scanner
		kb.close();
	}

	// User Story 3
	public static void turnON() {
		// This method should only print "TURNING ON"
		// This will verify that the user typed in "ON" after being asked to turn on the remote
		System.out.println("TURNING ON");

	}

	public static void pressButton() {
		// This method should only print "BOOP"
		// This will be the output for buttons 1 - 9 pressed
		System.out.println("BOOP");
	}

	// User Story 5
	public static void turningOff() {
		// This method should only print "TURNING OFF...
		// This will be the output if the user types in "OFF"
		System.out.println("TURNING OFF..");
	}
}
