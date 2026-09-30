import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import StringManipulation.ReverseWords;

public class PracticeNow {

// pallindrom
	public static void main(String[] args) {
	
		String s="kanaK";
		String s1="";
		
		StringBuilder result=new StringBuilder();
		
		for(int i=s.length()-1; i>=0; i--) {
			s1=result.append(s.charAt(i)).toString();
		}
		System.out.println(result);
		
		if(s.equalsIgnoreCase(s1))
			System.out.println("Pallindrom");
		else
			System.out.println("Not pallindrome");
	
	
	
}
}