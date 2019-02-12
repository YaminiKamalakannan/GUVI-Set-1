import java.util.Scanner;
class IsPrime{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int rem=0;
if(N==2)
System.out.println("yes");
for(int i=2;i<N;i++){
rem=N%i;
if(rem==0){
System.out.println("no");
break;
}
}
if(rem!=0)
System.out.println("yes");
}
}