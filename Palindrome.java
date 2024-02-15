import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int num, r, rev = 0, temp;
System.out.println("Enter any integer to check if it is Palindrome or not : ");
Scanner s = new Scanner(System.in);
num = s.nextInt();
temp = num;
while(num != 0)
{
r = num % 10;
rev = rev * 10 + r;
num = num / 10;
}
if(temp == rev)
{
System.out.println("Given number is Palindrome number.");
}
else
{
System.out.println("Given number is not a Palindrome number.");
}
}
}