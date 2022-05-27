package module1;

public class euler2 {

    static int fibo(){
        int i = 1;
        int j = 2;
        int sum = 0;

        while (i <= 4000000){
            if(i%2 == 0){
                sum = sum + i;
            }
            int k = i+j;
            i = j;
            j = k;
        }

        return sum;

    }

    public static void main(String[] args){
        System.out.println("sum is my son:=>" + fibo());

    }
}
