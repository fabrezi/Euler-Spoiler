public class CloseToZero {

    //I: [1,2,3] O: 1
    //print the number closest to zero. If negative then dont count it.
    //I: [-1,1,2] O: 1
    //I: [-54,-10, 2] O: 2

    public static int close(int[]A,int N){
        int closest = A[0];
        int t;
        for(int i = 0; i < N; i++){
            for(int j = 1; j < N-1; j++){
                if(A[i] == 0){
                    closest = A[i];
                }
                if(A[i] > A[j]){
                    t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
                if(A[i] < A[j]){
                    closest = A[i];
                }
            }

        }

        return closest;

    }

    public static void main(String[] args){
        int[]A = new int[]{2,3,45,1};
        int N = 3;

        System.out.println(close(A,N));

    }
}
