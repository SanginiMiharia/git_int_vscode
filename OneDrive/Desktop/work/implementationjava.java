interface A
{
    public void add(int a, int b);
    public void sub(int c,int d);
}
class Calculate implements A
{
    public void add(int a,int b)
    {
        System.out.println("Addition:"+(a+b));
    }
    public void sub(int c,int d)
    {
        System.out.println("Subtraction:"+(c-d));
    }
}
public class implementationjava
{
    public static void main(String args[])
    {
        Calculate s=new Calculate();
        s.add(2,4);
        s.sub(9,4);
    }
}