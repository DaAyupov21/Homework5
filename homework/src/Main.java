import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SequenceGenerator sequenceGenerator = new SequenceGenerator(10, 100, -100);
        Sequence sequence = sequenceGenerator.generate();
        Scanner scanner = new Scanner(System.in);
        sequence.printSeq();
        int temp1 = scanner.nextInt();
        sequence.append(temp1);
        temp1 = scanner.nextInt();
        System.out.println(sequence.getValueByIndex(temp1););
        temp1 = scanner.nextInt();
        int temp2 = scanner.nextInt();
        sequence.replace(temp1, temp2);
        temp1 = scanner.nextInt();
        sequence.removeByIndex(temp1);
        temp1 = scanner.nextInt();
        sequence.removeByValue(temp1);

    }
}
