
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        List<User> list = new ArrayList<User>();

        User vasya = new User("vasya", 20);
        User petya = new User("petya", 31);
        User sveta = new User("sveta", 18);
        User sveta2 = new User("sveta", 18);
        User stepan = new User("stepan", 60);
        User slava = new User("slavar", 15);
        User tamara = new User("tamara", 99);
        User vladimir = new User("vladimir", 15);

        list.add(vasya);
        list.add(petya);
        list.add(sveta2);
        list.add(sveta);
        list.add(vladimir);
        list.add(tamara);
        list.add(slava);
        list.add(stepan);

        System.out.println(getOldestUser(list).toString());
    }

    public static User getOldestUser (Collection <User> users) {

       return users.stream()
                .distinct()
                .sorted(Comparator.comparing(User::getAge).thenComparing(User::getName))
                .max((Comparator.comparing(User::getAge)))
                .orElse(null);
    }
}