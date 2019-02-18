import java.util.Scanner;
class SumAP{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int A=scan.nextInt();
int D=scan.nextInt();
int sum=0;
for(int i=0;i<=N;i++){
sum=A+D;
}
System.out.print(sum);
}
}