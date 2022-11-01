import java.util.*;
public class comb {
 void combo(int []a,int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(i!=j&&j!=k&&k!=i){
                    System.out.println(a[i]+""+a[j]+""+a[k]);
                }
            }
        }
    }
 }
    public static void main(String[] args){
    int []a=new int[3];
    int b;
 Scanner s1= new Scanner(System.in);
    b=s1.nextInt();
    a[0]=b%10;
    a[1]=(b/10)%10;
    a[2]=(b/100)%10;
comb c1= new comb();

    c1.combo(a,3);

    }
    
}