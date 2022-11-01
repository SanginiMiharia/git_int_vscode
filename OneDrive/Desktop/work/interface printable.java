interface printable{
    int a=10;
    int square();
}
class Arithmetic implements printable{
    public void square()
    {
        int result;
        result=a*a;
        System.out.println("Square is:",+result);
    }
    
    class TestInt{
        public static void main(String args[])
        {
        Arithmetic s1=new Arithmetic();
        s1.Arithmetic();
        }

    }
    
}