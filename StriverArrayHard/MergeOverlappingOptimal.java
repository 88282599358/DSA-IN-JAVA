package StriverArrayHard;
import java.util.*;
public class MergeOverlappingOptimal {
	public static List< List< Integer > > mergeOverlappingIntervalss(int [][]arr){
        // Write your code here.
        int n = arr.length;
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int []a, int []b){
            return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
          // if the current interval does not
            // lie in the last interval:
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else{
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), arr[i][1]));
            }
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		List<List<Integer>> ans = mergeOverlappingIntervalss(arr);
		 System.out.print("The merged intervals are: \n");
		 for(List<Integer> it:ans) {
			 System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
		 }
		 System.out.println();
	}

}
