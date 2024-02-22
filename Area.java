import java.util.Scanner;
class Area
{
float area(float r)
{
float area;
area = r * r * 3.14f;
return area;
}
public static void main(String args[])  
{  
float x;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the radius of circle : ");  
x = sc.nextFloat();  
Area ob = new Area();
float result = ob.area(x);
System.out.println("The area of circle by given radius is : " +result);
}
}
