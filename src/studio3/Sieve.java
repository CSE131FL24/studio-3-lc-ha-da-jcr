package studio3;
import java.util.Scanner;
public class Sieve {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt(); 
    boolean[] isComposite = new boolean[n-1];
    int i = 2;
    while (i < Math.sqrt(n)) {
    	int count = i;
    	for (int x = i+count-2; x <= n-2; x += count) {
    		isComposite[x] = true;
    	}
    	i++;
    	while (isComposite[i-2]) {
    	i++;	
    	}
    }
    int numPrimes = 0;
    for (int y=0; y<=n-2; y++) {
    	if(!isComposite[y]) {
    		//System.out.println(y+2);
    		numPrimes++;
    	}
    }
    System.out.println(numPrimes);
}
}
    