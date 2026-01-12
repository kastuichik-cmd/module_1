package com.traineeship;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class TextAnalyzerTask {
    private static final Set<Character> VOWELS = Set.of(
            'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
            'a', 'e', 'i', 'o', 'u'
    );
    private static final Pattern WORD_SPLIT_PATTERN = Pattern.compile("[^\\p{L}]+");

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите предложение: ");
            String input = scanner.nextLine();

            TextStatistics stats = analyzeText(input);

            System.out.println("Количество слов: " + stats.wordCount());
            System.out.println("Количество гласных символов: " + stats.vowelCount());
            System.out.println("Количество согласных символов: " + stats.consonantCount());
        }
    }

    private static TextStatistics analyzeText(String input) {
        if (input == null || input.isBlank()) {
            return new TextStatistics(0, 0, 0);
        }
        String lowerCaseInput = input.toLowerCase();
        int wordCount = WORD_SPLIT_PATTERN.split(lowerCaseInput).length;

        long vowelCount = lowerCaseInput.chars()
                .filter(i -> Character.isLetter(i) && VOWELS.contains((char) i))
                .count();

        long consonantCount = lowerCaseInput.chars()
                .filter(i -> Character.isLetter(i) && !VOWELS.contains((char) i))
                .count();
        return new TextStatistics(wordCount, vowelCount, consonantCount);
    }

    private record TextStatistics(int wordCount, long vowelCount, long consonantCount) {
    }
}
