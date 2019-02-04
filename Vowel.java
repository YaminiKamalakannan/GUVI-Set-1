import java.util.Scanner;

class Vowel{

public static void main(String[] args){

Scanner abc=new Scanner(System.in);

String c=abc.next();

char input=c.toLowerCase().charAt(0);
if((input=='a')||(input=='e')||(input=='i')||(input=='o')||(input=='u')){

System.out.println("Vowel");

}

else{

System.out.println("Consonant");

}

}

}
