import java.util.Arrays;

public class shiftZeroToLeft {

	public static int[] shiftZeroToLeftInArray(int[] a) {
		
		if(a.length==1) {
			return a;
		}
		int newArray[]=new int[a.length];
		
		int count=a.length-1;
		
		for(int i=a.length-1; i>=0; i--) {
			if(a[i]!=0) {
				newArray[count]=a[i];
				count--;
			}
		}	
		
		return newArray;
	}
	
	public static void main(String[] args) {
		// Shift zero element to left
		
		int[] i=new int[] {0,1,2,3,4,0,1,0,1,0,0,0};
		
		System.out.println(Arrays.toString(shiftZeroToLeftInArray(i)));
		
		i= new int[]{0,0,0,1,2,3,4,0,1,4,5,0,0};
		System.out.println(Arrays.toString(shiftZeroToLeftInArray(i)));
		
		i= new int[]{0};
		System.out.println(Arrays.toString(shiftZeroToLeftInArray(i)));
		
		i= new int[]{0,0,0,0};
		System.out.println(Arrays.toString(shiftZeroToLeftInArray(i)));
		
		i= new int[]{1,1,1,0,0,1};
		System.out.println(Arrays.toString(shiftZeroToLeftInArray(i)));
		
		i= new int[]{1};
		System.out.println(Arrays.toString(shiftZeroToLeftInArray(i)));

	}
}
