import java.util.Scanner;
class Digits{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int count=1;
int sum=0;
while(num>10){
 sum=sum+(num%10);
 num=num/10;
 count++;
}
System.out.println(count);
}
}