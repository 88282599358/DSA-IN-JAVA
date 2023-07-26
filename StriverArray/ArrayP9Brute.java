package StriverArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayP9Brute {
	public static ArrayList<Integer> union(int arr1[], int arr2[], int n1, int n2) {
		HashSet<Integer> intSet = new HashSet<>();
		ArrayList<Integer> unions = new ArrayList<>();
		for(int i=0;i<n1;i++) {
			intSet.add(arr1[i]);  //O(n1logn)
		}
		for(int i=0;i<n2;i++) {
			intSet.add(arr2[i]); //O(n2logn)
		}

		int i=0;
		for(int it: intSet) {	//O(n1+n2)
			unions.add(it);
		}
		return unions;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		int n1 = 10;
		int n2 = 7;
		ArrayList<Integer> Uni = ArrayP9Brute.union(arr1,arr2, n1, n2);
		for (int val:Uni) {
            System.out.print(val + " ");
        }
        System.out.println("");
	}
	//TC:- O(n1logn) + O(n2logn) + O(n1+n2)
	//SC:- O(n1+n2) + O(n1+n2)  make sure that we return the output not  solve the problem

}
