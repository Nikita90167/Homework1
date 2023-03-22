import java.util.Random;

public class MagicBox<T> {

    private final T[] items;

    public MagicBox(int count) {
        this.items = (T[]) new Object[count];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == (null)) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() {
        int countNull = 0;
        int randomInt = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == (null)) {
                countNull += 1;
            }
        }
        if (countNull != 0) {
            throw new RuntimeException("коробка не полна и осталось ещё " + countNull + " ячеек заполнить");
        } else {
            Random random = new Random();
            randomInt = random.nextInt(items.length);
            System.out.println(items[randomInt]);
            return items[randomInt];
        }
    }
}
