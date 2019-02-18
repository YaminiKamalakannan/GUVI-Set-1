import java.util.Scanner;
class LargestInArray{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
arr[i]=scan.nextInt();

int max=0;
for(int i=0;i<n;i++){
if(max<arr[i])
max=arr[i];
}
System.out.println(max);
}
}