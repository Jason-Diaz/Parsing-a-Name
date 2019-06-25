package proj1;
import javax.swing.JOptionPane;
/*Project 1: Parsing a Name
 * This Program asks for the person to enter their first and last name, then 
 * for their midterm and final exam grade. Once this is entered it will display
 * what the person persons last name then first name. It will tell them how many
 * letters their is in their first, last, and full name. It will also display the
 * midterm and final exam grade and calculate their average.
 *Jason Diaz
 */
public class Project1 {
	public static void main(String[] args)
	{
		String fullName;
		int posOfSpace;
		String firstName;
		String lastName;
		int firstNameLength;
		int lastNameLength;
		int fullNameLength;
		char firstInitial;
		char lastInitial;
		double midterm;
		double finalExam;
		double average;
		
		fullName = JOptionPane.showInputDialog("Please enter your first name, followed by a space, followed by your last name");
		posOfSpace = fullName.indexOf(" ");
		
		// firstName changed to starting point at 0, ending at posOfspace
		firstName = fullName.substring(0, posOfSpace);
		// lastName changed from 5 to posOfSpace + 1
		lastName = fullName.substring(posOfSpace + 1);
		
		// Swapped the position of firstName and lastName
		System.out.println("Name: " + lastName + ", " + firstName + "\n");
		
		//changed firstNameLength from lastName to firstName
		firstNameLength = firstName.length();
		lastNameLength = lastName.length();
		//due to the space the fullName has to be subtracted by one to only count the letters
		fullNameLength = fullName.length() - 1;
		
		// Removed the 4 and inserted firstNameLength in the middle of the display phrase phrase 
		System.out.println("There are " + firstNameLength + " letters in my first name ");
		System.out.println("There are " + lastNameLength + " letters in my last name");
		// Removed the 11 and inserted fullNameLength in the middle of the display phrase
		System.out.println("There are " + fullNameLength + " letters in my full name\n");
		
		firstInitial = fullName.charAt(0);
		// changed so it will refer to lastName and read the first letter
		lastInitial = lastName.charAt(0);
		
		// Added the line below to display the First initial
		System.out.println("First initial: " + firstInitial);
		System.out.println("Last initial: " + lastInitial + "\n");
		
		midterm = Double.parseDouble(JOptionPane.showInputDialog("Please enter your midterm score."));
		finalExam = Double.parseDouble(JOptionPane.showInputDialog("Please enter your final exam score."));		
		// Added parentheses so the computer adds midterm and finalExam grades first then divides
		average = (midterm + finalExam) / 2;
		
		System.out.println("Midterm: " + midterm);
		// change the Final exam to display finalExam
		System.out.println("Final Exam: " + finalExam);
		System.out.println("\nAverage: " + average);
	}

}
