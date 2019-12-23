import java.util.*;
class Patient 
{
String name;
double weight,height;
void setvalues(String n,double w,double h)
{
name=n;
weight=w;
height=h;
}

double bmi()
{
return ( (weight/0.453592)/(height*0.394)*(height*0.394))*703;
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter patient name");
String s=sc.next();
System.out.println("enter patient weight");
double w=sc.nextDouble();
System.out.println("enter patient height");
double h=sc.nextDouble();
Patient p=new Patient();
p.setvalues(s,w,h);
System.out.println(s);
System.out.println("BMI IS");

System.out.println(p.bmi());
}
}

