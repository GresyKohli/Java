import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
int a = 0, b = 1, c, i, n;
System.out.println("Enter the number by which you want fibonacci series : ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
System.out.println("Fibonacci series are : ");
System.out.println(+a);
System.out.println(+b);
for(i = 0; i <= n - 3; i ++)
{
c = a + b;
a = b; 
b = c;
System.out.println(+c);
}
}
}