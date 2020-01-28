import java.util.*;

class P2_second
{
public static void main(String[]args)
{
int ok=Integer.parseInt(args[0]);
int i=0,flag=0;
for(i=2;i<=ok/2;i++)
   {
if(ok%i==0)
 {
flag=1;
break;
 }
   }
if(ok==1){ System.out.println("1 is neither prime nor composite"); }
else if(flag==0){ System.out.println(ok+" is a prime number"); }
else{ System.out.println(ok+" is not a prime number"); }
}
}