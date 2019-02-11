import java.util.Scanner;
class OddEven{
public static void main(String[] args){
Scanner abc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=abc.nextInt();
if(a%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}
