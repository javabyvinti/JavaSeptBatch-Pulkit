package javaseptbatch;

public class ConsDemo2 {

	String name;
	int rollno;
	
	ConsDemo2(){
		name = "Ram";
		rollno = 1;
		System.out.println("Default Cons called");
	}
	
	ConsDemo2(int value){
		System.out.println("Parameterized cons" + value);
	}
	
	void input()
	{
		name = "Ram";
		rollno = 1;
	}
	
	void output(){
		System.out.println("Name is="+name);
		System.out.println("Rollno is="+ rollno);
	}
	
	public static void main(String[] args) {
		
		ConsDemo2 obj1 = new ConsDemo2();
		ConsDemo2 obj = new ConsDemo2(5);
		//obj.input();
		obj1.output();

	}

}
