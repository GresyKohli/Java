// Array with user input

import java.util.Scanner;
class Arrays
{
public static void main(String args[])
{
int arr[] = {};
Scanner s = new Scanner(System.in);
System.out.println("Please enter any Elements in array : ");
for(int i = 0; i <= 5; i++)
{
arr[i] = s.nextInt();
}
System.out.println("Elements in given array are : ");
for(int i = 0; i <= 5; i++)
{
System.out.println(+arr[i]);
}
}
}
