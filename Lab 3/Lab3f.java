import java.util.*;
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int s1 = Integer.parseInt(checkVal(firstWord));
        int s2 = Integer.parseInt(checkVal(secondWord));
        int s3 = Integer.parseInt(checkVal(targetWord));
        if(s1+s2==s3){
            return true;
        } 
        return false;
    }
    private String checkVal(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
            case'a' : if(i==0){
                        break;
                    }
                        ans+=0;
                      break;
            case'b' :  ans+=1;
                      break;
            case'c' :  ans+=2;
                      break;
            case'd' :  ans+=3;
                      break;
            case'e' :  ans+=4;
                      break;
            case'f' :  ans+=5;
                      break;
            case'g' :  ans+=6;
                      break;
            case'h' :  ans+=7;
                      break;
            case'i' :  ans+=8;
                      break;
            case'j' :  ans+=9;
                      break;
        }
        }
        return ans;
    }
}
public class Lab3f {
    
    public static void main(String[]args){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int [] n = {0,5,2,1,7};
        // for(int i=0;i<n.length;i++){    
        // }
        String s ="the quick brown fox jumps over the lazy dog";
       HashMap <Character,Character> map =  new HashMap<>();
       String a = "abcdefghijklmnopqrstuvwxyz";
       int j=0;
       char c = 'a';
       System.out.println(++c);
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            continue;
        }
        else if(map.containsKey(s.charAt(i))){
            continue;
        }
        else{
           
            // System.out.print(s.charAt(i)+""+i);
            map.put(s.charAt(i), a.charAt(j++));
        }
       }
       System.out.println(Integer.parseInt("06"));
    //    for(Map.Entry m : map.entrySet()){
    //     System.out.println(m.getKey()+" "+m.getValue());
    //    }
    }
}
