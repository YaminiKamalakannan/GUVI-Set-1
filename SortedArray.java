import java.util.Scanner;
class SortedArray{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
arr[i]=scan.nextInt();
int temp=0;

for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
}