import java.util.Scanner;
class SumUptoN{
public static void main(String[] args){
Scanner abc=new Scanner(System.in);
int a=abc.nextInt();
int sum=0;
for(int i=1;i<=a;i++){
  sum=sum+i;
}
System.out.println(sum);
}
}

