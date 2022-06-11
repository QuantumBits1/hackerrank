package BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //sample inputs: 9, -100, 50, 0, 56.6, 90, 0.12, .12, 02.34, 000.000
        String[] arr = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        List<BigDecimal> newArr = Arrays.stream(arr)
                .map(BigDecimal::new)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        Arrays.sort(arr, Collections.reverseOrder((o1, o2) -> {
            if(o1 == null || o2 == null)
                return 0;

            BigDecimal bd01 = new BigDecimal(o1);
            BigDecimal bd02 = new BigDecimal(o2);
            return bd01.compareTo(bd02);
        }));

        for (String s:arr) {
            System.out.println(s);
        }

        System.out.println(newArr);
    }
}
