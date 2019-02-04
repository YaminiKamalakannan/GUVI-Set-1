import java.util.Scanner;
class LargestNum{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int x=a.nextInt();
Scanner b=new Scanner(System.in);
int y=b.nextInt();
Scanner c=new Scanner(System.in);
int z=c.nextInt();
if(x>y&&x>z){
System.out.println(x);
}
else if(y>x&&y>z){
System.out.println(y);
}
else if(z>x&&z>y){
System.out.println(z);
}
}
}