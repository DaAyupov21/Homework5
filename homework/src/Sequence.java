import java.util.Arrays;
import java.util.Scanner;

public class Sequence {
    private int[] sequenceValues;
    private int size;

    public int[] getSequenceValues() {
        return sequenceValues;
    }

    public int getSize() {
        return size;
    }

    public void setSequenceValues(int[] sequenceValues) {
        size = sequenceValues.length;
        this.sequenceValues = sequenceValues;
    }
    public void printSeq(){
        System.out.println(Arrays.toString(sequenceValues));
        System.out.println();
    }
    // добавить число в последовательность
    public void append(int value){
        int[] copy = new int[size+1];
        for (int i = 0; i < sequenceValues.length; i++){
            copy[i] =sequenceValues[i];
        }
        copy[size] = value;
        sequenceValues = copy;
        size++;
        SequenceObserver.update("Append", value, this);
    }
    // удалить число по индексу
    public void removeByIndex(int index){
        int[] copy = new int[size-1];
        for (int i = 0, j = 0; i < size; i++){
            if (i != index){
                copy[j++] = sequenceValues[i];
            }
        }
        sequenceValues = copy;
        size = sequenceValues.length;
        SequenceObserver.update("Remove by index", index, this);
    }
    //Удалить число по значению
    public void removeByValue(int value){
        int[] copy = new int[size-1];
        for (int i = 0, j = 0; i < size; i++){
            if (sequenceValues[i] != value){
                copy[j++] = sequenceValues[i];
            }
        }
        sequenceValues = copy;
        size = sequenceValues.length;
        SequenceObserver.update("remove by value", value, this);
    }
    //Получить знвчение по индексу
    public int getValueByIndex(int index){

            if (index >= sequenceValues.length){
                System.err.println("Ваш индекс не входит в размерность массива, попробуйте ввести индекс еще раз");
                Scanner scanner = new Scanner(System.in);
                index = scanner.nextInt();

        }
        SequenceObserver.update("Get value by index", sequenceValues[index], this);
        return sequenceValues[index];

    }

    //Вставить элемент в индекс
    public void replace(int value, int index){
        sequenceValues[index] = value;
        SequenceObserver.update("replace", value, this);
    }

    //вставить со сдвигом
    public void insert(int value, int index){
        sequenceValues = Arrays.copyOf(sequenceValues, size + 1);
        for (int i = index; i < size; i++){
            sequenceValues[i+1] = sequenceValues[i];
        }
        sequenceValues[index] = value;
        SequenceObserver.update("Insert", value, this);
    }

}
