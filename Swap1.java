import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
int num1, num2, temp;
Scanner s = new Scanner(System.in);
System.out.println("Enter any two numbers : ");
num1 = s.nextInt();
num2 = s.nextInt();
System.out.println("Before swapping the value of num1 and num2 are : " +num1 +"  " +num2);
temp = num1;
num1 = num2; 
num2 = temp;
System.out.println("After swapping the value of num1 and num2 are : " +num1 +"  " +num2);
}
}
