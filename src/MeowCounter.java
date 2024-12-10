public class MeowCounter {
    private int meowCount = 0;

    public void meowsCare(Meowable m, int times) {
        for (int i = 0; i < times; i++) {
            m.meow();
            meowCount++;
        }
    }

    public int getMeowCount() {
        return meowCount;
    }

    @Override
    public String toString() {
        return "Количество мяу:  " + meowCount;
    }
}
