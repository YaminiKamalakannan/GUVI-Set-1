import java.util.Scanner;

class IsPalindrome{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);

int num=scan.nextInt();

int res=0,rem=0;

int ab=num;
while(ab!=0){

rem=ab%10;

res=(res*10)+rem;

ab=ab/10;

}



if(num==res)
System.out.println("yes");
else
System.out.println("no");




}
}
