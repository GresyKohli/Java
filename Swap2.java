import java.util.Scanner;
class Swap2
{
public static void main(String args[])
{
int num1, num2;
Scanner s = new Scanner(System.in);
System.out.println("Enter any two numbers : ");
num1 = s.nextInt();
num2 = s.nextInt();
System.out.println("Before swapping the value of num1 and num2 are : " +num1 +"  " +num2);
num1 = num1 + num2; 
num2 = num1 - num2;
num1 = num1 - num2;
System.out.println("After swapping the value of num1 and num2 are : " +num1 +"  " +num2);
}
}
