import java.util.HashSet;
import java.util.Set;

public class Text {
    private final String text;

    public Text(String text) {
        this.text = text;
    }

    // метод для подсчета различных букв
    public int countDistinct() {
        Set<Character> distinctLetters = new HashSet<>();
        // преобразуем строку text в массив символов
        for (char i : text.toCharArray()) {
            if (Character.isLetter(i)) {
                // преобразуем символ i в нижний регистр
                distinctLetters.add(Character.toLowerCase(i));
            }
        }
        return distinctLetters.size();
    }

    @Override
    public String toString() {
        return "text='" + text;
    }
}
