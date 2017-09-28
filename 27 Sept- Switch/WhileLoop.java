package javaseptbatch;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;
		
		int count = 0;
		// 2 * 1 = 2
		// 2 * 10 = 20
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value");
		int userValue = scanner.nextInt();
		
		while(i<=10)
		{
			System.out.println(userValue + "*" + i + "=" + userValue * i );
			i++;
			count++;
		}
		System.out.println("Total Count=" + count);
	}

}
