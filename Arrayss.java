// Find greatest elements in array 
import java.util.Scanner;
class Arrayss
{
public static void main(String args[])
{
int arr[] = {10, 20, 30, 40, 50};
System.out.println("Greatest Elements in given array are : ");
for(int i = 1; i <= 4; i++)
{
if(arr[0] < arr[i])
{
arr[0] = arr[i];
}
else
break;
}
System.out.println(+arr[0]);
}
}

