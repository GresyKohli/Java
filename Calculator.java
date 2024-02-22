import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
int num1, num2;
char choices;
Scanner s = new Scanner(System.in);
System.out.println("Enter any two integers : ");
num1 = s.nextInt();
num2 = s.nextInt();
System.out.println("Enter any operator among these +, -, *, /, % : ");
choices = s.next().charAt(0); 

switch(choices)
{
case '+':
	 System.out.println("The addition of the given numbers is : " +(num1 + num2));
	 break;
 case '-':
	 System.out.println("The subtraction of the given numbers is : " +(num1 - num2));
	 break;
 case '*':
	 System.out.println("The multiplication of the given numbers is : " +(num1 * num2));
	 break;
 case '/':
	 System.out.println("The modulus of the given numbers is : " +(num1 % num2));
	 break;
 case '%':
	 System.out.println("The division of the given numbers is : " +(num1 / num2)); 
	 break; 
}
}
}