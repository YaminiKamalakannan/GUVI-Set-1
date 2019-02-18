import java.util.Scanner;
class HoursMinutes{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int time=scan.nextInt();
int hr=0,min=0;
 hr=time/60;
 min=time%60;
System.out.print(hr+" "+min);
}
}