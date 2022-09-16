import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingBy {


    public static void main(String[] args) {

        List<String> names = Arrays.asList ("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");

        Map<Integer, Long> result = names.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        Map<Integer, List<String>> result1 = names.stream().collect(Collectors.groupingBy(String::length));

        System.out.println (result);
        System.out.println (result1);
    }
}


