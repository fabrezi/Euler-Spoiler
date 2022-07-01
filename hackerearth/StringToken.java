public class StringToken {

    public static void main(String[] args){
        int count=0;
        String s = "I hate u 'gghiiu' veryraelra 'fafaefa' ";
        String noob = s.trim();
        String[] shoom = noob.split(" ");
        //System.out.println(shoom);

        for(int i=0; i< shoom.length;i++){
            count++;
        }

        System.out.println(count);
    }
}
