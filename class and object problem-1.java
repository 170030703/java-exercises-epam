import java.util.*;
 class Box
{
    int width,height;
    double depth;
    void initialize(int w,int h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double calc()
    {
        return width*height*depth;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Box b=new Box();
	    System.out.println("enter width of box");
	    int w1=sc.nextInt();
	    System.out.println("enter height of box");
	    int h1=sc.nextInt();
	    System.out.println("enter depth of box");
	    double d1=sc.nextDouble();
	    b.initialize(w1,h1,d1);
	    double c=b.calc();
	    System.out.println(c);
	    
	    
		
	}
}
