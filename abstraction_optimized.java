abstract class Marks
{
    abstract public float getPerc(int a, int b, int c,int d);
}
class A extends Marks
{
    public A(int a, int b, int c, int d)
    {
        float perc=getPerc(a, b, c, d);
        System.out.println("The Percentage of 1st student: "+perc+"%");
    }
    public float getPerc(int a, int b, int c, int d) 
    {
        float perc=(a+b+c)/3F;
        return perc;
    }
}

class B extends Marks
{
    public B(int a, int b, int c, int d)
    {
        float perc=getPerc(a, b, c, d);
        System.out.println("The Percentage of 2nd student: "+perc+"%");
    }
    public float getPerc(int a, int b, int c, int d)
    {
        float perc=(a+b+c+d)/4F;
        return perc;
    }
}

public class abstraction_optimized
{
    public static void main(String[] args) 
    {
            new A(1,2,3,0);
            new B(1,2,3,4);
    }
}
