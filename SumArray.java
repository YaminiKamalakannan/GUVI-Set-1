import java.util.Scanner;
class SumArray{
public static void main(String[] abc){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
int sum=0,j=0;
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=scan.nextInt();
}
for(j=0;j<k;j++){
sum=sum+arr[j];
}
System.out.println(sum);
}
}
