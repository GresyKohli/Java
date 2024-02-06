import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int num, r, sum = 0, temp;
System.out.println("Enter any three digit number to check if it is Armstrong number or not : ");
Scanner s = new Scanner(System.in);
num = s.nextInt();
temp = num;
while(num > 0)
{
r = num % 10;
sum = sum + r * r * r;
num = num / 10;
}
if(temp == sum)
{
System.out.println("Given number is Armstrong number.");
}
else
{
System.out.println("Given number is not a Armstrong number.");
}
}
}