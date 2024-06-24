public class Lab3e {
    public static void main(String[]args){
        int [] n ={1,2,2,1,2};
        for(int i=0;i<n.length;i++){
            for(int j = i+1;j<n.length;j++){
                if(n[i]==n[j]){
                    System.out.println("i:"+i+"j:"+j+"");
                }
            }
        }
    }
}
