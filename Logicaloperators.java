import java.util.Scanner;
class Logicaloperators
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);

System.out.println("Enter any values of a in true and false : ");
boolean a = s.nextBoolean();

System.out.println("Enter any values of b in true and false : ");
boolean b = s.nextBoolean();

// AND Logical Operator
boolean andResult = a && b;
{
System.out.println("The Logical result of AND : " +andResult);
}
// OR Logical Operator
boolean orResult = a || b;
{
System.out.println("The Logical result of OR : " +orResult);
}
// NOT Logical Operator for A
boolean notResult1 = ! a;
{
System.out.println("The Logical result of NOT for a : " +notResult1);
}
// NOT Logical Operator for B
boolean notResult2 = ! b;
{
System.out.println("The Logical result of NOT for b : " +notResult2);
}
}
}