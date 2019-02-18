import java.util.Scanner;

class PrintMedian{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt();

int[] arr=new int[n];

for(int i=0;i<n;i++)

arr[i]=scan.nextInt();

int temp=0,median=0;


for(int i=0;i<n;i++){

for(int j=i+1;j<n;j++){

if(arr[i]>arr[j]){

temp=arr[i];

arr[i]=arr[j];

arr[j]=temp;

}

}

}

if(n%2==1)
median=arr[((n-1)/2)];
else
median=arr[n/2];

System.out.print(median);

}

}