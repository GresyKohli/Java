// Find greatest elements in array 
import java.util.Scanner;
class Arrayss
{
public static void main(String args[])
{
int arr[] = {10, 50, 20, 80, 100, 30};
System.out.println("Greatest Elements in given array are : ");
for(int i = 1; i <= 5; i++)
{
if(arr[0] < arr[i])
{
arr[0] = arr[i];
}
}
System.out.println(+arr[0]);
}
}

