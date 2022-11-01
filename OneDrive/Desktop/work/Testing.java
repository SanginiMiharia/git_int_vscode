interface shape
{
    float pi=3.14f;
    float cons=0.33f;
    public void cylinder(float h,float r);
    public void cone(float l,float r,float h);
}
class Calculation implements shape
{
    public void cylinder(float h,float r)
    {
        float area;
        float vol;
        area=2*pi*r*(r+h);
        vol=pi*r*r*h;
        System.out.println("Area of cylinder:"+area);
        System.out.println("Volume of cylinder:"+vol);
    }
    public void cone(float l,float r,float h)
    {
        float area;
        float vol;
        area=pi*r*l;
        vol=cons*(pi*r*r*h);
        System.out.println("Area of Cone:"+area);
        System.out.println("Volume of Cone:"+vol);
    }
}
public class Testing
{
    public static void main(String args[])
    {
    Calculation t=new Calculation();
    t.cylinder(2,3);
    t.cone(2,2,3);
    }
}