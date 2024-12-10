public class Fraction implements FractionInterface {
    private int numerator;
    private int denominator;
    private Double cachedValue;

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным.");
        }
        // Инициализация полей
        else {
            this.numerator = numerator;
            this.denominator = denominator;
            this.cachedValue = null; // Инициализация кэша
        }
    }

    // Свойства
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // реализация методов интерфейса
    // вычисляем и кэшируем значение дроби
    @Override
    public double getValue() {
        if (cachedValue == null) {
            cachedValue = (double) numerator / denominator;
        }
        return cachedValue;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.cachedValue = null; // Сброс кэша
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным.");
        }
        this.denominator = denominator;
        this.cachedValue = null; // Сброс кэша
    }

    // Метод toString()
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод equals() для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) obj;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

}
