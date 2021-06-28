//Given an array of integers,
// find the pair of adjacent elements that has
// the largest product and return that product.
//sample array = [3,6,-2,-5,7,3]
//O: 21

public class eu01 {

    public static int Sumo(int [] InputArray){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < (InputArray.length - 1); i++){
            int count = InputArray[i] * InputArray[i+1];
            if (count > max){
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int [] InputArray = {3,6,-2,-5,7,3};
        System.out.println("tha  max value is :" + Sumo(InputArray));
    }

}
