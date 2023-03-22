public class Main {
    public static void main(String[] args) {
        MagicBox <Integer> magicBox = new MagicBox<>(5);
        magicBox.add(1);
        magicBox.add(2);
        magicBox.add(3);
        magicBox.pick();
    }
}