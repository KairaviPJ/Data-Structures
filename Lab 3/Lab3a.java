public class Lab3a{
    public static void main(String [] args){
        int [] n = {0,1,9,5,7,10,2};
        int minIndex = 0, maxIndex = 0,min = 0,max = 0;
        min = n[0];
        max = n[0];
        for(int i=1;i<n.length;i++){
            min = Math.min(min, n[i]);
            max = Math.max(max, n[i]);
        }
        for(int i=0;i<n.length;i++){
            if(n[i]==min){
                minIndex = i;
            }
            if(n[i]==max){
                maxIndex = i;
            }
        }
        System.out.println(minIndex+""+maxIndex);
    }
}