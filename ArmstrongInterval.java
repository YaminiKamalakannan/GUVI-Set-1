import java.util.Scanner;

class ArmstrongInterval{
	
public static void main(String[] abc){
		
Scanner s=new Scanner(System.in);
		
	
int a=s.nextInt();
		
	
int b=s.nextInt();
		
int n,i,rem,temp,count=0;
		
for(i=a+1; i<b; i++){
			
temp = i;
           
n = 0;
          
while(temp != 0){
               
rem = temp%10;
               
n = n + rem*rem*rem;
                
temp = temp/10;
            
}
			
if(i == n){
				
count++;
               
System.out.print(i+"  ");
                
            
}
		
}
		
if(count == 0)
        
{
            
System.out.print("Armstrong Number not Found between the Given Interval.");
        
}

	
}

}



