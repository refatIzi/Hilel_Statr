package homwork;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HomeWorkfour_ {
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        int number = 0;
        String name = "";
        help();
        boolean status=false;
        while (true) {
            if(status==true) break;
            try {
                command = scanner.nextLine();

                switch (command) {
                    case "a": {
                        System.out.println("Введите ID человека");
                        number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите имя");
                        name = scanner.nextLine();
                        System.out.println("Введите команду 's' для сохранения или 'w' для сохранения и просмотра:");
                        break;
                    }
                    case "w": {
                        map.put(number, name);
                        showPerson();
                        System.out.println("Введите команду:");
                        break;
                        // System.out.println(map.entrySet());
                    }
                    case "r": {
                        showPerson();
                        System.out.println("Введите команду:");
                        break;
                    }
                    case "s": {
                        map.put(number, name);
                        System.out.println("Данные сохранены");
                        System.out.println("Введите команду:");
                        break;
                    }
                    case "h": {
                        help();
                        System.out.println("Введите команду:");
                    }
                    case "q": {
                        status=true;
                        System.out.println("Досвидание!!!!!!!!!");
                        break;

                    } default: {
                        System.out.println("Вы ввели что то другое");
                    }
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
