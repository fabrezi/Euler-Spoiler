///////////////////////////////
//this solution is not mine
////////////////////////////

public class nth_prime_finder {
    public static void main(String[] args){
        int numPrimes = 0; //prime-counter
        int testNum = 1;
        while(numPrimes < 10){
            testNum++;
            if(isPrime(testNum)){
                numPrimes++;
            }
        }
        System.out.println(testNum);
    }

    public static boolean isPrime(int n){
        for (int a = 2; a <= n/2; a++)
            if (n%a == 0){
                return false;
            }
        return true;
    }


}

////////////////////////////////////
//this solution is my implemetation
//////////////////////////////////////
