package javaseptbatch;

public class BreakContinue {

	public static void main(String[] args) {
		
		int skippedValue;
		
		for(int i = 1; i<=10; i++)
		{
			if(i==5){
				//break;
				skippedValue = i;
				continue;
				
			} 
			else{			
				System.out.println(i);
			}
		}
		System.out.println("After Loop");

	}

}
