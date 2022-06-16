
public class String_Basics {

	public static void main(String[] args) {
		String str1="Rahul";
		String str2="Kumar";
		String str3=str1+str2;
		System.out.println(str3);
		
		String str4=str1.concat(str2);
		System.out.println(str4);
		
		int num1=100;
		System.out.println(str3+num1);
		System.out.println(num1+str3);
		
		System.out.println(str3.length());
		
		String str5=" This is the whole book ";
		System.out.println(str5);
		System.out.println(str5.trim());
		
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		
		System.out.println(str5.isEmpty());
		
		String str6="";
		System.out.println(str6.isEmpty());
		

	}

}
