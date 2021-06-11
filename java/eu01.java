///////////////////////////////////
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000
/////////////////////////////////


public class eu01 {

    public static void main(String[] args){
        int sum = 0;
        for(int i =0; i < 1000; i++){
            if (i%3 == 0 || i% 5 == 0 ){
                sum = sum + i;
            }

        }
        System.out.println("sum:" + sum);


    }
}

////////////////////////////
//trial# 2
///////////////////////////

public class eu01 {

   static int multiple(int n){
       int sum = 0;
       for(int i = 0; i < n; i++){
           if(i% 3 == 0 || i % 5 == 0){
               sum = sum + i;
           }
       }
       return sum;
    }
    public static void main(String[] args){
       int n = 10;
       System.out.println(multiple(n));
    }


}
