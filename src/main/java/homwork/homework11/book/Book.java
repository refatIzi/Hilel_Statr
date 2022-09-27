package homwork.homework11.book;

import hillel.MyScanner;

import java.io.IOException;
import java.util.ArrayList;

public class Book {
    Title title;
    Author author;
    Content content;

    Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String show() {
        return title.show() + " " + author.show() + " " + content.show();
    }

    public static ArrayList<Book> books = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner(System.in);
        System.out.println("Введите данные о книге или если хотите выйти введите q");
        while (true) {

            System.out.println("Введите название книги");
            String titleBook = scanner.nextLine();
            System.out.println("Введите Автора книги");
            String authorBook = scanner.nextLine();
            System.out.println("Введите содержание книги");
            String contentBook = scanner.nextLine();

            {
                books.add(new Book(new Title(titleBook), new Author(authorBook), new Content(contentBook)));
                for (Book book : books) {
                    System.out.println(book.show());
                }
            }
            System.out.println("Хотите продолжить Y или N");
            String exit = scanner.nextLine();
            if (exit.equals("N")) break;
        }
    }

}
