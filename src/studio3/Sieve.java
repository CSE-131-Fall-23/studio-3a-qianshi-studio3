package studio3;

import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        boolean[] primes=new boolean[n+1];
        
        for(int i =0;i<=n;i++) {
        	primes[i]=true;
        }
        for(int p=2;p<=n;p++){
        	if(primes[p]) {
        		for (int i=p*2;i<=n;i+=p) {
        			primes[i]=false;
        		}
        	} 
            
        } 
        for(int i=2;i<=n;i++) {
        	if(primes[i]) {
        		System.out.println(i);
        	}
        }
        
    }
}
