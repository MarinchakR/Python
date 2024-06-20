package JavaAPI;
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

class User {
    String name;
    List<String> phones;

    public User(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        phones.add(phone);
    }
}

class Phonebook {
    Map<String, User> map;

    public Phonebook() {
        map = new HashMap<>();
    }

    public void addUserPhone(String name, String phone) {
        if (map.containsKey(name)) {
            User user = map.get(name);
            if (!user.phones.contains(phone)) {
                user.phones.add(phone);
            }
        } else {
            map.put(name, new User(name, phone));
        }
    }

    public void deleteUserPhone(String name, String phone) {
        if (map.containsKey(name)) {
            User user = map.get(name);
            user.phones.remove(phone);
            if (user.phones.isEmpty()) {
                map.remove(name);
            }
        }
    }

    public void printPhonebook() {
        List<User> userList = new ArrayList<>(map.values());
        Collections.sort(userList, (a, b) -> b.phones.size() - a.phones.size());

        for (User user : userList) {
            System.out.print(user.name + ": ");
            for (String phone : user.phones) {
                System.out.print(phone + ", ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addUserPhone("Петя", "123");
        phonebook.addUserPhone("Петя", "1234");
        phonebook.addUserPhone("Ваня", "546585");
        phonebook.addUserPhone("Катя", "8956477");
        phonebook.addUserPhone("Петя", "12356233");
        phonebook.addUserPhone("Ваня", "787897");

        phonebook.printPhonebook();
    }
}