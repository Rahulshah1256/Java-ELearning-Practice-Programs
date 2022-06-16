package OOPs_concepts;

public class Method_Overloading {
	
	public void addition(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void addition(double num1,double num2) {
		System.out.println(num1+num2);
	}
	public void addition(int num1,double num2) {
		System.out.println(num1+num2);
	}
	public void addition(double num1,int num2) {
		System.out.println(num1+num2);
	}
	public void addition(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
	public static void main(String[] args) {
		Method_Overloading m=new Method_Overloading();
		m.addition(10,20);
		m.addition(10.22,20.22);
		m.addition(10,20.1);
		m.addition(10.8,20);
		m.addition(10,20,70);
	}

}
