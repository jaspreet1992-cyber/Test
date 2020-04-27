package test;



import java.util.*;

class YN
{
public static void main(String args[])
{
char sAns;
boolean bContinue=true;
Scanner cin=new Scanner(System.in);
do
{
System.out.print("\nContinue? Y or N: ");
sAns=cin.next().charAt(0);
if(sAns=='Y' || sAns=='N')
{
System.out.println("user types "+sAns+", loop exists\n");
bContinue=false;
}
else
{
System.out.println("user types "+sAns+"\nError Y or N only\n");
System.out.println("user names "+sAns+"\nError Y or N only\n");

}
}
while(bContinue==true);
}
}

