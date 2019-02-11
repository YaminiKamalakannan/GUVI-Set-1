import java.util.Scanner;
class Alpha{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
char ch=scan.next().toUpperCase().charAt(0);
if(ch>62 && ch<91)
System.out.println("Alphabet");
else
System.out.println("No");
}
}