import java.util.*;

public class SequenceGenerator {

    private int sizeSequence;
    private int minValue;
    private int maxValue;

    SequenceGenerator(int sizeSequence, int maxValue, int minValue){
        this.sizeSequence = sizeSequence;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int[] rnd()
    {
        maxValue -= minValue;
        int[] rndArr = new int[sizeSequence];
        for(int i = 0; i < sizeSequence; i++){
            rndArr[i] = (int) (Math.random() * ++maxValue) + minValue;
        }
        return rndArr;
    }

    public Sequence generate(){
        int[] seqGen = rnd();
        Sequence sequence = new Sequence();
        sequence.setSequenceValues(seqGen);
        return sequence;
    }
}
