package common;
import java.util.Scanner;

public class checkNumber {
	public static void main(String[] args) {
	        
	        int n,i,flag=0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First Number: ");
	        n = sc.nextInt();
	        
//	        System.out.println("Enter Second Number: ");
//	        num2 = sc.nextInt();
//	        
        sc.close();
//	        sum = num1 + num2;
	        System.out.println("number: "+n);
	        
	        for(i=2;i<=n/2;i++) {
	        	if(checkprime(i)==1) {
	        		if(checkprime(n-i)==1) {
	        			System.out.println("Yes ");
	        			flag=1;
	        			break;
	        		}
	        		
	        	}
	        	
	        }
	        if(flag==0) {
	        	System.out.println("No ");
	        }
	        
	        System.out.println("sum: "+sumofnum(n));
	    }
	
	static int checkprime(int n) {
		int i,flag=0;
        for(i=2;i<n-1;i++) {
        	if(n%i==0) {
        		flag=1;
        		break;
        	}
        }
        
        if(flag==0) {
        	return 1;
        }
        else {
        	return 0;
        }
    }
	
	static int sumofnum(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n+sumofnum(n-1));      
  }

}
