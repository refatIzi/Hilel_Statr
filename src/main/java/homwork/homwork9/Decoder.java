package homwork.homwork9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Decoder {


    public static void main(String[] args) throws FileNotFoundException {
        // Pattern pattern= Pattern.compile( "\\b(ПОД|ЗА|К|ИЗ|ПО|ОБ|ОТ|В|У|С|О|НАД|ОКОЛО|ПРИ|ПЕРЕД)\\b");
        File fileName = new File("./string.txt");
        Scanner scanner = new Scanner(fileName);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine().replaceAll("\\b(ПОД|ЗА|К|ИЗ|ПО|ОБ|ОТ|В|У|С|О|НАД|ОКОЛО|ПРИ|ПЕРЕД)\\b", "JAVA"));
        }
    }
}
