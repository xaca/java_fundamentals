import java.util.Arrays;

public class CalculatePrimes {	
	/**
	 * Returns array of prime numbers smaller than given input number 
	 * using Sieve of Eratosthenes algorithm.
	 * @param max the number which gives the upper bound for primes
	 * @return	primes smaller than max number
	 */
	public static int[] findPrimes(int max) {
        Boolean[] isPrime = new Boolean [max];
        int numberOfPrimes = 0, i, j, p;
        
        if (max < 2) //no primes smaller than 2
        	return new int[0];
        
        isPrime[0] = false; // 0 is not a prime
        isPrime[1] = false; // 1 is also not a prime
        
        //Start with 2 as it is the smallest prime number
        for(i = 2; i < max; i++ )
            if(isPrime[i]== null){ //the number which isn't filtered yet is a prime
            	isPrime[i] = true;
                p = i;
                numberOfPrimes++;
                //all numbers that are a factor of p are not prime numbers
                for(j = p*2; j < max; j = j+p) 
                    isPrime[j] = false;
            }
        
        int[] primes = new int[numberOfPrimes];
        j = 0;
        
        for(i = 2; i < max; i++)
            if(isPrime[i]){
                primes[j] = i;
                j++;
            }
        
        return primes;
    }
	
    public static void main(String args[]) {
    	// It might be better to use ArrayList instead of arrays
    	// to prevent resize of this array.
        int[] values = new int[10];

        values = findPrimes(20);
        System.out.println( Arrays.toString(values));
    }
}
