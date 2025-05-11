public class Reduce {
    public static void reduce(int num){
        int numLoop = 0;
        while (num != 0) {
            num = redGeti(num);
            numLoop ++;

        }
        System.out.println(numLoop);
    }

    public static int redGeti(int i){
        boolean even = i % 2 == 0;

        if (even) {
            return i/2;
        }
        else {
            return i-1;
        }
    }
}
