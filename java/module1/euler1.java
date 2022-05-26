package module1;

public class euler1 {

    public static void main(String[] args){
        int n = 1000;
        System.out.println("the sume is bonjour:" + multiple(n));

    }



    static int multiple(int n){
        int sum = 0;
        for(int i=0; i < n; i++){
            if(i%3 == 0 || i%5 == 0){
                sum = sum + i;
            }
        }

        return sum;
    }


//    public static void main(String[] args){
//        int n = 1000;
//        System.out.println("the sume is bonjour:" + multiple(n));
//
//    }
}
