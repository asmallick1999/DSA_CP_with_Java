package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {20,89,54,90,35,23,11};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int n = arr.length;
        int start=0, end=n-1;

        Arrays.sort(arr);
        if(start<end){
            for(int i=0;i<n;i++){
                int mid = start+((end-start)/2);
//            System.out.println(mid);
                if(key==arr[end]){
                    System.out.println("got the number : "+arr[start]+ " at "+mid);
                    break;
                } else if (key>arr[mid]) {
                    start = mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }

    }
}
