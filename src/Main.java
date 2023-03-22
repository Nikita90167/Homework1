public class Main {
    public static void main(String[] args) {
        MagicBox <String> magicBox = new MagicBox<>(5);
        magicBox.add("Nikita");
        magicBox.add("Vika");
        magicBox.add("Jastin");
        magicBox.add("Geydgi");
        magicBox.add("huuifd");
        magicBox.pick();

    }
}