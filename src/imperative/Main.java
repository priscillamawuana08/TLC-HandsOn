package imperative;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.FEMALE;
import static imperative.Main.Person.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        //Defining a list using "of type and Person"
        List<Person> people = List.of(
                new Person( "Sam", MALE),
                new Person( "Leticia", FEMALE),
                new Person( "Christy", FEMALE),
                new Person( "Mike", MALE),
                new Person( "Timothy", MALE)

        );
        System.out.println("// Imperative approach");
        // Imperative approach
        //define an empty list
        List<Person> females = new ArrayList<>();
        //looping through
        for (Person person : people){
            // A condition which is an if statement
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        //A "for loop" looping through female
        for(Person female : females){
            System.out.println(female);
        }
        System.out.println("// Declarative approach");
        /*
         Declarative approach
         people.stream()
              .filter(person -> FEMALE.equals(person.gender) )
              .collect(Collectors.toList())
              .forEach( System.out::println);
        */
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender) )
                .collect(Collectors.toList());
        females2.forEach( System.out::println);


    }
    //creating a static class for the list "Person"
    static class Person{
        // Attributing the list
        private final String name;
        private final Gender gender;

        //Using constructor
        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;

        }
        // Using toString to override
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        //Defining a Gender by using enum
        enum Gender{
            MALE, FEMALE
        }
    }
}
