import java.util.*;
class NumericSum {
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list)
            sum += n.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> dblList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println(sum(intList));
        System.out.println(sum(dblList));
    }
}
