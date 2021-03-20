import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MyStreamFlatMap {
    public static void main(String[] args) {
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .flatMap(human -> human.getPets().stream())
                .collect(Collectors.toList());

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]
    }


    static class Human {
        private final String name;
        private final List<String> pets;

        public Human(String name, List<String> pets) {
            this.name = name;
            this.pets = pets;
        }

        public String getName() {
            return name;
        }

        public List<String> getPets() {
            return pets;
        }

        //constructors, getters
    }
}