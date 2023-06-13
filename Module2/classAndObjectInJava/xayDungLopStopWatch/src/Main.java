import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[100000];
        StopWatch stopWatch = new StopWatch();
        for(int i=0;i<100000;i++){
            arr[i] = Math.floor((Math.random() * 100000));
        }
        System.out.println(stopWatch.getStartTime());
        Arrays.sort(arr);
        System.out.println(stopWatch.getEndTime());
    }
}
