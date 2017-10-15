/*

Goldbach's conjecture:
"Every even integer greater than two can be expressed as the sum of two primes"

See wikipedia:
https://en.wikipedia.org/wiki/Goldbach%27s_conjecture

*/

class GoldbachConjecture {

    /**
     * Check if p is prime
     */
    private static boolean isPrime(int p) {
        if (p<2) return false;
        if (p>2 && p % 2 == 0) return false;
        for(int i=3; i<=Math.sqrt(p); i+=2)
            if (p % i == 0) return false;        
        return true;
        
    }
    
    
    /**
     * Find one of the goldbach primes of p
     */
    private static int goldbach(int p) {
        if (p<=2 || p%2!=0) {
            System.err.println(p+" is not a even greater than 2");
            return -1;
        }
        int goldbach = 2;
        
        while(!isPrime(p-goldbach)) {
            do {
                goldbach++;
            } while(!isPrime(goldbach));
        }    
        return goldbach;
    }



    /**
     * Obtain the goldbach decomposition if many even numbers
     */
    public static void main(String[] args) {
        System.out.println("Search goldbach pairs for 10 random even numbers");
        int p;
        for(int i=0; i<10; i++) {
            // Make sure p is a random even number
            do {
                p = (int) (Math.random()*Integer.MAX_VALUE);
            } while(p % 2 != 0);
            int g = goldbach(p);
            System.out.println(p+" = "+g+" + "+(p-g));
        }
        
    }

}


