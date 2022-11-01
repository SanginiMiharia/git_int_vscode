public class Sum
{
 int add(int num1, int num2)
  {
   return num1+num2;
  }
 public static void main(String args[])
  {
   int ans;
   Sum s1=new Sum();
   ans=s1.add(10,20);
   System.out.println(ans);
  }
}