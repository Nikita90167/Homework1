public class MagicBox <T> {

    private T[] items;

    public MagicBox(int count) {
        this.items = (T[]) new Object[count];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(null)) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick(){
        return ;
    }
}
