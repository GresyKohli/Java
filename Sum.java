import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int num1, num2, add;
Scanner s = new Scanner(System.in);
System.out.println("Please enter any two numbers : ");
num1 = s.nextInt();
num2 = s.nextInt();
add = num1 + num2;
System.out.println("Addition of two given number is : " +add);
}
}