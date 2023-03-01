
import java.util.Arrays;

public class ReduceWithTwoParameters {
    public static void main(String[] args) {
        String[] grades = {"one"," two"," three"," four"};

        // initial reduce with 3 parameters
        StringBuilder concat1 = Arrays.stream(grades)
                .reduce(new StringBuilder(),
                        (sb, s) -> sb.append(s),
                        (sb1, sb2) -> sb1.append(sb2));

        // final reduce with 2 parameters , done with the help of method references
        StringBuilder concat2 = Arrays.stream(grades)
                .map(StringBuilder::new)   // we can put this also --> (s -> new StringBuilder(s))
                .reduce(new StringBuilder(),
                        (sb1, sb2) -> sb1.append(sb2));


        System.out.println(concat1);
        System.out.println(concat2);
        

    }
}