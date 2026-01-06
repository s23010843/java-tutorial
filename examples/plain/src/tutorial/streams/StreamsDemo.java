package tutorial.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> words = List.of("sam", "li", "asha", "saman", "alan");

        List<String> result = words.stream()
                .filter(w -> w.length() >= 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);

        Map<Character, List<String>> byFirstLetter = words.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0)));

        System.out.println(byFirstLetter);
    }
}
