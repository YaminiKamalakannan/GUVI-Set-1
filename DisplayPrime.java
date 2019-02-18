import java.util.Scanner;
class DisplayPrime{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int flag=0;
for(int k=a+1;k<b;k++){

for(int i=2;i<k;i++){

if(k%i==0){
flag=1;	
break;
}
else
flag=0;
}
if(flag==0)
System.out.print(k+" ");


}
}	
}