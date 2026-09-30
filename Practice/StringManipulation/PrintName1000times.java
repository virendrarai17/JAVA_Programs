package StringManipulation;

public class PrintName1000times {

	public static void main(String[] args) {
		// Print name 1000 times without using loops
		
		//1st approach
		
		String name="Virendra" +"\n";
		String s1= "i";
		
		s1=s1.replaceAll("i","iiiiiiiii"); // 10
		s1=s1.replaceAll("i", "iiiiiiiiii"); //10*10
		s1=s1.replaceAll("i", "iiiiiiiiii"); //100*10
		
		s1=s1.replaceAll("i", name + "\n");
		System.out.print(s1);
		
//		// 2nd approach
//		System.out.println(name.repeat(1000));
	}

}
