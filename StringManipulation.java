
package stringmanipulation;

import java.util.Scanner;


public class StringManipulation 
{
  public static void main(String args[]) 
  {
    System.out.println("Input a String:");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("Resulting String:");
    System.out.println(display(s));
  }
  
 public static String display(String s) 
 {
    StringBuffer sb = new StringBuffer();
    char a = s.charAt(0);
    char b = s.charAt(1);
  if(a=='j' && b=='b')
     sb.append(s.substring(0));
  else if (a != 'j' && b == 'b')
      sb.append(s.substring(1));
  if (a != 'j' && b != 'b')
      sb.append(s.substring(2));
  else
      sb.append("j").append(s.substring(2));
   return sb.toString();
  }
}
