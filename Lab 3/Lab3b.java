import java.util.Scanner;
public class Lab3b {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
