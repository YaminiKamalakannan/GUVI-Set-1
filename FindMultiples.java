import java.util.Scanner;
class FindMultiples{
public static void main(String[] args){	
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int res=0;
for(int i=1;i<=5;i++){
res=i*N;

System.out.print(res+" ");
}
}
}