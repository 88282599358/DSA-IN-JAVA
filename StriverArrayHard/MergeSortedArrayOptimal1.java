package StriverArrayHard;
import java.util.*;
public class MergeSortedArrayOptimal1 {
	public static void merger(long arr1[], long arr2[], int n, int m) {
		 // Declare a 3rd array and 2 pointers:
		int left = n-1;
		int right = 0;
		while(left >0 && right <m) {
			if(arr1[left] > arr2[right]) {
				long temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			}
			else {
				break;
			}
			
		}
		// Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long []arr1 = {1,4,8,10};
		long []arr2 = {2,3,9};
		int n = 4, m = 3;
		merger(arr1, arr2, n,m);
		System.out.println("The merged arrays are:");
		System.out.print("arr1[] = ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\narr2[] = ");
		for(int i=0;i<m;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
	}

}