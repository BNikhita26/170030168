import java.util.*;

class P2_four
{
public static void main(String[]args)
{
int ok=Integer.parseInt(args[0]);
int r=0,sum=0;
while(ok!=0)
{
r=ok%10;
sum=sum+r;
ok=ok/10;
}
System.out.println("The Sum is "+sum);
}
}