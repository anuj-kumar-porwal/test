
import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,3,4,2,5);

        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("springboot");
        list.add("aws");

        String maxString = list.stream().max(String::compareTo).stream().findFirst().get();

        System.out.println(maxString);

        numList.stream().distinct().forEach(System.out::println);
    }
}