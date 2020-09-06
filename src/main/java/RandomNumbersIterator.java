import java.util.Iterator;
import java.util.Random;

public class RandomNumbersIterator implements Iterator<Integer> {
    private final Random random;
    private final int min;
    private final int max;

    public RandomNumbersIterator(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randomInt(this.min, this.max);
    }

    private int randomInt(int min, int max) {
        int randomNumber = random.nextInt((max - min + 1)) + min;
        return randomNumber;
    }
}