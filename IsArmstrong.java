import java.util.Scanner;
class IsArmstrong{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int temp=N,dig=0,cube=1,arm=0;
while(temp!=0){
dig=temp%10;
for(int i=0;i<3;i++){
cube=cube*dig;
}

arm=arm+cube;
temp=temp/10;
cube=1;
}
if(N==arm)
System.out.println("yes");
else
System.out.println("no");
}
}