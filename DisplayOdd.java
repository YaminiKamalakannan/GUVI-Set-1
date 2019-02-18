import java.util.Scanner;
class DisplayOdd{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int num=0;

for(int i=a+1;i<b;i++){
num=i%2;
if(num==1)
System.out.print(i);
}




}
}