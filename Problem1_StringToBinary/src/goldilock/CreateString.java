package goldilock;


import java.util.Scanner;

public class CreateString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to convert it into Binary String");
		String input=sc.next();
		int value=0;
		try {
			value=Integer.parseInt(input);
		}catch(Exception ex) {
			System.out.println("Please provide  input");
		}
		System.out.println(Integer.toBinaryString(value));
	}
	
	
}

