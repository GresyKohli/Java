class A
{
String a;
void first()
{
a = "Gresy";
}
}

class B extends A
{
String b;
void space()
{
b = " ";
}
}

class C extends B
{
String c;
String d;
void last()
{
c = "Kohli";
d = a + b + c;
System.out.println("The concatenation of string is : " + d);
}
}

class Name
{
public static void main(String args[])
{
C obj = new C();
obj.first();
obj.space(); 
obj.last();
}
}