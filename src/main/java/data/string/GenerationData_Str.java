package data.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationData_Str {
    private List<String> data_str;

    public GenerationData_Str(int qStr, int qW, int min, int max) {
        data_str = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < qStr; i++) {
            int wordCount = rand.nextInt(qW) + 1; // Количество слов в строке (от 1 до qW)
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < wordCount; j++) {
                int wordLength = rand.nextInt((max - min) + 1) + min; // Длина слова
                sb.append(generateRandomWord(wordLength));

                if (j < wordCount - 1) {
                    sb.append(" "); // Добавляем пробел между словами
                }
            }
            data_str.add(sb.toString());
        }
    }

    private String generateRandomWord(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (rand.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public List<String> getData_str() {
        return data_str;
    }
}
