import java.util.*;

class P2_three
{
public static void main(String[]args)
{
   String s=args[0];
   String ss="";
   int i=0;
   for(i=s.length()-1;i>=0;i--)
   {
      char c=s.charAt(i);
      ss=ss+c;  
   }
   if(s.equals(ss))
{
System.out.println("It is a Palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}
}