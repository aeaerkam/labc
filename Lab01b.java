/**
 * @(#)Lab01b.java
 *
 * Lab01b application: Program which manipulates an IntBag instance('bag') to efficiently compute & display the first 100 prime numbers by making 
 *					   use of the fact that a number is prime if and only if it is not divisible by any prime less than itself.
 *
 * @author: Abdullah Erkam Arslan 
 * @version 1.00 2014/2/18
 */
 
public class Lab01b 
{
    
    public static void main(String[] args) 
    {	
    	// Variables
		IntBag primes = new IntBag();
		int currentNumber;
		int num = 0;
	
		currentNumber = 3;
		primes.add(2);
			
		// While loop for filling the 'primes' object which is an instance of the IntBag class
		while(primes.size() < 100)
		{	
			
			for(int i = 0; i < primes.size(); i++)
			{
				
				if(currentNumber % primes.get(i) != 0)
				{
					num = currentNumber;				
				}	
				
				// Increment and pass the current number if it is divisible by any of the primes less than itself
				else
				{
					currentNumber++; 
					
					// set i to -1 to scan the list from the index 0.(since i will be incremented by one before starting a new loop. )  
					i = -1;	 
				}	
			}
			
			// After a for loop the num will be a prime
			primes.add(num);	
				
		}
		
		System.out.println("First 100 prime numbers are: ");
		System.out.println(primes); 	
    }
}
