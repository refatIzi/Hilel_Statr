package homwork;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HomeWorkfour {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String command;
        int number = 0;
        String name = "";
        System.out.println("Вы вошли в картотеку абонентов для ввода данных введите 'a':");
        while (true) {
            try {
                command = scanner.nextLine();
                if (command.equals("a")) {
                    System.out.println("Введите ID человека");
                    number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите имя");
                    name = scanner.nextLine();
                    System.out.println("Для того чтобы начать заново вводить данные введиет 'a'\n"
                            + "Для сохранения  изменения и просомтра введиет 'w'\n"
                            + "Для сохранения  изменения введите 's'\n"
                            + "Для выхода из системы без изменений введите 'q'");
                } else if (command.equals("w")) {
                    map.put(number, name);
                    Set<Integer> idPersons = map.keySet();
                    for (Integer idPerson : idPersons) {
                        String personName = map.get(idPerson);
                        System.out.println("ID: " + idPerson + " Name: " + personName);
                    }
                    // System.out.println(map.entrySet());
                } else if (command.equals("s")) {
                    map.put(number, name);
                    System.out.println("Данные сохранены");

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
}
