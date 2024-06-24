import java.util.Scanner;
public class Lab3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        double ans = 0;
        // for(int i=m;i<=n;i++){
        //     ans+=m;
        // }
        ans = ((n-m+1)/2)*(m+n);
        System.out.println(ans);
    }
}
