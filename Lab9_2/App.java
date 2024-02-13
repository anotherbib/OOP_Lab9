public class App {
    public static void main(String[] args) {
        GameProcessor processor = new GameProcessor();
        processor.setGame(new Football());
        processor.start();

        processor.setGame(new Basketball());
        processor.start();
    }
}
