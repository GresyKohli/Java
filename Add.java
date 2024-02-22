import java.util.Scanner;
class Add
{
int sum(int a, int b)
{
int sum = a + b;
return sum;
}
public static void main(String args[])  
{  
int x, y;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
Add ob = new Add();
int result = ob.sum(x, y);
System.out.println("The sum of two numbers x and y is: " +result);
}
}
  
 