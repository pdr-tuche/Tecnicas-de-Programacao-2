package exercicio.um;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person jhenyfer = new Person("Jhenyfer Lima", 19);
        Person pedro = new Person("Pedro Neves", 24);
        Person samuel = new Person("Samuel Primo", 18);
        Person kayanne = new Person("Kayanne Kikuti", 18);
        Person nivaldo = new Person("Nivaldo Lucas", 18);

        people.add(jhenyfer);
        people.add(pedro);
        people.add(samuel);
        people.add(kayanne);
        people.add(nivaldo);

        people.forEach(elem -> System.out.println(elem));

        Person older = getOlder(people);
        System.out.println("a pessoa mais velha é: " + older.getName() + " com " + older.getAge() + " anos");

        Person younger = getYounger(people);
        System.out.println("a pessoa mais nova é: " + younger.getName() + " com " + younger.getAge() + " anos");

        System.out.println("a media de idade é de: " + oldMedia(people));
    }

    public static Person getOlder(List<Person> list) {
        Person older = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (older.getAge() < list.get(i).getAge()) {
                older = list.get(i);
            }
        }
        return older;
    }

    public static Person getYounger(List<Person> list) {
        Person younger = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (younger.getAge() > list.get(i).getAge()) {
                younger = list.get(i);
            }
        }
        return younger;
    }

    public static double oldMedia(List<Person> list) {
        int aux = list.stream().mapToInt(elem -> elem.getAge()).sum();
        //Optional<Integer> aux = list.stream().map(person -> person.getAge()).reduce((a, b) -> a + b);
        return aux / list.size();

    }
}
