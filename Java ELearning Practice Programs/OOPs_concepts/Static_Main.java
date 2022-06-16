package OOPs_concepts; 

public class Static_Main {

	public static void main(String[] args) {
		Static_Keyword sk1=new Static_Keyword();
		Static_Keyword sk2=new Static_Keyword();
		
		sk1.age=7;
		sk1.grade="2nd";
		sk1.name="Ram";
		
		sk2.age=10;
		sk1.grade="3rd";
		sk1.name="Shyam";
		
		sk1.displayDetails();
		sk2.displayDetails();
		

	}

}
