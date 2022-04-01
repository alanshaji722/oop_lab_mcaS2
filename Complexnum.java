package complexnum;

import java.util.Scanner;

public class Complexnum 
{
   double real, img;
   
   Complexnum()
   {
	Scanner s=new Scanner(System.in);
        System.out.println("enter the real number: ");
        real= s.nextFloat();
        System.out.println("enter the imaginary number: ");
        img=s.nextFloat();
   }
	
   public static Complexnum sum(Complexnum c1, Complexnum c2)
   {
        Complexnum temp = new Complexnum();

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
   
    public static void main(String args[]) 
    {
	Complexnum c1 = new Complexnum();
	Complexnum c2 = new Complexnum();
        Complexnum temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}
