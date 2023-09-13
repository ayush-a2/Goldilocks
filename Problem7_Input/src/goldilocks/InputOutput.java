package goldilocks;
import java.util.Scanner;
public class InputOutput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give your input to Print");
		System.out.println("To exit CANCEL type");
		String input;
		while(!(input=sc.nextLine()).equals("CANCEL")) {
			System.out.println(input);
		}
	}
}
