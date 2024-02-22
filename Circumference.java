import java.util.Scanner;
class Circumference
{
float circumference(float r)
{
float circumference;
circumference = 2 * r * 3.14f;
return circumference;
}
public static void main(String args[])  
{  
float x;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the radius of circle : ");  
x = sc.nextFloat();  
Circumference ob = new Circumference();
float result = ob.circumference(x);
System.out.println("The circumference of circle by given radius is : " +result);
}
}
