import java.util.*;
public class ElementFrequency {
    public static Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> freq = new HashMap<>();
        for (String item : list) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        return freq;
    }
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(getFrequency(items));
    }
}
