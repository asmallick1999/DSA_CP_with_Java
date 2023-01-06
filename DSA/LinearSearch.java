package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {30,20,43,57,20};
        Scanner sc = new Scanner(System.in);
        System.out.print("Ohh you want to search something, Then put the number : ");
        int key = sc.nextInt();
        int f = 0;
        for(int i=0;i< arr.length;i++){
            if(key==arr[i]){
                System.out.println("BOoooh! Yeahhh, I got the number "+arr[i]+ " at "+i+" index position");
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("Oops! can't find the the element");
        }
    }
}
