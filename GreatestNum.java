import java.util.Scanner;
class GreatestNum{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();

int b=x.nextInt();

int c=x.nextInt();

if(a>b&&a>c){
System.out.println(a);
}
else if(b>a&&b>c){
System.out.println(b);
}
else{
System.out.println(c);
}
}
}
