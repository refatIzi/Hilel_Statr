package homwork;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HomeWorkfour {
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        int number = 0;
        String name = "";
        help();
        while (true) {
            try {
                command = scanner.nextLine();
                if (command.equals("a")) {
                    System.out.println("Введите ID человека");
                    number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите имя");
                    name = scanner.nextLine();
                    System.out.println("Введите команду 's' для сохранения или 'w' для сохранения и просмотра:");

                } else if (command.equals("w")) {
                    map.put(number, name);
                    showPerson();
                    System.out.println("Введите команду:");
                    // System.out.println(map.entrySet());
                } else if (command.equals("r")) {
                    showPerson();
                    System.out.println("Введите команду:");
                } else if (command.equals("s")) {
                    map.put(number, name);
                    System.out.println("Данные сохранены");
                    System.out.println("Введите команду:");
                } else if (command.equals("h")) {
                    help();
                    System.out.println("Введите команду:");
                } else if (command.equals("q")) {
                    System.out.println("Досвидание!!!!!!!!!");
                    break;
                } else {
                    System.out.println("Вы ввели что то другое");
                }
            } catch (Exception e) {
                System.out.println("Введите число");
                scanner.next();
            }
        }
    }

    public static void help() {
        System.out.println("Для того чтобы начать вводить данные введиет 'a'\n"
                + "Для сохранения  изменения и просомтра введиет 'w'\n"
                + "Для просомтра данных введиет 'r'\n"
                + "Для сохранения  изменения введите 's'\n"
                + "Для простмора команд введите 'h'\n"
                + "Для выхода из системы без изменений введите 'q'");
    }

    public static void showPerson() {
        Set<Integer> idPersons = map.keySet();
        for (Integer idPerson : idPersons) {
            String personName = map.get(idPerson);
            System.out.println("ID: " + idPerson + " Name: " + personName);
        }
    }
}
