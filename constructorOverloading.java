import java.util.Scanner;
class area
{
    public area(float a)
    {
        System.out.println("the area of the square is "+a*a+" sq units");
    }
    public area(double a, double b)
    {
        System.out.println("the area of the rectangle is "+a*b+" sq units");
    }
    public area(double a)
    {
        System.out.println("the area of the circle is "+3.14 * a * a+" sq units");
    }
}
public class constructorOverloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth for rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        new area(l,b);

        System.out.print("\nEnter radius for circle: ");
        float r = sc.nextFloat();
        new area(r);

        System.out.print("\nEnter side length for square: ");
        float s = sc.nextFloat();
        new area(s);

        sc.close();
    }    
}
