import java.util.*;
import java.lang.Math; 
class Calculator
{

static double powerInt(int num1,int num2)
{
 return  Math.pow(num1,num2); 
}
static double powerDouble(double num3,int num4)
{

double res2=Math.pow(num3,num4);
return res2;
}
}
public class Main
{
public static void main(String args[])
{
int n1,n2,n4;
double n3;
Scanner sc=new Scanner(System.in);
System.out.println("enter integer value 1");
n1=sc.nextInt();
System.out.println("enter integer value 2");
n2=sc.nextInt();
System.out.println("enter double value 1");
n3=sc.nextDouble();
System.out.println("enter Int value 2");
n4=sc.nextInt();
System.out.println(Calculator.powerInt(n1,n2));

System.out.println(Calculator.powerDouble(n3,n4));




}
}