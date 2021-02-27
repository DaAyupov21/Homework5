import java.util.Arrays;

public class SequenceObserver {
    public static void update(String event, int value, Sequence sequence){
        System.out.println();
        System.out.println("Operation is " + event + " value: " + value);
        System.out.println(Arrays.toString(sequence.getSequenceValues()));
        System.out.println();
    }
}
