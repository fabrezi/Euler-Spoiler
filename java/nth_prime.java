//this only checks the n value and output whether
//the value is prime or not


public class nth_prime {

    public static boolean isprime(int n){
        if(n<2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    //main method
    public static void main(String[] args){
        //int counter = 0;
        int n = 11;
        System.out.println(isprime(n));

   
}
