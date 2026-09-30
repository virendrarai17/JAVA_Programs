import java.util.Arrays;

public class shiftNonZeroLeft {

	public static int[] siftNonZeroElementToLeft(int a[]) {
		
		if(a.length==1) {
			return a;
		}
		
		int newArray[]=new int[a.length];
		int count=0;
		
		for(int number:a)
		
			if(number!=0) {
			newArray[count]=number;
			count++;
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		// Shift all the non Zero element to left hand side
		
		int[] i= new int[]{1,2,3,4,0,1,4,5,0,0};
		System.out.println(Arrays.toString(siftNonZeroElementToLeft(i)));
		
		i= new int[]{0,0,0,1,2,3,4,0,1,4,5,0,0};
		System.out.println(Arrays.toString(siftNonZeroElementToLeft(i)));
		
		i= new int[]{0};
		System.out.println(Arrays.toString(siftNonZeroElementToLeft(i)));
		
		i= new int[]{0,0,0,0};
		System.out.println(Arrays.toString(siftNonZeroElementToLeft(i)));
		
		i= new int[]{1,1,1,0,0,1};
		System.out.println(Arrays.toString(siftNonZeroElementToLeft(i)));
		
		i= new int[]{1};
		System.out.println(Arrays.toString(siftNonZeroElementToLeft(i)));
		
		

	}

} 
