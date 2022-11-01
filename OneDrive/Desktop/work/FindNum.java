public class FindNum
{
 void find(int num1, int num2, int num3)
 {
  if(num1>num2 && num1>num3)
  {
   System.out.println("num1 is the greatest");
  }
  else if(num2>num1 && num2>num3)
  {
   System.out.println("num2 is the greatest");
  }
  else if(num3>num1 && num3>num2)
  {
   System.out.println("num3 is the greatest");
  }
  else
  {
   System.out.println("numbers are equal");
  }
 }
 public static void main(String args[])
 {
  FindNum n1=new FindNum();
  n1.find(10,20,30);
 }
}
