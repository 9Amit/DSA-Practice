
import java.util.*;

class TargetSum {
    public static void main(String[] args) {
        int arr[] = { 1, 32, 2, 4, 5, 7 };
        int target = 6;
        ArrayList<Integer> res = findTarget(arr, target);
        for(int num:res){
            System.out.println(num);
        }
    }

    static ArrayList<Integer> findTarget(int[]arr,int target){
        ArrayList<Integer>result=new ArrayList<>();

        int curr=0,s=0,e=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];

            if(curr>=target){
                 e = i;

                 while(curr>target && s<e){
                    curr-=arr[s];
                    ++s;
                 }
                 if (curr == target) {
                     result.add(s + 1);
                     result.add(e+1);
                    return result;
                 }
            }
        }
        result.add(-1);
        return result;

    }

}