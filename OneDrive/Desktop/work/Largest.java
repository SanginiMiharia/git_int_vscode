import java.util.*;
class Largest{
public static void main(String ac[]){
int a,b,c;
System.out.println("enter the  number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("enter the  number");
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c){
System.out.println(a +"is greater among these");
}
else if(b>a&&b>c){
System.out.println(b + "is greater among these");
}
else{
System.out.println( c + "is greater among these");
}
}
}
