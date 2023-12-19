import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


class Filter {

    public static  Predicate<String> nameStartingWithPrefix(String input){

        new Predicate<String>() {
            @Override
            public boolean test(String t)
            {
                return t.startsWith(input);
            }
        };
        return null;
    }
}


class Mapper {

    public static  Function<String, Integer> getDistinctCharactersCount(){

        HashSet<Character> s = new HashSet<Character>();
       return  new Function<String, Integer>() {
            @Override
            public Integer apply(String input)
            {
                for(int i = 0; i < input.length(); i++)
                {
                    s.add(input.charAt(i));
                }
                return s.size();
            }
        };
    }
}



class CharactersCount {
    private final String name;
    private final Integer distinctCharacterCount;

    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        names.stream()
                .filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }

}