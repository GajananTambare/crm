import java.util.Scanner;
class loop1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<=b;i++)
{
if(i%2==1)
{
System.out.println(i+" ");
}
}
}
}