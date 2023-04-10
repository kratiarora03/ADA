import java.util.Arrays;

public class practical_5 {

    public static void main(String[] args) {
        double capacity = 60;
        double weights[] = {40, 10, 30};
        double value[] = {100, 20, 120};
        double ratio[] = new double[value.length];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = value[i] / weights[i];
        }
        Arrays.sort(ratio);
        double ans = 0, a = 0;
        int size = weights.length;
        System.out.println("Ratios: ");
        for (int j = ratio.length - 1; j >= 0; j--) {
            for (int i = 0; i < size; i++) {
                if (ratio[j] == (value[i] / weights[i])) {
                    if (capacity >= weights[i]) {
                        ans = ans + value[i];
                        capacity = capacity - weights[i];
                        a = value[i];
                    } else if (capacity < weights[i]) {
                        ans = ans + ((capacity / weights[i]) * value[i]);
                        a = ((capacity / weights[i]) * value[i]);
                    }
                    System.out.print(a + " ");
                    break;
                }
            }
        }
        System.out.println("\n" + ans);
    }
}

