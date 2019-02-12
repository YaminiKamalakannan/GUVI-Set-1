import java.util.Scanner;
class Power{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int k=scan.nextInt();
int res=1;
for(int i=1;i<=k;i++){
res=res*N;
}
System.out.println(res);
}
}