package tutorial.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String sentence = args.length > 0 ? String.join(" ", args) : "to be or not to be";

        Map<String, Integer> counts = new HashMap<>();
        Arrays.stream(sentence.split("\\s+"))
                .map(w -> w.toLowerCase())
                .forEach(w -> counts.merge(w, 1, Integer::sum));

        System.out.println(counts);
    }
}
