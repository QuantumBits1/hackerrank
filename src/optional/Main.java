package optional;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> times = (x,y) -> x * y;

        Optional<Integer> val1 = Optional.of(1);
        Optional<Integer> val2 = Optional.of(2);

        var res = compute(times, val1, val2);
        res.ifPresent(integer -> System.out.println("res: " + integer));

        var res2 = optionalAdd(val1, val2);
        res2.ifPresent(integer -> System.out.println("res2: " + integer));

        var res3 = optionalAddUsingFlatMap(val2, Optional.empty());
        res3.ifPresentOrElse(integer -> System.out.println("res3: " + integer), () -> System.out.println("result is empty"));
    }

    public static <A, B, R> Optional<R> compute(BiFunction<A, B, R> operation, Optional<A> oa, Optional<B> ob) {
        return oa.flatMap(a -> ob.map(b -> operation.apply(a, b)));
    }

    public static Optional<Integer> optionalAdd(Optional<Integer> val1, Optional<Integer> val2) {
        if(val1.isPresent() && val2.isPresent())
            return Optional.of(val1.get() + val2.get());
        return Optional.empty();
    }

    //Using flatmap (a.k.a bind)
    public static Optional<Integer> optionalAddUsingFlatMap(Optional<Integer> val1, Optional<Integer> val2) {
        return val1.flatMap(first -> val2.flatMap(second -> Optional.of(first + second)));
    }


}
