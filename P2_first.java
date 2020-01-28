import java.util.*;

class P2_first
{
public static void main(String[]args)
{
int ok=Integer.parseInt(args[0]);
if(ok==0)
{
System.out.println("0 is neither negative nor positive");
}
else if(ok>0)
{
System.out.println(args[0]+" is a positive number");
}
else
{
System.out.println(args[0]+" is a negative number");
}
}
}