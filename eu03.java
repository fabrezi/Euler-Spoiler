public class eu03 {

    static long primo(long n){
        long factor = 1;
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                 factor = i;

                while(n % i == 0){
                    n = (n/i);
                }
            }
        }
        return factor;

    }

    public static void main(String[] args){
        long n = 600851475143L;
        System.out.println(primo(n));
    }
}
