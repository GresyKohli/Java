class A  // Super class
{
float a, b, c;
void add()
{
a = 100;
b = 65;
c = a + b;
System.out.println("The addition of two numbers is : " +c);
}
}

class B extends A  // Sub class 1
{
void sub()
{
a = 100;
b = 65;
c = a - b;
System.out.println("The subtraction of two numbers is : " +c);
}

void mul()
{
a = 100;
b = 65;
c = a * b;
System.out.println("The multiplication of two numbers is : " +c);
}

void remain()
{
a = 100;
b = 65;
c = a % b;
System.out.println("The remainder of two numbers is : " +c);
}
}


class C extends B  // Sub class 2
{
void div()
{
a = 100;
b = 65;
c = a / b;
System.out.println("The division of two numbers is : " +c);
}
}

class Calculator
{
public static void main(String args[])
{
C obj = new C();
obj.add();
obj.sub();
obj.mul();
obj.remain();
obj.div();
}
}