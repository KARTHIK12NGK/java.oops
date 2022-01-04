interface addfloat
{
    public void add();
}
public class addition_float_usinginterface implements addfloat
{
    public void add()
    {
        float c=30.0f;
        float d=200;
        System.out.println(c+d);
    }
    public static void main(String args[])
    {
        addition_float_usinginterface obj= new addition_float_usinginterface();
       obj.add();
    }
    
}
