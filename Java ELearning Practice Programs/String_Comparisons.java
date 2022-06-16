
public class String_Comparisons {

	public static void main(String[] args) {
		String str1="ABCDE";
		String str2="ABCDE";
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		 
		System.out.println(str1=str2);
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		String patt="[a-z{1,}";
		System.out.println(str1.matches(str2));
	}

}
