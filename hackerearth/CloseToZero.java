public class CloseToZero {

    //I: [1,2,3] O: 1
    //print the number closest to zero. If negative then dont count it.
    //I: [-1,1,2] O: 1
    //I: [-54,-10, 2] O: 2

    public static int close(int[]A,int N){
        int closest = A[0];
        for(int i = 0; i < N; i++){
           if(A[i] < closest){
               closest = A[i];
           }

        }

        return closest;

    }

    public static void main(String[] args){
        int[]A = new int[]{2,3,45,1};
        int N = 4;

        System.out.println(close(A,N));

    }
}
