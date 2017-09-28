package javaseptbatch;

/*
 
 A
 AB
 ABC
 ABCD
 ABCDE
  
  
 */
//A = 65 to Z = 90
//a = 97 to z = 122

public class Pattern1 {

	public static void main(String[] args) {
		
		for(char row = 'A'; row<='E'; row++)
		{
			for(char column = 'A'; column <= row; column++)
			{
				System.out.print(column);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String array[] = {"A", "B", "C", "D", "E"};
		
//		//outer loop
//		int k = 65;
//		for(int row = 0; row<5 ; row++)//row = 2 <= 5
//		{	//inner loop
//			for(int column = 0; column<=row; column++){//column = 1<=2
//				System.out.print((char)k);
//				k++;
//				//System.out.print(array[column]); 
//			}
//			k = 65;
//			System.out.println();
//			
//		}
		

	}

}
