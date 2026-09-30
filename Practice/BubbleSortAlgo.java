import java.util.Arrays;

public class BubbleSortAlgo {

	public static void bubbleSort(int arr[]) {
		//3,2,4,1,-1,5,6-3
		boolean flag=false;
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
			}
			if(!flag || flag==false)
				break;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {3,2,4,1,-1,5,6,-3};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
}
}