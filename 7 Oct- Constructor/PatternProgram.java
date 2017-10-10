package javaseptbatch;

/*

 ************* - 13
 ****** ****** - 12
 *****   ***** - 10
 ****     **** - 8
 ***       *** - 6
 **         ** - 4
 *           * - 2

 */

public class PatternProgram {

	public static void main(String[] args) {
		int temp = 1;
		
		System.out.println("*************");
		
		for(int row = 6; row >=0; row--){//row = 1
			
			for(int column = 0; column<row; column++){
				
				System.out.print("*");
			}
			for(int space = 1; space <=temp; space++){
				System.out.print(" ");
			}
			temp+=2;
			for(int column = 0; column<row; column++){
				
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}