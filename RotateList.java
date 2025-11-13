import java.util.*;
public class RotateList {
    public static <T> List<T> rotate(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size;
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(rotate(list, 2));
    }
}
